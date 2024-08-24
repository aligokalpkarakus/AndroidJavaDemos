package com.aligokalpkarakus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {

        String[] myStringArray = new String[3];

        myStringArray[0] = "James";
        myStringArray[1] = "Lars";
        myStringArray[2] = "Kirk";

        System.out.println( myStringArray[0]);
        System.out.println( myStringArray[1]);
        System.out.println( myStringArray[2]);

        int[] myIntegerArray = new int[3];
        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;
        myIntegerArray[2] = 70;

        System.out.println( myIntegerArray[0]);
        System.out.println( myIntegerArray[1]);
        System.out.println( myIntegerArray[2]);

        int[] myNumberArray = {1,2,3,4,5,6,7};
        System.out.println(myNumberArray[2]);
        
        //Lists

        ArrayList<String> myMusicians = new ArrayList<String>();
        myMusicians.add("James");
        myMusicians.add("Lars");
        myMusicians.add(1,"Kirk");
        myMusicians.add("Rob");
        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));
        System.out.println(myMusicians.size());

        //Set

        HashSet<String> mySet = new HashSet<String>();
        mySet.add("James");
        mySet.add("James"); // set aynı değerleri birden fazla almıyor
        System.out.println(mySet.size());

        //HashMap

        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("name","James");
        myHashMap.put("instrument","Guitar");
        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));

        HashMap<String,Integer> mySecondMap = new HashMap<String, Integer>();
        mySecondMap.put("run",100);
        mySecondMap.put("basketball",200);
        System.out.println(mySecondMap.get("run"));
        System.out.println(mySecondMap.get("basketball"));
    }
}
