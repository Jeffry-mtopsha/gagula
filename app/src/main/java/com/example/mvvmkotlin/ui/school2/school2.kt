package com.example.mvvmkotlin.ui.school2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.mvvmkotlin.navigation.ROUTE_COURSES
import com.example.mvvmkotlin.navigation.ROUTE_MEALS
import com.example.mvvmkotlin.navigation.ROUTE_SCHOOL
import com.example.mvvmkotlin.navigation.ROUTE_SCHOOL2
import com.example.mvvmkotlin.navigation.ROUTE_SPORTS
import com.example.mvvmkotlin.navigation.ROUTE_VIEWPRODUCTS
import com.example.mvvmkotlin.ui.School.School

@Composable
fun school2(navController: NavController){


    LazyColumn (
        modifier = Modifier

            .background(Color.White)
            .fillMaxSize()
            .fillMaxWidth()

        ,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//





    ) {

        item {

            Column(
                modifier = Modifier

                    .background(Color.White)
                    .fillMaxSize()
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center


            )

            {


                Column(
                    modifier = Modifier

                        .background(Color.White)
                        .fillMaxSize()
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center


                )


                {
                    Spacer(modifier = Modifier.height(50.dp))





                    AsyncImage(
                        model = "https://www.emobilis.ac.ke/images/logo.jpg",

                        contentDescription = "null"
                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    Text(
                        "Welcome to",
                        modifier = Modifier,
                        style = TextStyle(fontSize = 30.sp),
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic


                    )
                    Text(
                        "our school",
                        modifier = Modifier,
                        style = TextStyle(fontSize = 20.sp),
                        fontWeight = FontWeight.Bold,

                        fontStyle = FontStyle.Italic


                    )


                }


//


                AsyncImage(
                    model = "https://assets.collegedunia.com/public/college_data/images/studyabroad/appImage/college_1090_29-15:00_o-HARVARD-UNIVERSITY-BUILDING-facebook.jpeg",
                    modifier = Modifier
                        .size(400.dp),

                    contentDescription = "null"
                )




                Spacer(modifier = Modifier.height(100.dp))


//                    Row {
//
//
//
//                        Text("staff")
//                        Spacer(modifier = Modifier.width(100.dp))
//
//
//                        Text("Student")
//                        Spacer(modifier = Modifier.width(100.dp))
//
//
//                        Text("others")
//
//
//                    }


                Spacer(modifier = Modifier.height(15.dp))



                Button(onClick = { navController.navigate(ROUTE_SCHOOL) }) {

                    Text(" Students info")

                }





                Button(onClick = { navController.navigate(ROUTE_VIEWPRODUCTS) }) {

                    Text(" view Meals/view sports")

                }

                Button(onClick = { navController.navigate(ROUTE_COURSES) }) {

                    Text(" Courses offered",
                            modifier = Modifier,
                        style = TextStyle(fontSize = 20.sp),
                        fontWeight = FontWeight.Bold,

                        fontStyle = FontStyle.Italic


                    )


//
//                Button(onClick =  {navController.navigate(ROUTE_SPORTS) }){
//
//                    Text(" View Sports")
//
//                }


                    Spacer(modifier = Modifier.height(200.dp))

//                    Text("CREATE ACCOUNT")


                }


            }


        }
    }}