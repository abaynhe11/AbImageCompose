package com.google.firebase.quickstart.auth.abimagecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.firebase.quickstart.auth.abimagecompose.ui.theme.AbImageComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    AbImage()
        }
    }
}
@Composable
fun AbSimpleImage() {
    Image(
        painter = painterResource(id = R.drawable.aabitew),
        contentDescription = "Abaynhe Abitew",
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun AbCircleImageView() {
    Image(
        painter = painterResource(R.drawable.aabitew),
        contentDescription = "Circle Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(128.dp)
            .clip(CircleShape) // clip to the circle shape
            .border(5.dp, Color.Gray, CircleShape)//optional
    )
}
@Composable
fun AbRoundCornerImageView() {
    Image(
        painter = painterResource(R.drawable.aabitew),
        contentDescription = "Round corner image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(128.dp)
            .clip(RoundedCornerShape(10))
            .border(5.dp, Color.Gray, RoundedCornerShape(10))
    )
}

@Composable
fun AbImageWithBackgroundColor() {
    Image(
        painter = painterResource(id = R.drawable.ic_baseline_add_shopping_cart_24),
        contentDescription = "",
        modifier = Modifier
            .size(200.dp)
            .background(Color.Red)
            .padding(20.dp)
    )
}
@Composable
fun AbImageWithTint() {
    Image(
        painter = painterResource(id = R.drawable.ic_baseline_add_shopping_cart_24),
        contentDescription = "",
        colorFilter = ColorFilter.tint(Color.Red),
        modifier = Modifier
            .size( 200.dp)
    )
}

@Composable
fun AbInsideFit() {
    Image(
        painter = painterResource(id = R.drawable.aabitew),
        contentDescription = "",
        modifier = Modifier
            .size(150.dp)
            .background(Color.LightGray),
        contentScale = ContentScale.Inside
    )
}
@Composable
fun AbImage()
{
    Column {
        /*AbSimpleImage()
        AbCircleImageView()  */
        AbRoundCornerImageView()
        AbImageWithBackgroundColor()
        AbImageWithTint()
        AbInsideFit()

        
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun defaultPreview()
{
    AbImage()

}