package com.gregkluska.feature.showcase.menu

import androidx.annotation.StringRes
import com.gregkluska.feature.showcase.R
import com.gregkluska.feature.showcase.navigation.ShowcaseItem

internal data class MenuOption(
    @StringRes val labelRes: Int,
    val route: ShowcaseItem,
    val group: Group
) {
    enum class Group(@StringRes val labelRes: Int) {
        Animation(R.string.menu_item_animation),
        Menu(androidx.compose.ui.R.string.tab),
    }
}
