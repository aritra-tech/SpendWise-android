package com.aritra.spendwise.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aritra.spendwise.ui.presentation.OnboardingScreen
import com.aritra.spendwise.ui.presentation.SplashScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
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

            composable(route = Screens.OnboardingScreen.name) {
                OnboardingScreen(
                    navController
                )
            }
        }
    }
}