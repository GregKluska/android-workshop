package com.gregkluska.feature.showcase.menu

import com.gregkluska.feature.showcase.R
import com.gregkluska.feature.showcase.navigation.ShowcaseItem

internal val Menu: Map<MenuOption.Group, List<MenuOption>> = listOf(
    MenuOption(
        labelRes = R.string.menu_item_animation_pedro,
        route = ShowcaseItem.Pedro,
        group = MenuOption.Group.Animation
    ),
    MenuOption(
        labelRes = R.string.menu_item_animation_pedro,
        route = ShowcaseItem.Pedro,
        group = MenuOption.Group.Menu
    ),
).groupBy { it.group }
