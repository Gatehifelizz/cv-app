package com.gatehi.cv.ui.theme.screens.Forms

import android.graphics.Paint.Style
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.gatehi.cv.R
import com.gatehi.cv.data.AuthViewModel
import com.gatehi.cv.models.CvViewModel
import com.gatehi.cv.ui.theme.AlegreyaSansFontFamily
import com.gatehi.cv.ui.theme.screens.Home.Loginscreen
//import com.google.firebase.firestore.FirebaseFirestore

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun formscreen(
    navController: NavHostController,
    cvViewModel: CvViewModel
) {

//    var applicantsName by rememberSaveable { mutableStateOf("")}
//    var applicantsEmail by rememberSaveable { mutableStateOf("")}
    var linkedProfile by rememberSaveable { mutableStateOf("")}
    var address by rememberSaveable { mutableStateOf("") }
    var context= LocalContext.current
    var isSavedClicked by rememberSaveable { mutableStateOf("")}
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
            text = stringResource( R.string.Contact_Details),
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineSmall
            )


        Spacer(modifier = Modifier.padding(8.dp))

        Text(
            text = stringResource(id = R.string.applicants_name),
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxSize(),
            value = cvViewModel.applicantsName.value,
            onValueChange = {cvViewModel.applicantsName.value=it},
            placeholder = { Text(text = "e.g Felix Gatehi")},

        colors= TextFieldDefaults.textFieldColors(
            containerColor = Color.Black,
            focusedIndicatorColor = Color(0xFFbec2C2),
            unfocusedIndicatorColor = Color(0xFFbec2C2)
        )
        )
        Spacer(modifier = Modifier.padding(1.dp))

        Text(
            text = stringResource(id = R.string.applicants_email),
            style=MaterialTheme.typography.bodyLarge
        )
        TextField(
            modifier = Modifier.fillMaxSize(),
            value = cvViewModel.applicantsEmail.value,
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "mail") },
            onValueChange = {cvViewModel.applicantsEmail.value=it},
            placeholder = { Text(text = "e.g example@gmail.com",) },

            colors= TextFieldDefaults.textFieldColors(
                containerColor = Color.Black,
                focusedIndicatorColor = Color(0xFFbec2C2),
                unfocusedIndicatorColor = Color(0xFFbec2C2)
            )

        )
        Spacer(modifier = Modifier.padding(1.dp))

        Text(
            text = stringResource(id = R.string.linked_profile),
            style=MaterialTheme.typography.bodyLarge
        )
        TextField(
            modifier = Modifier.fillMaxSize(),
            value = linkedProfile,
            onValueChange = {linkedProfile=it},
            placeholder = { Text(text = "e.g Felix Gatehi")},

            colors= TextFieldDefaults.textFieldColors(
                containerColor = Color.Black,
                focusedIndicatorColor = Color(0xFFbec2C2),
                unfocusedIndicatorColor = Color(0xFFbec2C2)
            )

        )
        Spacer(modifier = Modifier.padding(1.dp))

        Text(
            text = stringResource(id = R.string.address),
            style=MaterialTheme.typography.bodyLarge
        )
        TextField(
            modifier = Modifier.fillMaxSize(1f),
            value = address,
            onValueChange = {address=it},
            placeholder = { Text(text = "enter address")},

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

@Composable
@Preview
fun formscreenPreview() {
    val navController = rememberNavController()
    val cvViewModel = remember { CvViewModel() }

    formscreen(navController = navController, cvViewModel = cvViewModel)
}

//isSavedClicked=true
//                savedDataFirestore(applicantsName, phoneNumber)