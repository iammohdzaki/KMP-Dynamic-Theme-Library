package com.zaki.dynamic.core.adapter

import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import com.zaki.dynamic.core.model.ThemeDefinition

/**
 * Defines the contract for adapting a [ThemeDefinition] into a Compose [MaterialTheme].
 *
 * Implementations of this interface allow your theming system to be plugged into
 * different versions or styles of Material Design (e.g., Material 2, Material 3, or even
 * a completely custom design system).
 */
interface ComposeThemeAdapter {

    /**
     * Applies a [MaterialTheme] based on the provided [theme].
     *
     * @param theme The [ThemeDefinition] containing palette and metadata for colors.
     * @param typography Optional custom [Typography] to override the default Material typography.
     * @param shapes Optional custom [Shapes] to override the default Material shapes.
     * @param content The composable UI content to be wrapped with the applied theme.
     */
    @Composable
    fun MaterialTheme(
        theme: ThemeDefinition,
        typography: Typography?,
        shapes: Shapes?,
        content: @Composable () -> Unit
    )
}