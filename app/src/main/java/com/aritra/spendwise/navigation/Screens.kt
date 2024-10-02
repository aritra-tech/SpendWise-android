package com.aritra.spendwise.navigation

sealed class Screens(val name: String) {

    data object SplashScreen : Screens("splash_screen")
    data object HomeScreen : Screens("home_screen")
    data object SettingsScreen : Screens("settings_screen")
}