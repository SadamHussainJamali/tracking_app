package com.saddam.trackingapp.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.saddam.trackingapp.others.Constants.ROOM_DATA_BASE_NAME


@Entity(tableName = ROOM_DATA_BASE_NAME)
data class Run(
    val img: Bitmap? = null,
    var timestamp: Long = 0L,
    var averageSpeedKPH: Float = 0f,
    var distanceInMeter: Int = 0,
    var timeInMillis: Long = 0L,
    var caloriesBurned: Int = 0
){
    @PrimaryKey(true)
    var id:Int?=null
}