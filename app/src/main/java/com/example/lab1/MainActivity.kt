package com.example.lab1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab1.ui.theme.Lab1Theme

@Composable
fun Greeting(name: String, artist: String, place: String,modifier: Modifier = Modifier) {
    val miColor1 = Color(0xFF6B9DD7)
    val miColor2 = Color(0xFFb97fc9)
    val image = painterResource(R.drawable.background)

    //Text
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.End) {
            Column (horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = name,
                    style = TextStyle(color = miColor1, fontSize = 40.sp, fontStyle = FontStyle.Italic)
                )
                Text(text = artist,
                    style = TextStyle(color = miColor2, fontWeight = FontWeight.Bold, fontSize = 20.sp)
                )
                Text(text = place,
                    style = TextStyle(color = miColor2, fontSize = 20.sp)
                )
                Image(
                    painter = image,
                    contentDescription = null
                )
            }
        }
    }
    //Button
    val context = LocalContext.current.applicationContext
    Column(
        modifier = modifier
            .width(2000.dp)
            .height(10000.dp)
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ElevatedButton(onClick = { Toast.makeText(context, "Botón presionado!", Toast.LENGTH_SHORT).show()},
            shape = RoundedCornerShape(size = 16.dp), colors = ButtonDefaults.buttonColors(containerColor = miColor2)
        ) {
            Text("Next", color = Color.White)
        }
    }
}

fun TextStyle(color: Color, fontSize: TextUnit): TextStyle {
    TODO("Not yet implemented")
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Lab1Theme {
        Greeting("Laboratorio #1", "Marinés García", "23391")
    }
}
