package com.example.mvvmkotlin.ui.contacts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun contacts(navController: NavController){
    LazyColumn {
        item {
            Column {

                Text("Insert your name",
                    modifier = Modifier
                        .clickable {  }

                    )








            }


        }


    }

}