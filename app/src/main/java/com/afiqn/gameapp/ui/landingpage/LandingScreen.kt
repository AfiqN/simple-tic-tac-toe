package com.afiqn.gameapp.ui.landingpage

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.afiqn.gameapp.R
import com.afiqn.gameapp.ui.theme.AppTheme

@Composable
fun LandingScreen() {
    Row(
        modifier = Modifier
            .fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        OptionButton(
            text = "Vs Player",
            icon = painterResource(id = R.drawable.ic_player)
        )
        Spacer(modifier = Modifier.size(24.dp))
        OptionButton(
            text = "Vs AI",
            icon = painterResource(id = R.drawable.ic_computer)
        )
    }
}

@Composable
fun OptionButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    text: String,
    icon: Painter? = null
) {
    Box(
        modifier = modifier
            .size(90.dp)
            .clickable { onClick() }
            .border(
                1.dp,
                Color.Black,
                Shapes().medium
            )
            .clip(Shapes().medium),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            if (icon != null) {
                Icon(
                    modifier = Modifier
                        .weight(1f)
                        .size(50.dp),
                    painter = icon,
                    contentDescription = null
                )
            }
            Text(
                modifier = Modifier
                    .padding(bottom = 8.dp),
                text = text
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AppTheme {
        LandingScreen()
    }
}