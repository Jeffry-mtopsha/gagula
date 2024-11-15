package com.example.mvvmkotlin.ui.Meals

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.mvvmkotlin.navigation.ROUTE_MEALS
import com.example.mvvmkotlin.navigation.ROUTE_SCHOOL
import com.example.mvvmkotlin.navigation.ROUTE_SPORTS

@Composable
fun meals(navController: NavHostController) {

LazyColumn {

    item {





        Card() {
            Row {
                Column {
                    AsyncImage(
                        model = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Good_Food_Display_-_NCI_Visuals_Online.jpg/300px-Good_Food_Display_-_NCI_Visuals_Online.jpg",

                        contentDescription = "null"
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text("meals offered")

                    Text("Morning meal")

                }

                Spacer(modifier = Modifier.height(5.dp))

                AsyncImage(
                    model = "https://example.com/school.png",
                    contentDescription = "null"
                )


            }
            Spacer(modifier = Modifier.height(15.dp))


            Row {
                Card {

                    Column {


                        AsyncImage(
                            model = "https://i0.wp.com/mayuris-jikoni.com/wp-content/uploads/2022/11/kenyan-chapati-1-copy.jpg?resize=1152%2C1536&ssl=1",
                            contentDescription = "null"
                        )

                        Text("Chapati")


                    }
                }
            }

            Spacer(modifier = Modifier.width(15.dp))


            Row {
                Card {

                    Column {


                        AsyncImage(
                            model = "https://t2.gstatic.com/licensed-image?q=tbn:ANd9GcSU4dr65wAuX1ZRJVbINBqTu5tFgMg-9vRA3nKF7MJoQDYt3sZM1VWHjdhuJWIZoIklfRVClLpABz3NXWYxZ4g",
                            contentDescription = "null"
                        )

                        Text("meat")


                    }
                }
            }




            Spacer(modifier = Modifier.width(15.dp))


            Row {
                Card {

                    Column {


                        AsyncImage(
                            model = "https://cheflolaskitchen.com/wp-content/uploads/2019/12/DSC0362-East-african-pilau-pelau.jpg.webp",
                            contentDescription = "null"
                        )

                        Text("Pilau")


                        Text("Evening meal")
                    }
                }
            }

            Spacer(modifier = Modifier.height(15.dp))


            Row {
                Card {

                    Column {


                        AsyncImage(
                            model = "https://mayuris-jikoni.com/wp-content/uploads/2012/10/ugali-new-2-copy.jpg",
                            contentDescription = "null"
                        )

                        Text("Ugali")


                    }
                }
            }

            Spacer(modifier = Modifier.width(15.dp))


            Row {
                Card {

                    Column {


                        AsyncImage(
                            model = "https://www.recipetineats.com/tachyon/2018/02/Crispy-Smashed-Potatoes_9-1.jpg?resize=1200%2C857&zoom=1",
                            contentDescription = "null"
                        )

                        Text("smashed potatoes")
                    }}}


                           Spacer(modifier = Modifier.width(15.dp))


                           Row {
                               Card {


                               Column {


                                   AsyncImage(
                                       model = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Chicken_marination.jpg/800px-Chicken_marination.jpg",
                                       contentDescription = "null"
                                   )

                                   Text("chicken")


                               }}}
            Spacer(modifier = Modifier.width(15.dp))

            Button(onClick =  {navController.navigate(ROUTE_SPORTS) }){

                Text("View sports")}
















































            }
}



} }