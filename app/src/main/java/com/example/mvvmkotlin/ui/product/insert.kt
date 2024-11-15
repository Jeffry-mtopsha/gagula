package com.example.mvvmkotlin.ui.product




import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
fun InsertProductsScreen(navController: NavController) {
    var Name by remember { mutableStateOf("") }
    var Admission  by remember { mutableStateOf("") }
    var Class by remember { mutableStateOf("") }
    var ImageUri by remember { mutableStateOf<Uri?>(null) }
    var uploading by remember { mutableStateOf(false) }

    val firestore = FirebaseFirestore.getInstance()
    val storage = FirebaseStorage.getInstance().reference
    val context = LocalContext.current

    val imagePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        ImageUri = uri
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("add meal", fontSize = 24.sp, color = Color.Black)

        OutlinedTextField(
            value = Name
            ,
            onValueChange = { Name = it },
            label = { Text(" Name") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = Admission,
            onValueChange = { Admission = it },
            label = { Text(" Admission") },
            modifier = Modifier.fillMaxWidth(),
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = Class,
            onValueChange = { Class = it },
            label = { Text("Product Benefit") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = { imagePickerLauncher.launch("image/*") }) {
            Text("Select Product Image")
        }

        ImageUri?.let {
            Spacer(modifier = Modifier.height(8.dp))
            Image(
                painter = rememberImagePainter(it),
                contentDescription = "Selected Product Image",
                modifier = Modifier
                    .size(150.dp)
                    .padding(8.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                if (Name.isNotEmpty() && Admission.isNotEmpty() && Class.isNotEmpty() && ImageUri != null) {
                    uploading = true
                    uploadProduct(
                        Name,Admission, Class,
                        ImageUri!!, storage, firestore, context, navController
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
                Text("Save Product")
            }
        }
    }
}

fun uploadProduct(
    name: String,
    admission: String,
    description: String,
    imageUri: Uri,
    storageReference: StorageReference,
    firestore: FirebaseFirestore,
    context: android.content.Context,
    navController: NavController,
    onComplete: (Boolean) -> Unit
) {
    val storageRef = storageReference.child("sports/${imageUri.lastPathSegment}")
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
                "admission" to admission,
                "description" to description ,
                "image" to downloadUri.toString()
            )

            firestore.collection("sports").add(product)
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