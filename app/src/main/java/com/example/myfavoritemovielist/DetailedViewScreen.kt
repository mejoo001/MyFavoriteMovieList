package com.example.myfavoritemovielist

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfavoritemovielist.ui.theme.MyFavoriteMovieListTheme

class DetailedViewScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFavoriteMovieListTheme {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        text = "Detailed View Screen",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Black,

                        )

                }
                Text(text = "The Godfather")
                Text(text = " Francis Ford Coppola")
                Text(text = "Rating - 5")
                Text(text = "A masterpiece of cinema.")

                Spacer(modifier = Modifier.size(30.dp))
                Text(text = "The Vow")
                Text(text = " Andrew Steyn")
                Text(text = "Rating - 4")
                Text(text = "A love that never ends.")

                Spacer(modifier = Modifier.size(30.dp))
                Text(text = "The Dark Knight")
                Text(text = " Ashley Hew")
                Text(text = "Rating - 2")
                Text(text = "A dark secret that broke many lives.")

                Spacer(modifier = Modifier.size(30.dp))
                Text(text = "Pulp Fiction")
                Text(text = " Quentin Tarantino")
                Text(text = "Rating - 4")
                Text(text = "Quirky and captivating")


                Row {
                    Button(
                        onClick = {
                            var start = Intent(this@DetailedViewScreen, MainScreen::class.java)
                            startActivity(start)

                        }
                    ) {
                        Text(text = "Back to Main Screen")
                    }
                }
            }
        }
    }
}

