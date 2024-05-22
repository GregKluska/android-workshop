package com.gregkluska.ui.pedro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Credits:
// https://www.freepik.com/free-vector/
// forest-animal-collection_3388708.htm#fromView=search&page=2&position=34&
// uuid=a086202c-d3ca-419f-9a6d-055f84fa9936

// Image by freepik

@Composable
fun PedroScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(300.dp)
                .clip(CircleShape)
                .background(Color.White)
        ) {
//            Racoon()
        }
    }
}

@Preview
@Composable
private fun PedroScreenPreview() {
    PedroScreen()
}
