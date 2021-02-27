package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.model.Doggo
import com.example.androiddevchallenge.ui.components.DogListItem
import com.example.androiddevchallenge.ui.components.Header
import com.example.androiddevchallenge.ui.theme.accentPink2
import com.example.androiddevchallenge.ui.theme.typography

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DogDetailScreen(navController: NavHostController, index: String = "0") {
    val dog = Doggo.getDoggoList().plus(Doggo.getDoggoList())[index.toInt()]
    Surface(color = accentPink2, modifier = Modifier.fillMaxHeight()) {
        Column {
            Header(false)
            Box(modifier = Modifier.padding(32.dp)) {
                DogListItem(dog, navController, -1)
            }
            Text(
                text = "Details",
                style = typography.body2,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 32.dp, end = 32.dp, top = 32.dp)
            )
            Text(
                text = stringResource(id = dog.longDescription),
                style = typography.body1,
                modifier = Modifier.padding(horizontal = 32.dp)
            )
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .padding(32.dp)
                    .fillMaxWidth()
            ) {
                Text("Adopt Now!", modifier = Modifier.padding(8.dp))
            }
        }
    }
}
