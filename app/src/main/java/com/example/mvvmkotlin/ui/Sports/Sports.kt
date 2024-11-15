package com.example.mvvmkotlin.ui.sports

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.mvvmkotlin.navigation.ROUTE_SCHOOL

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.mvvmkotlin.navigation.ROUTE_SPORTS

@Composable
fun Sports(navController: NavHostController) {


    LazyColumn {

        item {
            Spacer(modifier = Modifier.height(15.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxSize()
                    .background(Color.LightGray)

            ) {

                Row {
                    Column {
                        AsyncImage(
                            model = "https://img.freepik.com/free-photo/sports-tools_53876-138077.jpg",

                            contentDescription = "null",
                            modifier = Modifier
                                .size(100.dp)
                        )


                        Text("Games Time")

                        Text("Morning games")

                    }


                }


                Spacer(modifier = Modifier.height(20.dp))

                Row {
                    Card {

                        Column {


                            AsyncImage(
                                model = "https://samburunationalreservekenya.com/wp-content/uploads/2024/04/IMG_0870.jpg",
                                contentDescription = "null",
                                modifier = Modifier
                                    .size(100.dp)
                            )

                            Text("swimming")


                        }
                    }


                    Spacer(modifier = Modifier.width(20.dp))


                    Row {
                        Card {

                            Column {


                                AsyncImage(
                                    model = "https://images2.minutemediacdn.com/image/upload/c_crop,w_3482,h_1958,x_0,y_0/c_fill,w_720,ar_16:9,f_auto,q_auto,g_auto/images/GettyImages/mmsport/229/01j56v7kkkj1kh07s64h.jpg",
                                    contentDescription = "null",
                                    modifier = Modifier
                                        .size(100.dp)
                                )

                                Text("basketball")


                            }
                        }
                    }

                }


                Spacer(modifier = Modifier.width(20.dp))


                Row {
                    Card {

                        Column {


                            AsyncImage(
                                model = "https://cdn.shopify.com/s/files/1/0449/6644/5210/files/7_blog_pic_1_480x480.png?v=1633597368",
                                contentDescription = "null",
                                modifier = Modifier
                                    .size(100.dp)
                            )

                            Text("badminton")


                            Text("Evening games")
                        }
                    }


                    Spacer(modifier = Modifier.height(20.dp))


                    Row {
                        Card {

                            Column {


                                AsyncImage(
                                    model = "https://www.hindustantimes.com/ht-img/img/2024/09/22/550x309/SOCCER-ENGLAND-MCI-ARS-REPORT-159_1727027765895_1727027840241.JPG",
                                    contentDescription = "null",
                                    modifier = Modifier
                                        .size(100.dp)
                                )

                                Text("foot ball")


                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))


                Row {
                    Card {

                        Column {


                            AsyncImage(
                                model = "https://scrummage.co.ke/wp-content/uploads/2023/02/kenya-7s-e1677467620276.png",
                                contentDescription = "null",
                                modifier = Modifier
                                    .size(100.dp)
                            )

                            Text("rugby")
                        }
                    }
                }


                Spacer(modifier = Modifier.width(20.dp))


                Row {
                    Card {


                        Column {


                            AsyncImage(
                                model = "https://i.cbc.ca/1.6823771.1682547852!/fileImage/httpImage/image.jpg_gen/derivatives/16x9_780/boxing-fight-22042023.jpg",
                                contentDescription = "null",
                                modifier = Modifier
                                    .size(100.dp)
                            )

                            Text("boxing")


                        }
                    }
                }
                Spacer(modifier = Modifier.width(60.dp))

                Button(onClick = { navController.navigate(ROUTE_SCHOOL) }) {

                    Text("View school")
                }


            }
        }

    }
}

















