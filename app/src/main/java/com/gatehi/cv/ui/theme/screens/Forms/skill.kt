package com.gatehi.cv.ui.theme.screens.Forms


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.gatehi.cv.R
import com.gatehi.cv.ui.theme.AlegreyaSansFontFamily

//import com.google.firebase.firestore.FirebaseFirestore

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun skillscreen(
    navController: NavHostController
) {
    var skills by rememberSaveable { mutableStateOf("")}
    var workexperience by rememberSaveable { mutableStateOf("")}
    var about by rememberSaveable { mutableStateOf("")}

    var context= LocalContext.current
//    var textstate by rememberSaveable { mutableStateOf(TextFieldValue)}

//    val phoneNumberUtil=PhoneNumberUtil.getInstance()

    Surface (
        color = Color.Gray,
        modifier= Modifier.fillMaxSize()
    ){


        Column (
            modifier = Modifier
                .padding(5.dp, 5.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement= Arrangement.spacedBy(8.dp)
        ){

            Text(
                text = stringResource( R.string.Skills_section),
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.headlineSmall
            )

            Spacer(modifier = Modifier.padding(8.dp))

            Text(
                text = stringResource(id = R.string.skill),
                style = MaterialTheme.typography.bodyLarge
            )

            TextField(
                modifier = Modifier.fillMaxSize(),
                value = skills,
                onValueChange = {skills=it},
                placeholder = { Text(text = "e.g Software engineer",
                    style= TextStyle(
                        color=Color.White
                    )
                )},

                colors= TextFieldDefaults.textFieldColors(
                    containerColor = Color.Black,
                    focusedIndicatorColor = Color(0xFFbec2C2),
                    unfocusedIndicatorColor = Color(0xFFbec2C2)
                )


            )
            Spacer(modifier = Modifier.padding(1.dp))

            Text(
                text = stringResource(id = R.string.work_exeperience),
                style=MaterialTheme.typography.bodyLarge
            )
            TextField(
                modifier = Modifier.fillMaxSize(),
                value = workexperience,
                onValueChange = {workexperience=it},
                placeholder = { Text(text = "e.g example@gmail.com",
                    style= TextStyle(
                        color=Color.White
                    )
                )},

                colors= TextFieldDefaults.textFieldColors(
                    containerColor = Color.Black,
                    focusedIndicatorColor = Color(0xFFbec2C2),
                    unfocusedIndicatorColor = Color(0xFFbec2C2)
                ),


            )
            Spacer(modifier = Modifier.padding(1.dp))

            Text(
                text = stringResource(id = R.string.about),
                style=MaterialTheme.typography.bodyLarge
            )
            TextField(
                modifier = Modifier.fillMaxSize(),
                value = about,
                onValueChange = {about=it},
                placeholder = {
                    Text(text = " e.g. I'm a skilled and passionate software developer with a proven track record in building high-performance mobile applications. My focus is on creating innovative and user-friendly experiences that delight users. I thrive in fast-paced environments and love solving complex challenges in mobile app development. Some of my achievements include 25under25 award winner in the tech category in Nigeria (2020),",

                    style = TextStyle(
                        fontSize = 15.sp,
                        fontFamily = AlegreyaSansFontFamily,
                        fontWeight = FontWeight(100),
                        color = Color.White
                    )
                    )
                              },

                colors= TextFieldDefaults.textFieldColors(
                    containerColor = Color.Black,
                    focusedIndicatorColor = Color(0xFFbec2C2),
                    unfocusedIndicatorColor = Color(0xFFbec2C2)
                )

            )


            Button(
                onClick ={
                    navController.navigate("")
                },
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(
                    containerColor= Color((0xFF3C9A92))
                ),
                modifier = Modifier
                    .padding(10.dp)
                    .height(50.dp)
            ) {
                Text(text = "Next",
                    style = TextStyle(
                        fontSize= 22.sp,
                        fontFamily = AlegreyaSansFontFamily,
                        fontWeight = FontWeight(500),
                        color = Color.White
                    )
                )

            }







        }


    }

}

@Preview(showBackground = true)
@Composable
fun skillscreenPrev() {
    skillscreen(rememberNavController())
}