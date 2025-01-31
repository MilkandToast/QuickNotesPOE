// Navigation.kt
// Navigation.kt
package com.example.quicknotespoe.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quicknotespoe.ui.theme.EditNoteScreen

@Composable
fun QuickNotePoeApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "splash"
    ) {
        composable("splash") { SplashScreen(navController) }
        composable("login") { LoginScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("settings") { SettingsScreen(navController) }

        // 🔥 Added edit note screen with dynamic noteId parameter
        composable("edit_note/{noteId}") { backStackEntry: NavBackStackEntry ->
            val noteId = backStackEntry.arguments?.getString("noteId") ?: ""
            EditNoteScreen(
                navController = navController,
                noteId = noteId
            )


        }
    }
}