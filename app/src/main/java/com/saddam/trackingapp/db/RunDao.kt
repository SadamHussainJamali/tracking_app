package com.saddam.trackingapp.db

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface RunDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM running_table ORDER BY timestamp DESC;")
    fun getRunsSortedByDate(): LiveData<List<Run>>


    @Query("SELECT * FROM running_table ORDER BY averageSpeedKPH DESC;")
    fun getRunsSortedByAverageSpeed(): LiveData<List<Run>>


    @Query("SELECT * FROM running_table ORDER BY distanceInMeter DESC;")
    fun getRunsSortedByDistance(): LiveData<List<Run>>


    @Query("SELECT * FROM running_table ORDER BY timeInMillis DESC;")
    fun getRunsSortedByRunTime(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY caloriesBurned DESC;")
    fun getRunsSortedByCalories(): LiveData<List<Run>>


    @Query("SELECT SUM(distanceInMeter) FROM running_table;")
    fun getTotalDistance(): LiveData<Int>

    @Query("SELECT SUM(caloriesBurned) FROM running_table;")
    fun getTotalCalories(): LiveData<Int>

    @Query("SELECT SUM(timeInMillis) FROM running_table;")
    fun getTotalTime(): LiveData<Long>


}