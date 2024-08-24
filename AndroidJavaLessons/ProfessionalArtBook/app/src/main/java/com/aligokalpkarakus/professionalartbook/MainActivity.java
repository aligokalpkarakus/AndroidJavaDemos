package com.aligokalpkarakus.professionalartbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.add_art, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.add_art){
            //intent
            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayList<String> artNameList = new ArrayList<String>();
        ArrayList<Bitmap> artImageList = new ArrayList<Bitmap>();

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, artNameList);
        listView.setAdapter(arrayAdapter);

        String Url = "content://" + ArtContentProvider.PROVIDER_NAME;
        Uri artUri = Uri.parse(Url);

        ContentResolver contentResolver = getContentResolver();

        Cursor cursor = contentResolver.query(artUri, null, null, null, "name");

        if(cursor != null){

            int artIx = cursor.getColumnIndex(ArtContentProvider.NAME);
            int imageIx = cursor.getColumnIndex(ArtContentProvider.IMAGE);

            if (artIx != -1 && imageIx != -1) {
                while (cursor.moveToNext()) {

                    artNameList.add(cursor.getString(artIx));
                    byte[] bytes = cursor.getBlob(imageIx);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                    artImageList.add(bitmap);
                    arrayAdapter.notifyDataSetChanged();
                }
            }
        }

    }
}








