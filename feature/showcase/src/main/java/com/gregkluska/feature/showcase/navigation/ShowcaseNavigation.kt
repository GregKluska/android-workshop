package com.gregkluska.feature.showcase.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val ShowcaseRoute = "showcase"

fun NavController.navigateToShowcase(navOptions: NavOptions) = navigate(ShowcaseRoute, navOptions)

fun NavGraphBuilder.showcaseScreen() {
    composable(
        route = ShowcaseRoute,
    ) {
//        ShowcaseRoute()
    }
}
