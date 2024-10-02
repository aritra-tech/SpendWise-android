package com.aritra.spendwise.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aritra.spendwise.ui.presentation.SplashScreen

@Composable
fun Navigation(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .then(modifier)
    ) {
        NavHost(
            navController = navController,
            startDestination = "splash_screen"
        ) {
            composable(route = Screens.SplashScreen.name) {
                SplashScreen(
                    navController
                )
            }
        }
    }
}