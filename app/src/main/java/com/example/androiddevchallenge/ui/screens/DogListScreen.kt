package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.model.Doggo
import com.example.androiddevchallenge.ui.components.DogListItem
import com.example.androiddevchallenge.ui.components.Header
import com.example.androiddevchallenge.ui.theme.accentPink2

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DogListScreen(navController: NavHostController) {
    val dogs = Doggo.getDoggoList().plus(Doggo.getDoggoList())
    Surface(color = accentPink2) {
        Column {
            Header()
            LazyVerticalGrid(
                cells = GridCells.Fixed(2),
                contentPadding = PaddingValues(24.dp),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                itemsIndexed(dogs) { index, dog ->
                    DogListItem(dog, navController, index)
                }
            }
        }
    }
}
