package com.meet.navigationdrawerjc.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.meet.navigationdrawerjc.screens.HomeScreen
import com.meet.navigationdrawerjc.screens.NotificationScreen
import com.meet.navigationdrawerjc.screens.ProfileScreen
import com.meet.navigationdrawerjc.screens.SettingScreen

/**
 * @author Coding Meet
 * Created 17-01-2024 at 02:22 pm
 */

@Composable
fun SetUpNavGraph(
    navController: NavHostController,
    innerPadding: PaddingValues
) {
    NavHost(navController = navController,
        startDestination = Screens.Home.route){
        composable(Screens.Home.route){
            HomeScreen(innerPadding = innerPadding)
        }
        composable(Screens.Notification.route){
            NotificationScreen(innerPadding = innerPadding)
        }
        composable(Screens.Profile.route){
            ProfileScreen(innerPadding = innerPadding)
        }

        composable(Screens.Setting.route){
            SettingScreen(innerPadding = innerPadding)
        }
    }
}