package com.example.stopwatch.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TimerItem(timeProgress: Float, time: String) {
    Box(
        Modifier
            .fillMaxWidth(), contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            progress = timeProgress,
            modifier = Modifier.size(150.dp),
            strokeWidth = 5.dp,
            color = Color(0xffFE7A7A)
        )
        Text(text = time, fontSize = 20.sp, color = Color.White, textAlign = TextAlign.Center)
    }
}

