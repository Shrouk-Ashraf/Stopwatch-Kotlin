package com.example.stopwatch.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ButtonItem(name:String, action :()->Unit){
    Button(
        onClick = action,
        modifier = Modifier.size(80.dp,40.dp),
        shape = RoundedCornerShape(15.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xffFE7A7A),
        ),
    ) {

        Text(text = name,
            color = Color.White, fontSize = 12.sp,)

    }
}