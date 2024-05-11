package com.gatehi.cv.models


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CvViewModel : ViewModel() {

   var applicantsName = mutableStateOf("")
    var applicantsEmail =  mutableStateOf("")

    var firstName by mutableStateOf("Felix")
    var lastName by mutableStateOf("Gatehi")
    var slackUsername by mutableStateOf("felix")
    var githubHandle by mutableStateOf("Gatehifelizz")
    var linkedinn by mutableStateOf("Felix Gatehi")
    var bio by mutableStateOf("I'm a skilled and passionate software developer with a proven track record in building high-performance mobile applications. My focus is on creating innovative and user-friendly experiences that delight users. I thrive in fast-paced environments and love solving complex challenges in mobile app development. Some of my achievements include 25under25 award winner in the tech category in Nigeria (2020), winner of the Hackvote Hackathon 2018, winner of the Onehack global hackathon 2020, a Young Innovation Leaders fellow, and an African Young Leaders fellow.")
    var skill by mutableStateOf("frontend developer, cisco expert \n senior python engineer")
}