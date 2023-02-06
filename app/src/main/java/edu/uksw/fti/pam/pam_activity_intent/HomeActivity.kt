package edu.uksw.fti.pam.pam_activity_intent

import android.annotation.SuppressLint
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_intentTheme

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAM_Activity_intentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val username = getIntent().getStringExtra("username") ?: ""
                    HomePage(username)
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomePage(name: String) {
    val merahmuda = "#D93F3F"
    val merahmuda2 = "#FF8080"
    val abuabu = "#F3F3F3"

    Scaffold(
        floatingActionButton = {
            Button(
                shape = CircleShape,
                elevation = ButtonDefaults.elevation(0.dp,0.dp),
                contentPadding = PaddingValues(15.dp,50.dp),
//                border = BorderStroke(2.dp,MaterialTheme.colors.primary),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                modifier = Modifier.shadow(elevation = 10.dp, shape = CircleShape,clip = false),
                onClick = { /* ... */ }) {
                Text(text = "Click")
            }
        },
        isFloatingActionButtonDocked = true,
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(30.dp, 30.dp, 0.dp, 0.dp))
                    .height(80.dp),
                backgroundColor = Color(merahmuda.toColorInt()),
                // Defaults to null, that is, No cutout
                cutoutShape = MaterialTheme.shapes.large.copy(
                    CornerSize(percent = 100)
                )
            ) {
                Row(modifier = Modifier.padding(horizontal = 10.dp)) {
                    Button(
                        shape = CircleShape,
                        elevation = ButtonDefaults.elevation(0.dp,0.dp),
                        contentPadding = PaddingValues(20.dp,20.dp),
//                border = BorderStroke(2.dp,MaterialTheme.colors.primary),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                        modifier = Modifier.shadow(elevation = 10.dp, shape = CircleShape,clip = false),
                        onClick = { /* ... */ }) {
                        Text(text = "Click")
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Button(
                        shape = CircleShape,
                        elevation = ButtonDefaults.elevation(0.dp,0.dp),
                        contentPadding = PaddingValues(20.dp,20.dp),
//                border = BorderStroke(2.dp,MaterialTheme.colors.primary),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                        modifier = Modifier.shadow(elevation = 10.dp, shape = CircleShape,clip = false),
                        onClick = { /* ... */ }) {
                        Text(text = "Click")
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Button(
                        shape = CircleShape,
                        elevation = ButtonDefaults.elevation(0.dp,0.dp),
                        contentPadding = PaddingValues(20.dp,20.dp),
//                border = BorderStroke(2.dp,MaterialTheme.colors.primary),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                        modifier = Modifier.shadow(elevation = 10.dp, shape = CircleShape,clip = false),
                        onClick = { /* ... */ }) {
                        Text(text = "Click")
                    }
                }
            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(50.dp)
                .verticalScroll(rememberScrollState())
        ) {
//        Image(
//            painter = painterResource(id = R.drawable.robot),
//            contentDescription = "PP",
//            contentScale = ContentScale.Crop,
//            modifier = Modifier
//                .size(50.dp)
//                .clip(RoundedCornerShape(10.dp))
//        )
            Text(text = "Halo Orang Baik!")
            Text(
                text = "$name",
                color = Color(merahmuda.toColorInt()),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Text(modifier = Modifier.padding(20.dp),
                text = "")
            Row(modifier = Modifier
                .fillMaxSize())
            {
//                Box(modifier = Modifier.background(color = Color.Gray)
//                    .clip(RoundedCornerShape(40.dp))){
//                    Text(
//                        buildAnnotatedString {
//                            withStyle(
//                                style = SpanStyle(
//                                    fontWeight = FontWeight.Bold,
//                                    color = Color.Red,
//                                    fontSize = 30.sp)
//                            )
//                            {
//                                append("2")
//                            }
//                            append("K")
//                        }
//                    )
//                }
                Column(modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(fontWeight = FontWeight.Bold,
                                    color = Color(merahmuda.toColorInt()),
                                    fontSize = 20.sp)
                            )
                            {
                                append("2239")
                            }
                            append(" Total keseluruhan donor yang dilakukan di indonesia")
                        }
                    )
//                Image(
//                    painter = painterResource(id = R.drawable.robot),
//                    contentDescription = "PP",
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier
//                        .size(50.dp)
//                        .clip(RoundedCornerShape(10.dp))
//                )
                    Canvas(
                        modifier = Modifier
                            .padding(vertical = 20.dp)
                            .size(size = 300.dp)
                    ) {
                        drawRoundRect(
                            color = Color(merahmuda2.toColorInt()),
                            size = Size(width = 140.dp.toPx(), height = 160.dp.toPx()),
                            cornerRadius = CornerRadius(x = 80f, y = 80f)
                        )
                        drawRoundRect(
                            color = Color(abuabu.toColorInt()),
                            size = Size(width = 140.dp.toPx(), height = 160.dp.toPx()),
                            topLeft = Offset(x = 0.dp.toPx(), y = 175.dp.toPx()),
                            cornerRadius = CornerRadius(x = 80f, y = 80f)
                        )
                        drawRoundRect(
                            color = Color(abuabu.toColorInt()),
                            size = Size(width = 140.dp.toPx(), height = 160.dp.toPx()),
                            topLeft = Offset(x = 155.dp.toPx(), y = 0.dp.toPx()),
                            cornerRadius = CornerRadius(x = 80f, y = 80f)
                        )
                        drawRoundRect(
                            color = Color(abuabu.toColorInt()),
                            size = Size(width = 140.dp.toPx(), height = 160.dp.toPx()),
                            topLeft = Offset(x = 155.dp.toPx(), y = 175.dp.toPx()),
                            cornerRadius = CornerRadius(x = 80f, y = 80f)
                        )
                        drawContext.canvas.nativeCanvas.apply {
                            drawText(
                                "Mencari",
                                size.height-680,
                                size.width-480,
                                Paint().apply {
                                    textAlign = Paint.Align.CENTER
                                    textSize = 50F
                                }
                            )
                            drawText(
                                "Pendonor",
                                size.height-660,
                                size.width-420,
                                Paint().apply {
                                    textAlign = Paint.Align.CENTER
                                    textSize = 50F
                                }
                            )
                            drawText(
                                "Menjadi",
                                size.height-250,
                                size.width-480,
                                Paint().apply {
                                    textAlign = Paint.Align.CENTER
                                    textSize = 50F
                                    FontWeight.ExtraBold
                                }
                            )
                            drawText(
                                "Pendonor",
                                size.height-230,
                                size.width-420,
                                Paint().apply {
                                    textAlign = Paint.Align.CENTER
                                    textSize = 50F
                                }
                            )
                            drawText(
                                "Informasi",
                                size.height-670,
                                size.width-0,
                                Paint().apply {
                                    textAlign = Paint.Align.CENTER
                                    textSize = 50F
                                }
                            )
                            drawText(
                                "Kesehatan",
                                size.height-660,
                                size.width+60,
                                Paint().apply {
                                    textAlign = Paint.Align.CENTER
                                    textSize = 50F
                                }
                            )
                            drawText(
                                "Cerita",
                                size.height-280,
                                size.width-0,
                                Paint().apply {
                                    textAlign = Paint.Align.CENTER
                                    textSize = 50F
                                }
                            )
                            drawText(
                                "Pendonor",
                                size.height-240,
                                size.width+60,
                                Paint().apply {
                                    textAlign = Paint.Align.CENTER
                                    textSize = 50F
                                }
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(770.dp))
                Text(text = "adadaad")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAM_Activity_intentTheme {
//        Greeting("Android")
        HomePage("Android")
    }
}

