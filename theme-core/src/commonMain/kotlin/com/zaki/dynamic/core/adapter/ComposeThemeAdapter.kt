package com.zaki.dynamic.core.adapter

import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import com.zaki.dynamic.core.model.ThemeDefinition

interface ComposeThemeAdapter {
    @Composable
    fun MaterialTheme(
        theme: ThemeDefinition,
        typography: Typography?,
        shapes: Shapes?,
        content: @Composable () -> Unit
    )
}