package com.example.androiddevchallenge

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.screens.DogDetailScreen
import com.example.androiddevchallenge.ui.screens.DogListScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "dogList") {
        composable("dogList") {
            DogListScreen(navController)
        }

        composable("dogDetail") {
            DogDetailScreen(
                navController
            )
        }
    }
}
