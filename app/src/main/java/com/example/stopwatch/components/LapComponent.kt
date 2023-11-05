package com.example.stopwatch.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign


@Composable
fun LapItem(time: String, index: Int) {
    Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()) {
        Text(text = "Lap $index", textAlign = TextAlign.Start)
        Text(text = "$time", textAlign = TextAlign.End)
    }
}