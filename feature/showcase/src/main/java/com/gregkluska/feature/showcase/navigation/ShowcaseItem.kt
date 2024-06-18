package com.gregkluska.feature.showcase.navigation

import androidx.navigation.NavController
import androidx.navigation.NavOptions

internal enum class ShowcaseItem {
    Pedro,
    RestAPI
}

internal fun NavController.navigateToShowcaseItem(
    destination: ShowcaseItem,
    navOptions: NavOptions
) = navigate(destination.name, navOptions)
