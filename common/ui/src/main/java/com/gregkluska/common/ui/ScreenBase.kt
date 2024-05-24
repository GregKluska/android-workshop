package com.gregkluska.common.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenBase(
    modifier: Modifier = Modifier,
    title: String,
    navigationIcon: @Composable () -> Unit,
    actions: @Composable RowScope.() -> Unit,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        modifier = Modifier.then(modifier),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = title)
                },
                navigationIcon = navigationIcon,
                actions = actions
            )
        },
        content = content
    )
}

@Preview
@Composable
private fun ScreenBasePreview() {
    ScreenBase(
        title = "Preview Title",
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
            }
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Settings, contentDescription = "Menu")
            }
        }
    ) {}
}
