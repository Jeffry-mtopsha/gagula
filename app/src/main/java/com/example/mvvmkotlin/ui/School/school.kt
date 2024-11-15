package com.example.mvvmkotlin.ui.School

import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.mvvmkotlin.navigation.ROUTE_HOME
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

@Composable

fun School(navController: NavController) {
    var Name by remember { mutableStateOf("") }
    var Admission by remember { mutableStateOf("") }
    var Class by remember { mutableStateOf("") }
    var Email by remember { mutableStateOf<Uri?>(null) }
    var uploading by remember { mutableStateOf(false) }

    val firestore = FirebaseFirestore.getInstance()
    val storage = FirebaseStorage.getInstance().reference
    val context = LocalContext.current

    val imagePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        Email = uri
    }

    LazyRow {

        item {



            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Spacer(modifier = Modifier.height(20.dp))

                Text("login", fontSize = 24.sp, color = Color.Black)

                OutlinedTextField(
                    value = Name,
                    onValueChange = { Name = it },
                    label = { Text("Your Name") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(8.dp))

                OutlinedTextField(
                    value = Admission,
                    onValueChange = { Admission = it },
                    label = { Text("Enter Admission") },
                    modifier = Modifier.fillMaxWidth(),
                )

                Spacer(modifier = Modifier.height(8.dp))

                OutlinedTextField(
                    value = Class,
                    onValueChange = { Class = it },
                    label = { Text("Class") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(8.dp))

                Button(onClick = { imagePickerLauncher.launch("image/*") }) {
                    Text("login")
                }

                Email?.let {
                    Spacer(modifier = Modifier.height(8.dp))
                    Image(
                        painter = rememberImagePainter(it),
                        contentDescription = "view meals",
                        modifier = Modifier
                            .size(150.dp)
                            .padding(8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = {
                        if (Name.isNotEmpty() && Admission.isNotEmpty() && Class.isNotEmpty() && Email != null) {
                            uploading = true
                            com.example.mvvmkotlin.ui.product.uploadProduct(
                                Name, Admission, Class,
                                Email!!, storage, firestore, context, navController
                            ) { success ->
                                uploading = false
                                if (success) {
                                    Toast.makeText(
                                        context,
                                        "Product added successfully!",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                } else {
                                    Toast.makeText(
                                        context,
                                        "Failed to add product",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            }
                        }
                    },
                    enabled = !uploading,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    if (uploading) {
                        CircularProgressIndicator(color = Color.White)
                    } else {
                        Text("Submit")
                    }
                }
            }
        }

        fun uploadProduct(
            name: String,
            price: String,
            description: String,
            imageUri: Uri,
            storageReference: StorageReference,
            firestore: FirebaseFirestore,
            context: android.content.Context,
            navController: NavController,
            onComplete: (Boolean) -> Unit
        ) {
            val storageRef = storageReference.child("products/${imageUri.lastPathSegment}")
            val uploadTask = storageRef.putFile(imageUri)

            uploadTask.continueWithTask { task ->
                if (!task.isSuccessful) {
                    task.exception?.let {
                        throw it
                    }
                }
                storageRef.downloadUrl
            }.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val downloadUri = task.result
                    val product = hashMapOf(
                        "name" to name,
                        "price" to price,
                        "description" to description,
                        "image" to downloadUri.toString()
                    )

                    firestore.collection("products").add(product)
                        .addOnSuccessListener {
                            onComplete(true)
                            navController.navigate(ROUTE_HOME)
                        }
                        .addOnFailureListener {
                            onComplete(false)
                        }
                } else {
                    onComplete(false)
                }
            }
        }

    }
}

