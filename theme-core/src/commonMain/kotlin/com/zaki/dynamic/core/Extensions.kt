package com.zaki.dynamic.core

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.toArgb
import com.zaki.dynamic.core.model.tokens.Palette

fun ColorScheme.toPalette(isDark: Boolean): Palette {
    return Palette(
        primary = primary.toArgb().toLong() and 0xFFFFFFFF,
        onPrimary = onPrimary.toArgb().toLong() and 0xFFFFFFFF,
        primaryContainer = primaryContainer.toArgb().toLong() and 0xFFFFFFFF,
        onPrimaryContainer = onPrimaryContainer.toArgb().toLong() and 0xFFFFFFFF,
        secondary = secondary.toArgb().toLong() and 0xFFFFFFFF,
        onSecondary = onSecondary.toArgb().toLong() and 0xFFFFFFFF,
        secondaryContainer = secondaryContainer.toArgb().toLong() and 0xFFFFFFFF,
        onSecondaryContainer = onSecondaryContainer.toArgb().toLong() and 0xFFFFFFFF,
        tertiary = tertiary.toArgb().toLong() and 0xFFFFFFFF,
        onTertiary = onTertiary.toArgb().toLong() and 0xFFFFFFFF,
        tertiaryContainer = tertiaryContainer.toArgb().toLong() and 0xFFFFFFFF,
        onTertiaryContainer = onTertiaryContainer.toArgb().toLong() and 0xFFFFFFFF,
        error = error.toArgb().toLong() and 0xFFFFFFFF,
        onError = onError.toArgb().toLong() and 0xFFFFFFFF,
        errorContainer = errorContainer.toArgb().toLong() and 0xFFFFFFFF,
        onErrorContainer = onErrorContainer.toArgb().toLong() and 0xFFFFFFFF,
        background = background.toArgb().toLong() and 0xFFFFFFFF,
        onBackground = onBackground.toArgb().toLong() and 0xFFFFFFFF,
        surface = surface.toArgb().toLong() and 0xFFFFFFFF,
        onSurface = onSurface.toArgb().toLong() and 0xFFFFFFFF,
        surfaceVariant = surfaceVariant.toArgb().toLong() and 0xFFFFFFFF,
        onSurfaceVariant = onSurfaceVariant.toArgb().toLong() and 0xFFFFFFFF,
        outline = outline.toArgb().toLong() and 0xFFFFFFFF,
        outlineVariant = outlineVariant.toArgb().toLong() and 0xFFFFFFFF,
        scrim = scrim.toArgb().toLong() and 0xFFFFFFFF,
        inverseSurface = inverseSurface.toArgb().toLong() and 0xFFFFFFFF,
        inverseOnSurface = inverseOnSurface.toArgb().toLong() and 0xFFFFFFFF,
        inversePrimary = inversePrimary.toArgb().toLong() and 0xFFFFFFFF,
        surfaceDim = surfaceDim.toArgb().toLong() and 0xFFFFFFFF,
        surfaceBright = surfaceBright.toArgb().toLong() and 0xFFFFFFFF,
        surfaceContainerLowest = surfaceContainerLowest.toArgb().toLong() and 0xFFFFFFFF,
        surfaceContainerLow = surfaceContainerLow.toArgb().toLong() and 0xFFFFFFFF,
        surfaceContainer = surfaceContainer.toArgb().toLong() and 0xFFFFFFFF,
        surfaceContainerHigh = surfaceContainerHigh.toArgb().toLong() and 0xFFFFFFFF,
        surfaceContainerHighest = surfaceContainerHighest.toArgb().toLong() and 0xFFFFFFFF,
        isDark = isDark
    )
}