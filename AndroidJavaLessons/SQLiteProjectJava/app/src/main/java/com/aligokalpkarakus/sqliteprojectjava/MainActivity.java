package com.aligokalpkarakus.sqliteprojectjava;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            SQLiteDatabase database = this.openOrCreateDatabase("Musicians",MODE_PRIVATE,null);
            database.execSQL("CREATE TABLE IF NOT EXISTS musicians (id INTEGER PRIMARY KEY, name VARCHAR,age INT)");

            //database.execSQL("INSERT INTO musicians (name,age) VALUES ('James',50)");
            //database.execSQL("INSERT INTO musicians (name,age) VALUES ('Lars',60)");
            //database.execSQL("INSERT INTO musicians (name,age) VALUES ('Kirk',55)");

            //Filtreleme
            //Cursor cursor = database.rawQuery("SELECT * FROM musicians WHERE name = 'James'",null);
            //Cursor cursor = database.rawQuery("SELECT * FROM musicians WHERE age > 52",null);

            Cursor cursor = database.rawQuery("SELECT * FROM musicians",null);

            //Güncelleme
            //database.execSQL("UPDATE musicians SET age = 61 WHERE name = 'Lars'");
            //database.execSQL("UPDATE musicians SET name = 'Kirk Hammett' WHERE id = 3");

            //Silme
            database.execSQL("DELETE FROM musicians WHERE id = 2"); //lars silindi

            //Cursor cursor = database.rawQuery("SELECT * FROM musicians WHERE name LIKE '%s'",null);//s ile bitenler gelecek james

            //Cursor cursor = database.rawQuery("SELECT * FROM musicians WHERE name LIKE 'K%'",null);//K ile başlayan gelecek Kirk

            int nameIx = cursor.getColumnIndex("name");
            int ageIx = cursor.getColumnIndex("age");
            int idIx = cursor.getColumnIndex("id");

            while(cursor.moveToNext()){
                System.out.println("Id:" + cursor.getString(idIx));
                System.out.println("Name: " + cursor.getString(nameIx));
                System.out.println("Age: " + cursor.getString(ageIx));
            }


        }catch (Exception e){
            e.printStackTrace();
        }










    }
}