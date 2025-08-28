package com.zaki.dynamic.material3

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.zaki.dynamic.core.adapter.ComposeThemeAdapter
import com.zaki.dynamic.core.model.ThemeDefinition

class Material3Adapter : ComposeThemeAdapter {

    @Composable
    override fun MaterialTheme(
        theme: ThemeDefinition,
        typography: Typography?,
        shapes: Shapes?,
        content: @Composable (() -> Unit)
    ) {
        val colors = ColorScheme(
            primary = Color(theme.palette.primary),
            onPrimary = Color(theme.palette.onPrimary),
            primaryContainer = Color(theme.palette.primaryContainer),
            onPrimaryContainer = Color(theme.palette.onPrimaryContainer),
            secondary = Color(theme.palette.secondary),
            onSecondary = Color(theme.palette.onSecondary),
            secondaryContainer = Color(theme.palette.secondaryContainer),
            onSecondaryContainer = Color(theme.palette.onSecondaryContainer),
            tertiary = Color(theme.palette.tertiary),
            onTertiary = Color(theme.palette.onTertiary),
            tertiaryContainer = Color(theme.palette.tertiaryContainer),
            onTertiaryContainer = Color(theme.palette.onTertiaryContainer),
            error = Color(theme.palette.error),
            onError = Color(theme.palette.onError),
            errorContainer = Color(theme.palette.errorContainer),
            onErrorContainer = Color(theme.palette.onErrorContainer),
            background = Color(theme.palette.background),
            onBackground = Color(theme.palette.onBackground),
            surface = Color(theme.palette.surface),
            onSurface = Color(theme.palette.onSurface),
            surfaceVariant = Color(theme.palette.surfaceVariant),
            onSurfaceVariant = Color(theme.palette.onSurfaceVariant),
            outline = Color(theme.palette.outline),
            outlineVariant = Color(theme.palette.outlineVariant),
            scrim = Color(theme.palette.scrim),
            inverseSurface = Color(theme.palette.inverseSurface),
            inverseOnSurface = Color(theme.palette.inverseOnSurface),
            inversePrimary = Color(theme.palette.inversePrimary),
            surfaceDim = Color(theme.palette.surfaceDim),
            surfaceBright = Color(theme.palette.surfaceBright),
            surfaceContainerLowest = Color(theme.palette.surfaceContainerLowest),
            surfaceContainerLow = Color(theme.palette.surfaceContainerLow),
            surfaceContainer = Color(theme.palette.surfaceContainer),
            surfaceContainerHigh = Color(theme.palette.surfaceContainerHigh),
            surfaceContainerHighest = Color(theme.palette.surfaceContainerHighest),
            surfaceTint = Color(theme.palette.primary)
        )

        MaterialTheme(
            colorScheme = colors,
            typography = typography ?: MaterialTheme.typography,
            shapes = shapes ?: MaterialTheme.shapes,
            content = content
        )
    }
}