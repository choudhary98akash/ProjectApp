package com.example.projectappthree.Views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
    var password by remember { mutableStateOf("") }
    Column(
        horizontalAlignment = horizontalAlignment,
        verticalArrangement = verticalArrangement,
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White)
    ) {
        Text(
            text = "Login",
            color = Color.White,
            style = TextStyle(fontSize = 30.sp),
            modifier = Modifier
                .shadow(10.dp, RoundedCornerShape(45.dp))
                .background(Color(34, 97, 229), RoundedCornerShape(8.dp))
                .padding(50.dp, 10.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Row (
            modifier = Modifier.fillMaxWidth(0.7F)
        ){
            Text(
                text = "Email",
                style = TextStyle(fontSize = 18.sp),
            )

        }

        TextField(
            value = email,
            onValueChange = { email = it },
//            label = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .background(Color.White) // Set white background
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .clip(RoundedCornerShape(30.dp)) // Rounded corners
                .shadow( // Drop shadow
                    elevation = 4.dp,
                    shape = RoundedCornerShape(20.dp),
                    ambientColor = Color(245, 245, 245),
                    spotColor = Color(245, 245, 245)
                ),
            colors = TextFieldDefaults.colors( // Remove underline
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row (
            modifier = Modifier.fillMaxWidth(0.7F)
        ){
            Text(
                text = "Password",
                style = TextStyle(fontSize = 18.sp),
            )

        }
        TextField(
            value = password,
            onValueChange = { password = it },
//            label = { Text("Password") },
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .background(Color.White) // Set white background
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
            onClick = { /* Handle login */ },
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .shadow(8.dp, RoundedCornerShape(24.dp)), // Add shadow
            shape = RoundedCornerShape(24.dp), // Rounded corners
            colors = ButtonDefaults.buttonColors(
            containerColor = Color(34, 97, 229))
        ) {
            Text(text = "LOGIN", color = Color.White, fontSize = 16.sp)
        }


    }
}

@Preview
@Composable
fun PreviewLogin(){
    Login()
}