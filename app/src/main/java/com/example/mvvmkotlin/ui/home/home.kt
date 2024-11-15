package com.example.mvvmkotlin.ui.home

import android.content.ClipData.Item
import android.text.Layout.Alignment
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage

import com.example.mvvmkotlin.navigation.ROUTE_ABOUT
import com.example.mvvmkotlin.navigation.ROUTE_INSERT
import com.example.mvvmkotlin.navigation.ROUTE_SCHOOL
import com.example.mvvmkotlin.navigation.ROUTE_SCHOOL2
import com.example.mvvmkotlin.navigation.ROUTE_VIEWPRODUCTS

@Composable
fun home(navController: NavController){

  LazyColumn{

      item {
          Column (

              modifier = Modifier
                  .fillMaxHeight()
                  .fillMaxSize()
                  .fillParentMaxWidth(),


              verticalArrangement = Arrangement.SpaceAround,





          ){

              Spacer(modifier = Modifier.padding(20.dp))
              Text("Home page",
                      modifier = Modifier
                          .clickable { navController.navigate(ROUTE_ABOUT) }

                  )

              Spacer(modifier = Modifier.padding(20.dp))

//                 Text("go to about")


              AsyncImage(
                  model = "https://pimpmyrideautomotives.co.ke/wp-content/uploads/2021/02/cropped-Garage-ruaka-pimp-my-ride-automotive-01-1.png",
                  contentDescription = null,
                  modifier = Modifier
                      .fillMaxHeight()
                      .fillMaxSize()


              )

              Spacer(modifier = Modifier.padding(20.dp))


              Text("insert",
                  modifier = Modifier
                      .clickable { navController.navigate(ROUTE_INSERT) }



                  )
              Spacer(modifier = Modifier.padding(20.dp))


              Text("viewproducts",
                  modifier = Modifier
                      .clickable { navController.navigate(ROUTE_VIEWPRODUCTS) }




                  )


              Button(onClick =  {navController.navigate(ROUTE_SCHOOL2) }){

                  Text("view school2")

              }














          }



          }
      }


  }
































