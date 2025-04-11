package com.example.gentrier.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.gentrier.presentation.feature.example.ExampleScreen
import com.example.gentrier.presentation.feature.session.active.ActiveSessionScreen
import com.example.gentrier.presentation.feature.session.detail.SessionDetailScreen
import com.example.gentrier.presentation.feature.session.history.SessionHistoryScreen
import com.example.gentrier.presentation.feature.home.HomeScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onStartSession = { navController.navigate(Screen.ActiveSession.route) },
                onViewHistory = { navController.navigate(Screen.SessionHistory.route) }
            )
        }
        
        composable(Screen.ActiveSession.route) {
            ActiveSessionScreen(
                onFinishSession = { sessionId ->
                    navController.navigate(Screen.SessionDetail.createRoute(sessionId)) {
                        popUpTo(Screen.Home.route)
                    }
                },
                onCancel = {
                    navController.popBackStack()
                }
            )
        }
        
        composable(Screen.SessionHistory.route) {
            SessionHistoryScreen(
                onSessionSelected = { sessionId ->
                    navController.navigate(Screen.SessionDetail.createRoute(sessionId))
                },
                onBackPressed = {
                    navController.popBackStack()
                }
            )
        }
        
        composable(
            route = Screen.SessionDetail.route,
            arguments = Screen.SessionDetail.arguments
        ) { backStackEntry ->
            val sessionId = backStackEntry.arguments?.getString(Screen.SessionDetail.SESSION_ID_ARG) ?: ""
            SessionDetailScreen(
                sessionId = sessionId,
                onBackPressed = {
                    navController.popBackStack()
                }
            )
        }
        
        // Keep the example screen for reference
        composable(Screen.Examples.route) {
            ExampleScreen()
        }
    }
}

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object ActiveSession : Screen("active_session")
    data object SessionHistory : Screen("session_history")
    data object Examples : Screen("examples")
    
    data object SessionDetail : Screen("session_detail/{sessionId}") {
        const val SESSION_ID_ARG = "sessionId"
        val arguments = listOf(
            navArgument(SESSION_ID_ARG) {
                type = NavType.StringType
                nullable = false
            }
        )
            
        fun createRoute(sessionId: String): String {
            return "session_detail/$sessionId"
        }
    }
} 