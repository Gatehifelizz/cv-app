package com.gatehi.cv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gatehi.cv.navigation.AppNavHost
//import com.gatehi.cv.navigation.AppNavHost
import com.gatehi.cv.ui.theme.CVTheme
//import com.gatehi.cv.ui.theme.screens.Forms.formscreen
import com.gatehi.cv.ui.theme.screens.Home.Loginscreen
import com.gatehi.cv.ui.theme.screens.Home.Signupscreen
import com.gatehi.cv.ui.theme.screens.Home.Welcomescreen
import com.google.firebase.Firebase
import com.google.firebase.FirebaseApp
import com.google.firebase.initialize
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//    

        installSplashScreen()
        setContent {
            val delayTimeMillis = 3000
            LaunchedEffect(Unit){
                delay(delayTimeMillis)
            }
            CVTheme {
                // A surface container using the 'background' color from the theme
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
//                    color = MaterialTheme.colorScheme.background
                ) {
//                    Navigationview()
                    AppNavHost()
                }
            }
        }
    }
}

//@Composable
//fun Navigationview(){
//    val navController= rememberNavController()
//
//    NavHost(navController = navController, startDestination = "Welcome"){
//        composable("welcome"){ Welcomescreen(navController)}
//        composable("login"){ Loginscreen(navController)}
//        composable("signup"){ Signupscreen(navController)}
//        composable("form"){ formscreen(navController) }
//    }
//}
//
