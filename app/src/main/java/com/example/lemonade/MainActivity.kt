package com.example.lemonade

import android.graphics.Color.parseColor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                LemonadeApp()
            }
        }
    }
}

@Composable
fun LemonadeApp(modifier: Modifier = Modifier) {

    var currentStep by remember { mutableStateOf(1) }
    var sequeezeCount by remember { mutableStateOf(0) }
    var requiredSqeezeCount by remember { mutableStateOf(2) }
    var images = when(currentStep) {
        1->R.drawable.lemon_tree
        2->R.drawable.lemon_squeeze
        3->R.drawable.lemon_drink
        else->R.drawable.lemon_restart

    }
    var textResource = when (currentStep) {
        1->R.string.A1
        2->R.string.A2
        3->R.string.A3
        else->R.string.A4
    }
    var imageDescription = when (currentStep) {
        1->stringResource(R.string.a1)
        2->stringResource(R.string.a2)
        3->stringResource(R.string.a3)
        else->stringResource(R.string.a4)
    }

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {
        // wrapcontentsize Makes the column only as big as its content (instead of filling all available space).
        Column(
            modifier = modifier
                .background(Color(parseColor("#ebe195")))
                .wrapContentSize(Alignment.Center)
                .statusBarsPadding()
                .padding(top = 40.dp)

        ) {
            Text(
                text = stringResource(R.string.app_name),
                textAlign = TextAlign.Center,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(bottom = 20.dp)
            )
        }
        Column(
            modifier = modifier
                .padding(top = 180.dp, bottom = 20.dp)
        ) {
            Image(
               painter =  painterResource(images),
                contentDescription = imageDescription,
                modifier = modifier
                    .width(190.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .background(Color.Cyan)
                    .clickable {
                        when(currentStep) {
                            1 -> {
                                currentStep = 2
                                requiredSqeezeCount = (2..4).random()
                                sequeezeCount = 0
                            }
                            2-> {
                                sequeezeCount++
                                if(sequeezeCount>=requiredSqeezeCount) {
                                    currentStep = 3
                                }
                            }
                            3->{
                                currentStep = 4
                            }
                            4->{
                                currentStep = 1
                            }
                        }
                    }

            )


        }
        Column {
            Text(
                text =stringResource(textResource),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic

            )
        }

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LemonadeTheme {
       LemonadeApp()
    }
}