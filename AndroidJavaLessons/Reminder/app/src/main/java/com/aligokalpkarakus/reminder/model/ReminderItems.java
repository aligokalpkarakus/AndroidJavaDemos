package com.aligokalpkarakus.reminder.model;

public class ReminderItems {

    String note;
    String dateTime;

    public ReminderItems(String note, String dateTime) {
        this.note = note;
        this.dateTime = dateTime;
    }

    public String getNote() {
        return note;
    }

    public String getDateTime() {
        return dateTime;
    }
}
