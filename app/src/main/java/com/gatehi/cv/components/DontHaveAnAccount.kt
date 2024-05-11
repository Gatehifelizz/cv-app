package com.gatehi.cv.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gatehi.cv.ui.theme.AlegreyaSansFontFamily

@Composable
fun DontHaveAnAccount(
    onSignupTap: () -> Unit = {},
) {

    Row (
        modifier = Modifier.padding(top = 12.dp, bottom = 52.dp)
    ){
        Text(text = "Don't have an account?",
            style= TextStyle(
                fontSize = 15.sp,
                fontFamily = AlegreyaSansFontFamily,
                color = Color.White
            )
        )
        Text(text = "Sign up",
            style = TextStyle(
                fontSize = 15.sp,
                fontFamily = AlegreyaSansFontFamily,
                fontWeight = FontWeight(500),
                color = Color.White
            ),
            modifier = Modifier.clickable {
                onSignupTap()
            }
        )

    }

}