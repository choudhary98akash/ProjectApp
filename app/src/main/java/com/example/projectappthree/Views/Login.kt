package com.example.projectappthree.Views

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Login(

    horizontalAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    verticalArrangement: Arrangement.HorizontalOrVertical = Arrangement.Center,
    modifier: Modifier = Modifier
) {
    var email by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var loginPage by remember { mutableStateOf(true) }
    val contextForToast = LocalContext.current
    Column(
        horizontalAlignment = horizontalAlignment,
        verticalArrangement = verticalArrangement,
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White)
    ) {


        if(loginPage) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .padding(horizontal = 16.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .background(Color(245, 245, 245))
            ) {

                Button(
                    onClick = {
                    loginPage = true
                    },
                    modifier = Modifier
                        .background(Color(34, 97, 229))
                        .weight((1F)),
                    shape = RoundedCornerShape(24.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    )
                ) {
                    Text(text = "LOGIN", color = Color.White, fontSize = 16.sp)
                }

                Button(
                    onClick = { loginPage = false },
                    modifier = Modifier
                        .weight((1F))
                        .background(Color.Transparent),
                    shape = RoundedCornerShape(24.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    )
                ) {
                    Text(text = "SIGNUP", color = Color.Black, fontSize = 16.sp)
                }


            }

            Spacer(modifier = Modifier.height(30.dp))

            Row(
                modifier = Modifier.fillMaxWidth(0.7F)
            ) {
                Text(
                    text = "Email",
                    style = TextStyle(fontSize = 18.sp),
                )

            }

            TextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .background(Color.White)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .clip(RoundedCornerShape(30.dp)) // Rounded corners
                    .background(Color(245, 245, 245))
                    .shadow(
                        elevation = 4.dp,
                        shape = RoundedCornerShape(20.dp),
                        ambientColor = Color(245, 245, 245),
                        spotColor = Color(245, 245, 245)
                    ),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color(245, 245, 245),
                    unfocusedIndicatorColor = Color(245, 245, 245)
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(0.7F)
            ) {
                Text(
                    text = "Password",
                    style = TextStyle(fontSize = 18.sp),
                )

            }
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .background(Color.White)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .clip(RoundedCornerShape(30.dp)) // Rounded corners
                    .shadow(
                        elevation = 4.dp,
                        shape = RoundedCornerShape(20.dp),
                        ambientColor = Color.LightGray.copy(alpha = 0.2f),
                        spotColor = Color.LightGray.copy(alpha = 0.4f)
                    ),
                colors = TextFieldDefaults.colors( // Remove underline
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "Forgot Password",
                    color = Color(34, 97, 229),
                    modifier = Modifier.fillMaxWidth(0.4F) // Adjust width as needed
                )
            }

            Button(

                onClick = {
                    Toast.makeText(
                        contextForToast,
                        "Button Login has been Clicked.",
                        Toast.LENGTH_LONG
                    ).show()
                },
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .fillMaxHeight(0.138f)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .shadow(20.dp, RoundedCornerShape(24.dp)), // Add shadow
                shape = RoundedCornerShape(24.dp), // Rounded corners
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(34, 97, 229)
                )
            ) {
                Text(text = "LOGIN", color = Color.White, fontSize = 20.sp)
            }
        }
        else{
            Row(
                modifier = Modifier
                    .fillMaxWidth(0.7f) // Adjust width as needed
                    .padding(horizontal = 16.dp) // Add horizontal padding
                    .clip(RoundedCornerShape(30.dp))
                    .background(Color(245, 245, 245))
            ) {

                Button(
                    onClick = { loginPage = true },
                    modifier = Modifier
                        .background(Color.Transparent)
                        .weight((1F)),
//                    .padding(horizontal = 16.dp, vertical = 8.dp),
                    shape = RoundedCornerShape(24.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    )
                ) {
                    Text(text = "LOGIN", color = Color.Black, fontSize = 16.sp)
                }

                Button(
                    onClick = { loginPage = false},
                    modifier = Modifier
                        .weight((1F))
                        .background(Color(34, 97, 229)),
                    shape = RoundedCornerShape(24.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    )
                ) {
                    Text(text = "SIGNUP", color = Color.White, fontSize = 16.sp)
                }


            }
            Spacer(modifier = Modifier.height(30.dp))

            Row(
                modifier = Modifier.fillMaxWidth(0.7F)
            ) {
                Text(
                    text = "Full Name",
                    style = TextStyle(fontSize = 18.sp),
                )

            }

            TextField(
                value = username,
                onValueChange = { username = it },
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .background(Color.White) // Set white background
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .clip(RoundedCornerShape(30.dp)) // Rounded corners
                    .background(Color(245, 245, 245))
                    .shadow( // Drop shadow
                        elevation = 4.dp,
                        shape = RoundedCornerShape(20.dp),
                        ambientColor = Color(245, 245, 245),
                        spotColor = Color(245, 245, 245)
                    ),
                colors = TextFieldDefaults.colors( // Remove underline
                    focusedIndicatorColor = Color(245, 245, 245),
                    unfocusedIndicatorColor = Color(245, 245, 245)
                )
            )


            Spacer(modifier = Modifier.height(30.dp))

            Row(
                modifier = Modifier.fillMaxWidth(0.7F)
            ) {
                Text(
                    text = "Email",
                    style = TextStyle(fontSize = 18.sp),
                )

            }

            TextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .background(Color.White) // Set white background
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .clip(RoundedCornerShape(30.dp)) // Rounded corners
                    .background(Color(245, 245, 245))
                    .shadow( // Drop shadow
                        elevation = 4.dp,
                        shape = RoundedCornerShape(20.dp),
                        ambientColor = Color(245, 245, 245),
                        spotColor = Color(245, 245, 245)
                    ),
                colors = TextFieldDefaults.colors( // Remove underline
                    focusedIndicatorColor = Color(245, 245, 245),
                    unfocusedIndicatorColor = Color(245, 245, 245)
                )
            )



            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(0.7F)
            ) {
                Text(
                    text = "Password",
                    style = TextStyle(fontSize = 18.sp),
                )

            }
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .background(Color.White)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .clip(RoundedCornerShape(30.dp)) // Rounded corners
                    .shadow( // Drop shadow
                        elevation = 4.dp,
                        shape = RoundedCornerShape(20.dp),
                        ambientColor = Color.LightGray.copy(alpha = 0.2f),
                        spotColor = Color.LightGray.copy(alpha = 0.4f)
                    ),
                colors = TextFieldDefaults.colors( // Remove underline
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )


            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(0.7F)
            ) {
                Text(
                    text = "Confirm Password",
                    style = TextStyle(fontSize = 18.sp),
                )

            }
            TextField(
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .background(Color.White)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .clip(RoundedCornerShape(30.dp)) // Rounded corners
                    .shadow( // Drop shadow
                        elevation = 4.dp,
                        shape = RoundedCornerShape(20.dp),
                        ambientColor = Color.LightGray.copy(alpha = 0.2f),
                        spotColor = Color.LightGray.copy(alpha = 0.4f)
                    ),
                colors = TextFieldDefaults.colors( // Remove underline
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(

                onClick = {
                    Toast.makeText(
                        contextForToast,
                        "Signup Button has been Clicked.",
                        Toast.LENGTH_LONG
                    ).show()
                },
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .fillMaxHeight(0.138f)
//                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .shadow(20.dp, RoundedCornerShape(24.dp)), // Add shadow
                shape = RoundedCornerShape(24.dp), // Rounded corners
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(34, 97, 229)
                )
            ) {
                Text(text = "SIGNUP", color = Color.White, fontSize = 20.sp)
            }
        }

    }
}



@Preview
@Composable
fun PreviewLogin(){
    Login()
}