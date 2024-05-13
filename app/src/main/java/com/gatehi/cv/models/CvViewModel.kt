package com.gatehi.cv.models


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.google.firebase.Firebase
import com.google.firebase.database.FirebaseDatabase

class CvViewModel : ViewModel() {
    var firstName by mutableStateOf("Felix")
    var lastName by mutableStateOf("Gatehi")
    var slackUsername by mutableStateOf("felix")
    var githubHandle by mutableStateOf("Gatehifelizz")
    var linkedinn by mutableStateOf("Felix Gatehi")
    var bio by mutableStateOf("I'm a skilled and passionate software developer with a proven track record in building high-performance mobile applications. My focus is on creating innovative and user-friendly experiences that delight users. I thrive in fast-paced environments and love solving complex challenges in mobile app development. Some of my achievements include 25under25 award winner in the tech category in Nigeria (2020), winner of the Hackvote Hackathon 2018, winner of the Onehack global hackathon 2020, a Young Innovation Leaders fellow, and an African Young Leaders fellow.")
    var skill by mutableStateOf("frontend developer, cisco expert \n senior python engineer")
}
//updateCVButton.setOnClickListener {
//     val databaseReference = FirebaseDatabase.getInstance().getReference("your_database_path")
//
//     databaseReference.child("firstName").setValue(viewModel.firstName.value)
//     databaseReference.child("lastName").setValue(viewModel.lastName.value)
//     databaseReference.child("slackUsername").setValue(viewModel.slackUsername.value)
//     databaseReference.child("githubHandle").setValue(viewModel.githubHandle.value)
//     databaseReference.child("bio").setValue(viewModel.bio.value)
//
//
// // Add more fields as needed
//}