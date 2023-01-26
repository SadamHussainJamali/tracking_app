package com.saddam.trackingapp.db

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface RunDao {

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM running_table ORDERED BY timestamp DESC")
    suspend fun getRunsSortedByDate():LiveData<List<Run>>


    @Query("SELECT * FROM running_table ORDERED BY averageSpeedKPH DESC")
    suspend fun getRunsSortedByAverageSpeed():LiveData<List<Run>>


    @Query("SELECT * FROM running_table ORDERED BY distanceInMeter DESC")
    suspend fun getRunsSortedByDistance():LiveData<List<Run>>


    @Query("SELECT * FROM running_table ORDERED BY timeInMillis DESC")
    suspend fun getRunsSortedByRunTime():LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDERED BY caloriesBurned DESC")
    suspend fun getRunsSortedByCalories():LiveData<List<Run>>


    @Query("SELECT SUM(distanceInMeter) FROM running_table")
    suspend fun getTotalDistance():LiveData<Int>

    @Query("SELECT SUM(caloriesBurned) FROM running_table")
    suspend fun getTotalCalories():LiveData<Int>

    @Query("SELECT SUM(timeInMillis) FROM running_table")
    suspend fun getTotalTime():LiveData<Long>



}