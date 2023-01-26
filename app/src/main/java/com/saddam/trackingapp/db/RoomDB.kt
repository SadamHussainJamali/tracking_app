package com.saddam.trackingapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters


@Database(entities = [Run::class], version = 1)
@TypeConverters(Converter::class)
abstract class RoomDB : RoomDatabase() {


    abstract fun getRoomDataBase(): RunDao
}