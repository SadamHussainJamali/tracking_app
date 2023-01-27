package com.saddam.trackingapp.repositories

import com.saddam.trackingapp.db.Run
import com.saddam.trackingapp.db.RunDao
import javax.inject.Inject

class MainRepo @Inject constructor(private val dao: RunDao) {

    suspend fun insertRun(run: Run) = dao.insertRun(run)
    suspend fun deleteRun(run: Run) = dao.deleteRun(run)

    fun getRunsSortedByDate() = dao.getRunsSortedByDate()
    fun getRunsSortedByAverageSpeed() = dao.getRunsSortedByAverageSpeed()
    fun getRunsSortedByDistance() = dao.getRunsSortedByDistance()
    fun getRunsSortedByRunTime() = dao.getRunsSortedByRunTime()
    fun getRunsSortedByCalories() = dao.getRunsSortedByCalories()
    fun getTotalDistance() = dao.getTotalDistance()
    fun getTotalCalories() = dao.getTotalCalories()
    fun getTotalTime() = dao.getTotalTime()
}