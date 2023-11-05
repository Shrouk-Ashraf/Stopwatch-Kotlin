package com.example.stopwatch

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.stopwatch.components.*


@Composable
fun StopwatchPreview(
    time: String,
    viewModel: StopwatchViewModel,
    timeProgress: Float,
    timeLaps: ArrayList<String>
) {
        Column (modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(15.dp),
            verticalArrangement = Arrangement.SpaceAround
        ){
            TimerItem(timeProgress, time)
            LazyColumn(modifier = Modifier
                .background(Color(0xffFDD6D6), shape = RoundedCornerShape(20.dp))
                .fillMaxWidth()
                .height(250.dp)
                ){
                items(timeLaps){
                    var index = timeLaps.indexOf(it)
                    LapItem(it,index)
                }
            }
            Column() {
                Row(horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 25.dp)){
                    ButtonItem(name = "Start", action = {viewModel.StartTimer()})
                    ButtonItem(name = "Reset", action = {viewModel.ResetTimer()})
                }

                Row (horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 18.dp)){

                    ButtonItem(name = "Stop", action = {viewModel.StopTimer()})
                    ButtonItem(name = "Save", action = {viewModel.SaveTime()})

                }
            }

        }
}
