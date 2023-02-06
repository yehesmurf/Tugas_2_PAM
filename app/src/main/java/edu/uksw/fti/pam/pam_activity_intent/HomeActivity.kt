package edu.uksw.fti.pam.pam_activity_intent

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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

@Composable
fun HomePage(name: String) {
    val merahmuda = "#D93F3F"
    val merahmuda2 = "#FF8080"
    val abuabu = "#F3F3F3"
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp)
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

