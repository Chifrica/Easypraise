package ble.ble.easypraise

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Welcome() {
    Column(
        modifier = Modifier
            .padding(
                start = 0.dp,
                end = 0.dp,
                bottom = 0.dp
            )
            .background(Color(0xFF4E9FB9)),
    ){
        Text(
            text = "EP",
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFFFFFF),
            modifier = Modifier
                .padding(start = 140.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.projecting_image),
            contentDescription = "Projection image",
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .padding(top = 0.dp, start = 45.dp, end = 45.dp, bottom = 0.dp)
                .size(350.dp)
        )

        BoxWithConstraints {
            Box(modifier = Modifier.fillMaxWidth()
                .background(brush = Brush.radialGradient(
                    colors = listOf(Color(0xFF4E9FB9), Color(0xFFFFFFFF))
                )))
        }

        Text(
            text = "...Project your display work...",
            fontStyle = FontStyle.Italic,
            fontSize = 20.sp,
            color = Color(0xFFFFFFFF),
            modifier = Modifier
                .padding(start = 70.dp, bottom = 35.dp)
        )
        
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFFFFF)),
            modifier = Modifier
                .padding(start = 140.dp, bottom = 16.dp)
        ) {
            Text(
                text = "Let's Explore",
                color = Color(0xFF000000),
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomePreview(){
    Welcome()
}
