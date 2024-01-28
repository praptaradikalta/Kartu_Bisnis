package com.example.kartubisnis

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ComposeArticleApp(){
    ArtikelCompose(
        imagePainter = painterResource(R.drawable.bg_compose_background),
        title = stringResource(R.string.jetpack_compose_tutorial),
        artikel1 = stringResource(R.string.artikel_1),
        artikel2 = stringResource(R.string.artikel_2),
    )
}

@Composable
private fun ArtikelCompose(
    title: String,
    artikel1: String,
    artikel2: String,
    imagePainter: Painter
) {

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(8.dp)
    ) {
        Image(
            painter = imagePainter,
            contentDescription = null,
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Left
        )
        Text(
            text = artikel1,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = artikel2,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}