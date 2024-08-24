package com.aligokalpkarakus.oopproject;

public class User extends  People{

    //Property

    String name;
    String job;

    //Constructor

    public User(String name, String job) {
        this.name = name;
        this.job = job;
        System.out.println("User Created.");
    }
}
