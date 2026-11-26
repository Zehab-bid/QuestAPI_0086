package com.example.myapplication.uicontroller

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.uicontroller.route.DestinasiEntry
import com.example.myapplication.uicontroller.route.DestinasiHome

@Composable
fun DataSiswaApp(navController: NavHostController =
                     rememberNavController(), modifier: Modifier){
    HostNavigasi(navController = navController)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(navController = navController, startDestination =
        DestinasiHome.route, modifier = Modifier ){
        composable(DestinasiHome.route) {
            HomeScreen(navigateToItemEntry = { navController.navigate
                (DestinasiEntry.route) },
            )
        }
        composable(DestinasiEntry.route){
            EntrySiswaScreen(navigateBack = { navController.navigate
                (DestinasiHome.route) })
        }
    }
}