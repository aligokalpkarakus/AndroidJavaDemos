package com.aligokalpkarakus;

public class Statements {
    public static void main(String[] args) {
        //eşitlik falan


        int day = 2;
        String dayString = "";

        switch (day){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            default:
                dayString = "Sunday";
                break;
        }

        System.out.println(dayString);
    }
}
