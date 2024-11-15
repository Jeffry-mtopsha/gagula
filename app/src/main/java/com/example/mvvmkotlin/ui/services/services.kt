package com.example.mvvmkotlin.ui.services

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.mvvmkotlin.navigation.ROUTE_ADDRESS

@Composable
fun services(navController:NavController){

    LazyColumn {
        item {
            Column {
                Text("Welcome to our services",
                    modifier = Modifier
                        .clickable { navController.navigate(ROUTE_ADDRESS) }



                    )

                }


            }


        }


    }




