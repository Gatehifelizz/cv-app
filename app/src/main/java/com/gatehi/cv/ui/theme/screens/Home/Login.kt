package com.gatehi.cv.ui.theme.screens.Home

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.gatehi.cv.R
import com.gatehi.cv.components.CButton
import com.gatehi.cv.components.CTextfield
import com.gatehi.cv.components.DontHaveAnAccount
import com.gatehi.cv.data.AuthViewModel
import com.gatehi.cv.ui.theme.AlegreyaFontFamily
import com.gatehi.cv.ui.theme.AlegreyaSansFontFamily
//import kotlinx.coroutines.flow.internal.NoOpContinuation.context
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Loginscreen(
    navController:NavHostController
) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }
    var passwordVisible by remember { mutableStateOf(false)}
    var context= LocalContext.current
    Surface(
        color = Color.Black,
        modifier = Modifier.fillMaxSize()
    ) {

        Box(modifier = Modifier.fillMaxSize()){
            //background image
            Image(painter = painterResource(id = R.drawable.bg1),
                contentDescription = null,
                modifier= Modifier
                    .fillMaxWidth()
                    .height(190.dp)
                    .align(Alignment.BottomCenter)
            )

            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier= Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.logo),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 54.dp)
                        .height(100.dp)
                        .align(Alignment.Start)
                        .offset(x = (-10).dp)
                )
                Text(text = "Log in",
                    style= TextStyle(
                        fontSize = 24.sp,
                        fontFamily= AlegreyaFontFamily,
                        fontWeight = FontWeight(500),
                        color = Color.White
                    ),
                    modifier=Modifier.align(Alignment.Start)
                    )
                Text(text = "Log in now to create your first professional cv",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = AlegreyaSansFontFamily,
                        color = Color(0xB2FFFFFF)
                    ),
                    modifier= Modifier
                        .align(Alignment.Start)
                        .padding(bottom = 24.dp)
                    )
                ///text fields
                TextField(
                    value = email,
                    onValueChange = {email=it},
                    leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "mail")},
                    placeholder = {
                        Text(text = "Enter email",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontFamily = AlegreyaSansFontFamily,
                                color = Color(0xFFBEC2C2)
                            )
                        )
                    },
                    modifier= Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                    colors= TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        focusedIndicatorColor = Color(0xFFbec2C2),
                        unfocusedIndicatorColor = Color(0xFFbec2C2)
                    )
                )
                TextField(
                    value = pass,
                    onValueChange = {pass=it},
                    placeholder = {
                        Text(text = "Enter password",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontFamily = AlegreyaSansFontFamily,
                                color = Color(0xFFBEC2C2)
                            )
                        )
                    },
                    modifier= Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp, bottom = 8.dp),
                    visualTransformation = if (passwordVisible) VisualTransformation.None else  PasswordVisualTransformation(),
                    trailingIcon =  {
                        val image=if (passwordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                        IconButton(onClick = { passwordVisible = !passwordVisible }) {
                            Icon(image, contentDescription = if (passwordVisible)"Hide password" else "Show password")

                        }
                    },
                    colors= TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        focusedIndicatorColor = Color(0xFFbec2C2),
                        unfocusedIndicatorColor = Color(0xFFADB1B1)
                    )
                )

                
                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick ={
                             val mylogin=AuthViewModel(navController,context)
                            mylogin.login(email.text.trim(),pass.text.trim())
                            navController.navigate("cv")
                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(
                        containerColor= Color((0xFF3C9A92))
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                ) {
                    Text(text = "Log in",
                        style = TextStyle(
                            fontSize= 22.sp,
                            fontFamily = AlegreyaSansFontFamily,
                            fontWeight = FontWeight(500),
                            color = Color.White
                        )
                    )

                }

//                CButton(text = "Log in",
//                    onClick = {
//                        navController.navigate("login")
//                    }
//                    )

                DontHaveAnAccount()


            }
        }

    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun LoginscreenPrev() {
    Loginscreen(rememberNavController())
}