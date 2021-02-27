package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.popUpTo
import com.example.androiddevchallenge.model.Doggo
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun DogListItem(dog: Doggo, navController: NavHostController, index: Int) {
    Card(
        elevation = 16.dp,
        shape = RoundedCornerShape(32.dp),
        modifier = Modifier
            .padding(8.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy((-15).dp),
            modifier = Modifier.clickable {
                navController.navigate("dogDetail/$index") {
                    popUpTo(route = "dogList") {}
                }
            },
        ) {
            Image(
                painter = painterResource(id = dog.photo),
                contentDescription = "Doggo Pics",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(150.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .padding(16.dp)
            ) {
                Column {
                    Text(text = dog.name, style = typography.body1, fontWeight = FontWeight.Bold)
                    Text(text = dog.shortDescription, style = typography.overline)
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.padding(top = 4.dp)
                    ) {
                        Chip(content = dog.age)
                        Chip(content = dog.gender)
                    }
                }
            }
        }
    }
}
