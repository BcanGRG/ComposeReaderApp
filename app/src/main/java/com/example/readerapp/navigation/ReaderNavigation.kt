package com.example.readerapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.readerapp.screens.SplashScreen
import com.example.readerapp.screens.home.HomeScreen
import com.example.readerapp.screens.login.LoginScreen
import com.example.readerapp.screens.search.SearchScreen

@Composable
fun ReaderNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ReaderScreens.SplashScreen.name,
    ) {
        composable(ReaderScreens.SplashScreen.name) {
            SplashScreen(navController)
        }

        composable(ReaderScreens.ReaderHomeScreen.name) {
            HomeScreen(navController)
        }

        composable(ReaderScreens.LoginScreen.name){
            LoginScreen(navController)
        }

        composable(ReaderScreens.SearchScreen.name) {
            SearchScreen(navController)
        }
    }
}