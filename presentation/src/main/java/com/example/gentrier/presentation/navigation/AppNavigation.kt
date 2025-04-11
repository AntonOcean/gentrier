package com.example.gentrier.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.gentrier.presentation.feature.example.ExampleScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Examples.route
    ) {
        composable(Screen.Examples.route) {
            ExampleScreen()
        }
        // Add more destinations here
    }
}

sealed class Screen(val route: String) {
    data object Examples : Screen("examples")
    // Add more screens here
} 