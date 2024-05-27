package com.gregkluska.feature.animation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.gregkluska.common.ui.ScreenBase

@Composable
internal fun AnimationRoute(
    modifier: Modifier = Modifier,
    viewModel: AnimationViewModel = hiltViewModel(),
) {
    AnimationScreen(
        modifier = modifier,
        viewModel = viewModel
    )
}

@Composable
fun AnimationScreen(
    modifier: Modifier = Modifier,
    viewModel: AnimationViewModel,
) {
    ScreenBase(
        modifier = Modifier.then(modifier),
        title = stringResource(R.string.title),
        navigationIcon = { Text(viewModel.test) },
        actions = {}
    ) {
    }
}

@Preview
@Composable
private fun AnimationScreenPreview() {
    AnimationScreen(
        modifier = Modifier,
        viewModel = AnimationViewModel()
    )
}
