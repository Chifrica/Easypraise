package ble.ble.easypraise

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Login(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color(0xFF4E9FB9))
            .fillMaxSize()
            .padding(
                start = 0.dp,
                end = 0.dp,
                bottom = 0.dp
            )
    ) {
        TopBar()
        ImageAndLogin()
    }
}

@Composable
fun TopBar(){
    Column(modifier = Modifier
        .background(color = Color(0xFF4E9FB9))
    ){
        TopAppBar(
            backgroundColor = Color(0xFF4E9FB9)
        ) {
            Text(
                text = "EP",
                fontSize = 40.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFFFFF),
                modifier = Modifier
                    .padding(start = 12.dp),
            )

           Row(
               modifier = Modifier.weight(1f),
               horizontalArrangement = Arrangement.End
           ){
               OutlinedButton(
                   onClick = { /*TODO*/ },
                   shape = RoundedCornerShape(10.dp),
                   colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF14E910)),
               ) {
                   Text(
                       text = "Sign up",
                       color = Color(0xFFFFFFFF)
                   )
               }
           }
        }
    }
}

@Composable
fun ImageAndLogin(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.projecting_image_2),
            contentDescription = "",
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .height(300.dp)
                .width(350.dp)
        )

        Box(modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(color = Color(0xFFFFFFFF))
            .width(80.dp)
            .height(40.dp)
            .padding(bottom = 50.dp),
            contentAlignment = Alignment.Center
        ){
            Text(text = "Login")
        }

        LoginTextField()

        OutlinedButton(
            onClick = { "Do something here"},
            shape = CircleShape,
            elevation = ButtonDefaults.elevation(8.dp)
        ){
            Text(
                text = "Forgotten password",
                modifier = Modifier.padding(12.dp)
            )
        }
    }
}

@Composable
fun LoginTextField(){
    var text by remember{
        mutableStateOf("")
    }
    val rainbowColors: List<Color> = listOf()
    val brush = remember {
        Brush.linearGradient(
            colors = rainbowColors
        )
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(bottom = 25.dp)
    ) {
        TextField(
            value = text,
            onValueChange = { text = it },
            label = {
                Text(text = "Email/Phone number")
            },
            maxLines = 1,
            textStyle = TextStyle(color = Color(0xFF000000)),
            modifier = Modifier
                .padding(bottom = 8.dp, top = 8.dp)
                .background(color = Color(0xFFFFFFFF))
        )

        TextField(
            value = text,
            onValueChange = { text = it },
            label = {
                Text(text = "Password")
            },
            maxLines = 1,
            textStyle = TextStyle(color = Color(0xFF000000)),
            modifier = Modifier
                .padding(top = 8.dp)
                .background(color = Color(0xFFFFFFFF))

        )
    }

}

@Preview(showBackground = true)
@Composable
fun LoginPreview(){
    Login()
}