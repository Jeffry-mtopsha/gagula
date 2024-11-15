package com.example.mvvmkotlin.ui.shop

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.mvvmkotlin.navigation.ROUTE_SERVICES

@Composable
fun shop(navController: NavController){

    LazyColumn {
        item {
            Column {
                    Text("this is my shop",
                        modifier = Modifier
                            .clickable { navController.navigate(ROUTE_SERVICES) }

                    )


                }




            }
        }



    }














