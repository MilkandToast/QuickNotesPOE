// SettingsScreen.kt
package com.example.quicknotespoe.ui.theme

import androidx.compose.runtime.Composable
import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth

// SettingsScreen.kt
@Composable
fun SettingsScreen(navController: NavController) {
    val context = LocalContext.current
    val auth = FirebaseAuth.getInstance()
    val sharedPreferences = remember {
        context.getSharedPreferences("app_prefs", Context.MODE_PRIVATE)
    }

    // Biometric toggle state (default: enabled)
    var isBiometricEnabled by remember {
        mutableStateOf(sharedPreferences.getBoolean("biometric_enabled", true))
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Biometric Authentication Toggle
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Enable Biometric Authentication",
                modifier = Modifier.weight(1f)
            )
            Switch(
                checked = isBiometricEnabled,
                onCheckedChange = {
                    isBiometricEnabled = it
                    sharedPreferences.edit()
                        .putBoolean("biometric_enabled", it)
                        .apply()
                }
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Logout Button
        Button(
            onClick = {
                auth.signOut() // Firebase logout
                navController.navigate("login") {
                    popUpTo("home") { inclusive = true } // Clear back stack
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Log Out")
        }
    }
}