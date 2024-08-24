package com.aligokalpkarakus.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("On Create Called");
        testMethod();

        System.out.println(math(3,5));
        System.out.println(newMethod("Gökalp"));
        makeMusicians();
    }

    public void makeSimpsons(){
        Simpsons homer = new Simpsons("Homer", 50, "Nuclear");
        System.out.println(homer.getName());

    }



    public void makeMusicians(){
        Musicians james = new Musicians("James", "Guitar", 50);
        System.out.println(james.instrument);

    }









    public void testMethod(){
        int x = 4 + 4;
        System.out.println("value of x = " + x);
    }

    public int math(int a, int b){
        return a + b;
    }

    public String newMethod(String string){
        return string + " new Method";
    }

    @Override
    protected void onResume() {
        System.out.println("On Resume Called");
        super.onResume();
    }

    @Override
    protected void onStop() {
        System.out.println("On Stop Called");
        super.onStop();
    }

    @Override
    protected void onPause() {
        System.out.println("On Pause Called");
        super.onPause();
    }
}