package com.example.myfavoritemovielist

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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfavoritemovielist.ui.theme.MyFavoriteMovieListTheme




class MainScreen : ComponentActivity() {

    @Composable
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
                        text = "Main Screen",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Black,

                    )


                }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = {

                            }

                        ) {
                            Text("Add Movie")
                        }

                        Spacer(modifier = Modifier.size(30.dp))
                        Button(
                            onClick = {
                                MovieReviews = when (movietitle) {
                                    "The Godfather" -> "A masterpiece of cinema"
                                    "The Dark Knight" -> "A beautiful love story"
                                    "Pulp Fiction" -> "Quirky and captivating"
                                else -> "Invalid movie title!"
                                }
                            }
                        ) {
                            Text("View Reviews")
                        }
                    }

                //Error Handling
                var movietitleInput = findViewById<EditText>(R.id.movietitleInput)
                var text = movietitleInput.text.toString()

                if(text.isEmpty()) {
                    movietitleInput.error = "This field cannot be empty"
                }else if (text.toIntorNull = null) {
                    movietitleInput.error = "Pleaseenter a valid title"
                }else {
                        movietitleInput.error = null //clear error
                    }
                }


                }

                    var movieTitle = arrayOf("The Godfather", "The Dark Knight", "Pulp Fiction")
                    var director =
                        arrayOf("Francis Ford Coppola", "Andrew Steyn", "Quentin Taranino")
                    var rating = arrayOf(5, 3, 4)
                    var comments = arrayOf(
                        "A masterpiece of cinema",
                        "A beautiful love story",
                        "Quirky and capivating"
                    )

                    for (i in movieTitle.indices) {
                        println("movieTitle: ${movieTitle[i]}")
                        println("director ${director[i]}")
                        println("rating: ${rating[i]}")
                    }

                    var movietitle by remember {
                        mutableStateOf("")
                    }
                    var moviereview by remember {
                        mutableStateOf( "")
                    }
                }
            }















