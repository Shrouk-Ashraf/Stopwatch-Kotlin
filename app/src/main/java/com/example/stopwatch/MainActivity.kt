package com.example.stopwatch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.stopwatch.ui.theme.StopwatchTheme

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<StopwatchViewModel>()
    private var time ="00:00:00"
    private var timeProgress =0f
    private var timeLaps = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            StopwatchTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    time = viewModel.time
                    timeProgress = viewModel.progress
                    timeLaps = viewModel.timeLaps
                    StopwatchPreview(time = time, viewModel,timeProgress,timeLaps)

                }
            }
        }
    }
}

