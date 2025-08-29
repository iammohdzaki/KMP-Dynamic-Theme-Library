package com.zaki.dynamic.core.provider

import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.zaki.dynamic.core.LocalThemeController
import com.zaki.dynamic.core.ThemeControllerHolder
import com.zaki.dynamic.core.adapter.ComposeThemeAdapter
import com.zaki.dynamic.core.controller.ThemeController

@Composable
fun DynamicThemeProvider(
    controller: ThemeController,
    adapter: ComposeThemeAdapter, // material2 or material3 (see below)
    typography: Typography? = null,
    shapes: Shapes? = null,
    content: @Composable () -> Unit
) {
    val state by controller.state.collectAsState()
    CompositionLocalProvider(
        LocalThemeController provides
                ThemeControllerHolder(controller)
    ) {
        adapter.MaterialTheme(state.resolved, typography, shapes) {
            content()
        }
    }
}
