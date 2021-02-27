package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.accentBlue
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun Header(isMain: Boolean = true) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = 24.dp,
        shape = RoundedCornerShape(
            topStart = 0.dp,
            topEnd = 0.dp,
            bottomStart = 32.dp,
            bottomEnd = 32.dp
        )
    ) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(32.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_paw),
                    contentDescription = "Paw Icon"
                )
                Text(
                    text = "Doggo Adoption",
                    modifier = Modifier.padding(start = 16.dp),
                    style = typography.h5,
                    fontWeight = FontWeight.Bold
                )
            }
            if (isMain) {
                Row(
                    modifier = Modifier.padding(start = 32.dp, end = 32.dp, bottom = 32.dp)
                ) {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        elevation = 8.dp,
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(modifier = Modifier.padding(8.dp), text = "Search")
                            Box(
                                modifier = Modifier
                                    .background(
                                        color = accentBlue,
                                        shape = RoundedCornerShape(10.dp)
                                    )
                                    .size(40.dp),
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.ic_search),
                                    contentDescription = "Search Icon",
                                    colorFilter = ColorFilter.tint(color = Color.White),
                                    contentScale = ContentScale.Inside,
                                    modifier = Modifier.size(40.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
