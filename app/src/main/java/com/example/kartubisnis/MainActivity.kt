package com.example.kartubisnis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kartubisnis.ui.theme.KartuBisnisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KartuBisnisTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    kartubisnis()
                }
            }
        }
    }
}

@Composable
fun kartubisnis(){
    Column {
        Row(Modifier.weight(1.5f)) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Red)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "PRAPTA RADIKALTA",
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Mobile App Developer Junior",
                    color = Color.White,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Start
                )
            }
        }

        Row(Modifier.weight(2f)) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Image(
                    painter = painterResource(R.drawable.profile_1),
                    contentDescription = null,
                    )
                KontakDetail(
                    icon = Icons.Default.Phone,
                    label = "Phone",
                    text = "0853-7690-4583",
                )
                KontakDetail(
                    icon = Icons.Default.Email,
                    label = "Email",
                    text = "praptaradikalta@gmail.com",
                )
                KontakDetail(
                    icon = Icons.Default.Person,
                    label = "LinkedIn",
                    text = "www.linkedin.com/in/prapta-radikalta-73a69753",
                )
                KontakDetail(
                    icon = Icons.Default.Home,
                    label = "Address",
                    text = "Kisaran - Asahan - Sumut",
                )

            }

        }

        Row(Modifier.weight(0.2f)) {
           Column (
               modifier = Modifier
                   .fillMaxSize()
                   .background(Color.Red),
               horizontalAlignment = Alignment.CenterHorizontally
               ){
                    Text(
                        text = "Hsi SandBox 3.0",

                        modifier = Modifier.padding(5.dp),
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
           }
        }

    }
}

@Composable
fun KontakDetail(icon: ImageVector, label: String? = null, text: String) {
    Row(
        modifier = Modifier
            .width(350.dp)
            .height(60.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .padding(10.dp),
            tint = Color.DarkGray,
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(text = label ?: text, fontSize = 10.sp, color = Color.DarkGray)
            Text(text = text, fontWeight = FontWeight.Medium, color = Color.Black)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KartuBisnisTheme {
//        GreetingImage(
//            message = stringResource(R.string.selamat_belajar_kotlin_prapta),
//            from = "Hsi Sandbox 3.0")
//            ComposeArticleApp()
//            taskcompleted()
//            ComposeQuadrantApp()
        kartubisnis()
    }
}



