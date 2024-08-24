package com.aligokalpkarakus.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        User myUser = new User();
        myUser.name = "Gökalp";
        myUser.job = "Instructor";

        User newUser = new User();
        newUser.name = "Kirk";
        newUser.job = "Musician";
         */

        User myUser = new User("Gökalp","Instructor");

        System.out.println(myUser.name);

        //Encapsulation, eğer private olmasaydı değişkenler buradan değiştirilebilirdi.
        Musician musician = new Musician("James","Guitar",50);
        System.out.println(musician.getName());
        musician.setAge(60);
        System.out.println(musician.getAge());

        //Inheritance
        SuperMusician lars = new SuperMusician("Lars","Drums",55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Polymorphism
        //Static
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(5,3,4));

        //Dynamic
        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test();
        barley.sing();

        User userrrr = new User("Gökalp","qwe");
        System.out.println(userrrr.information());

        //Abstract interface
        Piano myPiano = new Piano();
        myPiano.brand = "Yamaha";
        myPiano.digital = true;
        myPiano.info();

    }
}