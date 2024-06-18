package com.gregkluska.feature.showcase.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
internal fun MenuScreen(
    modifier: Modifier = Modifier,
    menuList: Map<MenuOption.Group, List<MenuOption>>
) {
    LazyColumn(
        modifier = modifier
    ) {
        menuList.forEach { (group, menuOptions) ->
            item {
                Column(
                    modifier = Modifier
                        .background(Color.LightGray)
                        .fillParentMaxWidth()
                        .padding(16.dp, 8.dp)
                ) {
                    Text(
                        text = stringResource(id = group.labelRes).uppercase(),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            items(menuOptions) {
                ListItem(
                    headlineContent = { Text(text = stringResource(id = it.labelRes)) }
                )
            }
        }
    }
}

@Preview
@Composable
private fun MenuScreenPreview() {
    MenuScreen(menuList = Menu)
}
