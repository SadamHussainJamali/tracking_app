package com.saddam.trackingapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters


@Database(entities = [Run::class], version = 1, exportSchema = false)
@TypeConverters(Converter::class)
abstract class RoomDB : RoomDatabase() {


    abstract fun getRoomDao(): RunDao
}