package com.example.mvvmkotlin.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvmkotlin.ui.Courses.Courses
import com.example.mvvmkotlin.ui.Meals.meals
import com.example.mvvmkotlin.ui.School.School
import com.example.mvvmkotlin.ui.about.about
import com.example.mvvmkotlin.ui.address.address
import com.example.mvvmkotlin.ui.contacts.contacts
import com.example.mvvmkotlin.ui.home.home
import com.example.mvvmkotlin.ui.product.InsertProductsScreen
import com.example.mvvmkotlin.ui.product.ViewProductsScreen
import com.example.mvvmkotlin.ui.school2.school2
import com.example.mvvmkotlin.ui.services.services
import com.example.mvvmkotlin.ui.shop.shop
import com.example.mvvmkotlin.ui.sports.Sports
import com.example.mvvmkotlin.ui.sports.Sports


@Composable
fun AppNavHost(

    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_HOME


) {

    NavHost(


        navController = navController,
        startDestination = startDestination
    ) {

        composable(ROUTE_HOME) {

            home(navController)


        }

        composable(ROUTE_ABOUT) {

            about(navController)

        }


        composable(ROUTE_SHOP) {
            shop(navController)
        }



        composable(ROUTE_SERVICES) {
            services(navController)
        }

        composable(ROUTE_ADDRESS) {
            address(navController)
        }

        composable(ROUTE_CONTACTS) {
            contacts(navController)
        }

        composable(ROUTE_INSERT) {
            InsertProductsScreen(navController)

        }

        composable(ROUTE_VIEWPRODUCTS) {
            ViewProductsScreen(navController)
        }


        composable(ROUTE_SCHOOL) {
            School(navController)

        }


        composable(ROUTE_SCHOOL2) {
            school2(navController)
        }

        composable(ROUTE_MEALS) {
            meals(navController)
        }



        composable(ROUTE_SPORTS) {
            Sports(navController)
        }

        composable(ROUTE_COURSES)
        {
            Courses(navController)
        }


    }}









