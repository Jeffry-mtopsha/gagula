package com.example.mvvmkotlin.ui.about

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.mvvmkotlin.navigation.ROUTE_SHOP

@Composable
fun about(navController: NavController){

    LazyColumn {
        item {
            Column {
                Text("about page",
                    modifier = Modifier
                        .clickable {navController.navigate(ROUTE_SHOP)}

                    )


                }

            }


        }




    }










