package com.gregkluska.feature.animation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.gregkluska.feature.animation.AnimationRoute

const val AnimationRoute = "animation_route"

fun NavController.navigateToAnimation(navOptions: NavOptions) = navigate(AnimationRoute, navOptions)

fun NavGraphBuilder.animationScreen() {
    composable(route = AnimationRoute) {
        AnimationRoute()
    }
}
