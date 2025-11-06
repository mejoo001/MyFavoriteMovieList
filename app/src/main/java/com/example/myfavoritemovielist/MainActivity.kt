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
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfavoritemovielist.ui.theme.MyFavoriteMovieListTheme

class MainActivity : ComponentActivity() {
    annotation class thisMainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFavoriteMovieListTheme {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ){
                    Text(
                        text = "Welcome to Favorite Movie List",
                    fontSize = 30.sp,
                     fontWeight = FontWeight.Black,

                    )

                    Spacer(modifier= Modifier.size(30.dp))
                    Row {
                        Button(onClick = {
                            /*TODO*/
                                var start = Intent(this@MainActivity, MainScreen::class.java)
                                startActivity(start)


                        }) {
                            Text(text = "Start")
                        }
                    }
                }
            }
                }
            }
        }



