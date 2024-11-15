package com.example.mvvmkotlin.ui.Courses


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
import com.example.mvvmkotlin.navigation.ROUTE_MEALS
import com.example.mvvmkotlin.navigation.ROUTE_SCHOOL
import com.example.mvvmkotlin.navigation.ROUTE_SCHOOL2
import com.example.mvvmkotlin.navigation.ROUTE_SPORTS
import com.example.mvvmkotlin.navigation.ROUTE_VIEWPRODUCTS
import com.example.mvvmkotlin.ui.School.School

@Composable
fun Courses(navController: NavController){


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
            Spacer(modifier = Modifier.height(30.dp))
            Column(
                modifier = Modifier

                    .background(Color.LightGray)
                    .fillMaxSize()
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center


            )

            {

             Row {
               Text("Lakewood",
                       modifier = Modifier,
                   style = TextStyle(fontSize = 20.sp),
                   fontWeight = FontWeight.Bold,

                   fontStyle = FontStyle.Italic




               )
                 Spacer(modifier = Modifier.width(15.dp))


                 AsyncImage(
                     model = "https://t4.ftcdn.net/jpg/02/38/94/05/240_F_238940516_0BihE7YocY9vpgClPDDWuuaLneDwxtWn.jpg",

                     contentDescription = "null"
                 )


                 Spacer(modifier = Modifier.width(15.dp))


                 Text("School",
                         modifier = Modifier,
                     style = TextStyle(fontSize = 20.sp),
                     fontWeight = FontWeight.Bold,

                     fontStyle = FontStyle.Italic










                 )






             }

                Spacer(modifier = Modifier.width(15.dp))

                        Text("NAIROBI CAMPUS",
                                modifier = Modifier,
                            style = TextStyle(fontSize = 20.sp),
                            fontWeight = FontWeight.Bold,

                            fontStyle = FontStyle.Italic



                        )








                Text("SEPTEMBER 2024",
                        modifier = Modifier,
                    style = TextStyle(fontSize = 20.sp),
                    fontWeight = FontWeight.Bold,

                    fontStyle = FontStyle.Italic



                )
                Spacer(modifier = Modifier.width(35.dp))


                  Text("INTAKE ON GOING",
                          modifier = Modifier,
                      style = TextStyle(fontSize = 20.sp),
                      fontWeight = FontWeight.Bold,

                      fontStyle = FontStyle.Italic

                  )

                Spacer(modifier = Modifier.height(10.dp))


                AsyncImage(
                    model = "https://cdn.unicaf.org/websites/unicaf/sites/3/wp-content/uploads/2023/06/b2qGF7MF-u4ou9XC0-UU-african-graduates.jpg",
                    contentDescription = "null"
                )



                Spacer(modifier = Modifier.height(80.dp))


                 Text("Minimum Entry Requirements")

                Spacer(modifier = Modifier.width(15.dp))


                Text(".Postgraduate :Degree")
                Spacer(modifier = Modifier.width(10.dp))


                Text(".Degree : C+ and above")
                Spacer(modifier = Modifier.width(10.dp))



                Text(".Diploma:C or C-")
                Spacer(modifier = Modifier.width(10.dp))



                Text(".Certificate:D+")
                Spacer(modifier = Modifier.width(10.dp))



                Text(".D:certificate in Nutrition&Dietics")
                Spacer(modifier = Modifier.width(10.dp))



                Spacer(modifier = Modifier.height(50.dp))


                 Text("Contact us",
                         modifier = Modifier,
                     style = TextStyle(fontSize = 20.sp),
                     fontWeight = FontWeight.Bold,

                     fontStyle = FontStyle.Italic



                 )

                Spacer(modifier = Modifier.width(15.dp))


                 Row {
                     AsyncImage(
                         model = "https://cdn-icons-png.flaticon.com/256/455/455705.png",

                         contentDescription = "null",
                                 modifier = Modifier
                                 .size(30.dp)


                     )
                     Spacer(modifier = Modifier.width(10.dp))
                     Text("0784385211")


                 }



                Row {
                    AsyncImage(
                        model = "https://i.pinimg.com/736x/14/d7/5b/14d75bf8577bfea661086277ffe713f8.jpg",

                        contentDescription = "null",
                        modifier = Modifier
                            .size(30.dp)

                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text("opposite Hazina Towers")
                    Spacer(modifier = Modifier.height(100.dp))

                }





























            }}}}