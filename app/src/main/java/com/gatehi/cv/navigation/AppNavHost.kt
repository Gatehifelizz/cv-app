package com.gatehi.cv.navigation

//import CvScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gatehi.cv.models.CvViewModel
import com.gatehi.cv.ui.theme.screens.Forms.CvScreen
import com.gatehi.cv.ui.theme.screens.Forms.EditCvScreen
//import com.gatehi.cv.models.CvViewModel
//import com.gatehi.cv.ui.theme.screens.Forms.CvScreen
//import com.gatehi.cv.models.CvViewModel
//import com.gatehi.cv.ui.theme.screens.Forms.CvScreen
//import com.gatehi.cv.ui.theme.screens.Forms.SkillSection
import com.gatehi.cv.ui.theme.screens.Forms.formscreen
import com.gatehi.cv.ui.theme.screens.Forms.skillscreen
import com.gatehi.cv.ui.theme.screens.Home.Loginscreen
import com.gatehi.cv.ui.theme.screens.Home.Signupscreen
import com.gatehi.cv.ui.theme.screens.Home.Welcomescreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(), startDestination:String= ROUTE_WELCOME) {

    val navController = rememberNavController()

    val cvViewModel = viewModel<CvViewModel>()
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_WELCOME) {
            Welcomescreen(navController)
        }
        composable(ROUTE_SIGNUP) {
            Signupscreen(navController)
        }
        composable(ROUTE_LOGIN) {
            Loginscreen(navController)
        }
        composable(ROUTE_FINAL){
            EditCvScreen(navController,cvViewModel)
        }
        composable(ROUTE_CV){
            CvScreen(navController,cvViewModel)
        }

        composable(ROUTE_FORM) {
            formscreen(navController,cvViewModel)
        }



    }
}

