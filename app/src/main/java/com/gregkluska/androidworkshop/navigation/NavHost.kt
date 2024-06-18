package com.gregkluska.androidworkshop.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.gregkluska.androidworkshop.ui.AppState
import com.gregkluska.feature.showcase.navigation.ShowcaseRoute
import com.gregkluska.feature.showcase.navigation.showcaseScreen
import androidx.navigation.compose.NavHost as AndroidXNavHost

@Composable
fun NavHost(
    modifier: Modifier = Modifier,
    appState: AppState,
    startDestination: String = ShowcaseRoute
) {
    val navController = appState.navController
    AndroidXNavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        showcaseScreen()
    }
}
