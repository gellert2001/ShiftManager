package com.example.schedule

import android.os.Build
import androidx.annotation.RequiresApi
import java.sql.Time
import java.time.LocalDate
import java.util.Date
import java.time.Duration
import java.time.LocalDateTime

class Post(private var day: LocalDate,private var timeBegin: LocalDateTime, private var timeEnd: LocalDateTime ) {
    fun getDay():LocalDate{return this.day;}
    fun getBegin(): LocalDateTime {return this.timeBegin;}
    fun getEnd(): LocalDateTime{return this.timeEnd;}

    @RequiresApi(Build.VERSION_CODES.O)
    fun calcWorkingHrs(): Duration? {return Duration.between(timeBegin,timeEnd)}

    @RequiresApi(Build.VERSION_CODES.O)
    fun durationToNumber(duration: Duration): Double {
        return duration.toMinutes() / 60.0
    }

}