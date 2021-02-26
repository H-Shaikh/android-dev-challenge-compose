package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.accentPink2
import com.example.androiddevchallenge.ui.theme.purple500
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun Chip(content: String) {
    Text(
        text = content,
        style = typography.caption,
        color = purple500,
        modifier = Modifier
            .background(color = accentPink2, shape = RoundedCornerShape(6.dp))
            .padding(3.dp)
    )
}
