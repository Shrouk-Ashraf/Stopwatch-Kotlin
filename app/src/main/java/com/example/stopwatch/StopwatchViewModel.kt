package com.example.stopwatch

import android.os.Handler
import android.os.Looper
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class StopwatchViewModel : ViewModel() {
    private var isRunning = false
    private var timerSeconds =0
    var timeLaps = ArrayList<String>()
    private val handler by mutableStateOf( Handler(Looper.getMainLooper()))
    var time by mutableStateOf("00:00:00")
    var progress by mutableStateOf(0f)
    private val runnable by mutableStateOf( object :Runnable{
        override fun run() {
            timerSeconds++
            val hours = timerSeconds/3600
            val minutes= (timerSeconds%3600)/60
            val seconds = timerSeconds %60

            time = String.format("%02d:%02d:%02d",hours,minutes,seconds)
            progress = (timerSeconds%60)/60f
            handler.postDelayed(this,1000)
        }

    })

    fun StartTimer(){
        if(!isRunning) {
            handler.postDelayed(runnable, 1000)
            isRunning = true
        }
    }

    fun StopTimer(){
        if(isRunning) {
            handler.removeCallbacks(runnable)
            isRunning = false
        }
    }

    fun ResetTimer(){
        StopTimer()
        timerSeconds=0
        time ="00:00:00"
        progress = 0f
        timeLaps= ArrayList()
    }

    fun SaveTime(){
        if(isRunning){
            timeLaps.add(time)
            println(timeLaps)
        }
    }
}