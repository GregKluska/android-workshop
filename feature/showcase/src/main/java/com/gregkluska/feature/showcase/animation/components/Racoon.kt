package com.gregkluska.feature.showcase.animation.components

import androidx.compose.animation.core.InfiniteTransition
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gregkluska.feature.showcase.R

@Composable
fun Racoon(
    modifier: Modifier = Modifier,
    headDrop: Float
) {
    Box(modifier = Modifier.then(modifier)) {
        Image(
            modifier = Modifier.matchParentSize(),
            painter = painterResource(id = R.drawable.body),
            contentDescription = "Body"
        )
        Image(
            modifier = Modifier
                .matchParentSize()
                .graphicsLayer { translationY = headDrop },
            painter = painterResource(id = R.drawable.head),
            contentDescription = "Head"
        )
    }
}

@Composable
fun CircularMask(
    modifier: Modifier = Modifier,
    radius: Dp,
) {
    val radiusPx = with(LocalDensity.current) { radius.toPx() }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .drawBehind {
                val brushRadius = radiusPx / minOf(size.width, size.height)
                val brush = Brush.radialGradient(
                    brushRadius to Color.Transparent,
                    brushRadius to Color.Black,
                )
                drawRect(brush)
            }
            .then(modifier),
    )
}

@Composable
fun RacoonAnimation(
    modifier: Modifier = Modifier,
    infiniteTransition: InfiniteTransition = rememberInfiniteTransition(label = "Racoon")
) {
    val headDrop by infiniteTransition.animateFloat(
        initialValue = 100f,
        targetValue = 150f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 250),
            repeatMode = RepeatMode.Reverse
        ),
        label = "Head Drop"
    )

    val rotate by infiniteTransition.animateFloat(
        initialValue = 359f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 6000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "Rotate"
    )

    val verticalMovement by infiniteTransition.animateFloat(
        initialValue = 600f,
        targetValue = 100f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 9000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "Vertical Movement"
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .graphicsLayer {
                rotationZ = rotate
            }
            .then(modifier),
        contentAlignment = Alignment.Center,
    ) {
        Racoon(
            modifier = Modifier
                .size(300.dp)
                .graphicsLayer {
                    this.translationY = verticalMovement
                },
            headDrop = headDrop
        )
    }
    CircularMask(radius = 310.dp)
}

@Preview
@Composable
fun RacoonPreview() {
    Box {
        RacoonAnimation()
    }
}
