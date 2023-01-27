package com.saddam.trackingapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.saddam.trackingapp.db.RoomDB
import com.saddam.trackingapp.others.Constants.ROOM_DATA_BASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDataBase(@ApplicationContext app: Context): RoomDB {
        return Room.databaseBuilder(app, RoomDB::class.java, ROOM_DATA_BASE_NAME).build()
    }


    @Singleton
    @Provides
    fun provideRunningDao(db:RoomDB) =db.getRoomDao()
}