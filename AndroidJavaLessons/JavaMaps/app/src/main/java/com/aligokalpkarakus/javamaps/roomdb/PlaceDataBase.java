package com.aligokalpkarakus.javamaps.roomdb;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.aligokalpkarakus.javamaps.model.Place;

@Database(entities = {Place.class}, version = 1)
public abstract class PlaceDataBase extends RoomDatabase {
    public  abstract  PlaceDao placeDao();


}
