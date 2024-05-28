package com.gregkluska.feature.animation.pedro

import androidx.annotation.FloatRange
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.gregkluska.feature.animation.R
import com.gregkluska.feature.animation.pedro.RacoonDefaults.HEAD_DROP_MIN
import com.gregkluska.feature.animation.pedro.RacoonDefaults.HEAD_DROP_SPAN

// GK: Refactor

// Credits:
// https://www.freepik.com/free-vector/
// forest-animal-collection_3388708.htm#fromView=search&page=2&position=34&
// uuid=a086202c-d3ca-419f-9a6d-055f84fa9936

@Composable
fun Racoon(
    modifier: Modifier = Modifier,
    @FloatRange(from = 0.0, to = 1.0) headDrop: Float
) {
    val dropValue = HEAD_DROP_SPAN * headDrop + HEAD_DROP_MIN

    Box(modifier = Modifier.then(modifier)) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.body),
            contentDescription = ""
        )
        Image(
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer { translationY = dropValue },
            painter = painterResource(id = R.drawable.head),
            contentDescription = ""
        )
    }
}

private object RacoonDefaults {
    const val HEAD_DROP_MIN: Float = 30f
    const val HEAD_DROP_MAX: Float = 60f
    const val HEAD_DROP_SPAN: Float = HEAD_DROP_MAX - HEAD_DROP_MIN
}

@Preview
@Composable
private fun RacoonPreview() {
//    val infiniteTransition = rememberInfiniteTransition(
//        label = "Head Drop"
//    )

//    val rotate by infiniteTransition.animateFloat(
//        initialValue = 359f,
//        targetValue = 0f,
//        animationSpec = infiniteRepeatable(
//            animation = tween(durationMillis = 6000, easing = LinearEasing),
//            repeatMode = RepeatMode.Restart
//        ),
//        label = "Rotate value"
//    )
//
//    val headDrop by infiniteTransition.animateFloat(
//        initialValue = 0f,
//        targetValue = 1f,
//        animationSpec = infiniteRepeatable(
//            animation = tween(durationMillis = 210),
//            repeatMode = RepeatMode.Reverse
//        ),
//        label = "Head Drop value"
//    )
//
//    val racoonPos by infiniteTransition.animateFloat(
//        initialValue = 600f,
//        targetValue = 100f,
//        animationSpec = infiniteRepeatable(
//            animation = tween(durationMillis = 9000, easing = LinearEasing),
//            repeatMode = RepeatMode.Reverse
//        ),
//        label = "Head Drop value"
//    )

//    Box(
//        modifier = Modifier
//            .fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        Box(
//            modifier = Modifier
//                .size(300.dp)
//                .clip(CircleShape)
//                .background(
//                    brush = Brush.linearGradient(
//                        colors = listOf(Color.White),
//                        end = Offset(0f, Float.POSITIVE_INFINITY)
//                    )
//                )
//        )
//        Box(
//            modifier = Modifier
//                .size(350.dp)
//                .graphicsLayer {
//                    rotationZ = rotate
//                },
//            contentAlignment = Alignment.BottomCenter
//        ) {
//            Racoon(
//                modifier = Modifier
//                    .size(300.dp)
//                    .graphicsLayer {
//                        translationY = racoonPos
//                    },
//                headDrop = headDrop
//            )
//        }
//        // Mask
//        val circleSize = with(LocalDensity.current) { 300.dp.toPx() }
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .drawBehind {
//                    this.drawRect(
//                        color = Color.Black,
//                        blendMode = BlendMode.DstIn
//                    )
//                    val v = circleSize / this.size.width
//                    this.drawRect(
//                        brush = Brush.radialGradient(
//                            v to Color.Transparent,
//                            v to Color.Black,
//                        ),
//                    )
//                }
//        )
//    }
}
