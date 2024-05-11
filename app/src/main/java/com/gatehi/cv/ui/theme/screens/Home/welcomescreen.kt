package com.gatehi.cv.ui.theme.screens.Home

import android.graphics.ColorSpace.Rgb
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.gatehi.cv.R
import com.gatehi.cv.components.CButton
import com.gatehi.cv.components.DontHaveAnAccount
import com.gatehi.cv.ui.theme.AlegreyaFontFamily
import com.gatehi.cv.ui.theme.AlegreyaSansFontFamily
import org.w3c.dom.Text

@Composable
fun Welcomescreen(
    navController: NavHostController,
) {
    Box(
        modifier =Modifier.fillMaxSize()
    ){
        Image(painter = painterResource(id = R.drawable.forest),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )

        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp)
        ){
            
//            Spacer(modifier = Modifier.weight(if))
            
            Image(painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier
                    .width(320.dp)
                    .height(240.dp),
                contentScale = ContentScale.Fit
                )
                Text(text = "WELCOME",
                    fontSize = 32.sp,
                    fontWeight = FontWeight(700),
                    fontFamily = AlegreyaFontFamily,
                    color= Color.White
                    )
            Text(text = "A good cv makes sure \n You get that job",
                textAlign = TextAlign.Center,
                fontFamily= AlegreyaSansFontFamily,
                fontSize = 18.sp,
                fontWeight = FontWeight(500),
                color=Color.White
                )
          Spacer(modifier = Modifier.height(60.dp))

            CButton(text = "Sign In With Email",
                onClick = {
                    navController.navigate("login")
                }
                )

            DontHaveAnAccount(
                onSignupTap = {
                    navController.navigate("signup")
                }
            )


            

        }
    }
}
@Preview(showBackground = true, widthDp = 320, heightDp = 648)
@Composable
fun Welcomescreenprev() {
    Welcomescreen(rememberNavController())
}