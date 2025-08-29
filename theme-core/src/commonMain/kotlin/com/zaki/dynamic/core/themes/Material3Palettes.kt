package com.zaki.dynamic.core.themes

import com.zaki.dynamic.core.model.tokens.Palette

object Material3Palettes {
    val light = Palette(
        primary = 0xFF6750A4,
        onPrimary = 0xFFFFFFFF,
        primaryContainer = 0xFFEADDFF,
        onPrimaryContainer = 0xFF21005D,
        secondary = 0xFF625B71,
        onSecondary = 0xFFFFFFFF,
        secondaryContainer = 0xFFE8DEF8,
        onSecondaryContainer = 0xFF1D192B,
        tertiary = 0xFF7D5260,
        onTertiary = 0xFFFFFFFF,
        tertiaryContainer = 0xFFFFD8E4,
        onTertiaryContainer = 0xFF31111D,
        error = 0xFFB3261E,
        onError = 0xFFFFFFFF,
        errorContainer = 0xFFF9DEDC,
        onErrorContainer = 0xFF410E0B,
        background = 0xFFFFFBFE,
        onBackground = 0xFF1C1B1F,
        surface = 0xFFFFFBFE,
        onSurface = 0xFF1C1B1F,
        surfaceVariant = 0xFFE7E0EC,
        onSurfaceVariant = 0xFF49454F,
        outline = 0xFF79747E,
        outlineVariant = 0xFFCAC4D0,
        scrim = 0xFF000000,
        inverseSurface = 0xFF313033,
        inverseOnSurface = 0xFFF4EFF4,
        inversePrimary = 0xFFD0BCFF,
        surfaceDim = 0xFFDED8E1,
        surfaceBright = 0xFFFBF8FD,
        surfaceContainerLowest = 0xFFFFFFFF,
        surfaceContainerLow = 0xFFF7F2FA,
        surfaceContainer = 0xFFF3EDF7,
        surfaceContainerHigh = 0xFFECE6F0,
        surfaceContainerHighest = 0xFFE6E0EA,
        isDark = false
    )
    val dark = Palette(
        primary = 0xFFD0BCFF,
        onPrimary = 0xFF381E72,
        primaryContainer = 0xFF4F378B,
        onPrimaryContainer = 0xFFEADDFF,
        secondary = 0xFFCCC2DC,
        onSecondary = 0xFF332D41,
        secondaryContainer = 0xFF4A4458,
        onSecondaryContainer = 0xFFE8DEF8,
        tertiary = 0xFFEFB8C8,
        onTertiary = 0xFF492532,
        tertiaryContainer = 0xFF633B48,
        onTertiaryContainer = 0xFFFFD8E4,
        error = 0xFFF2B8B5,
        onError = 0xFF601410,
        errorContainer = 0xFF8C1D18,
        onErrorContainer = 0xFFF9DEDC,
        background = 0xFF1C1B1F,
        onBackground = 0xFFE6E1E5,
        surface = 0xFF1C1B1F,
        onSurface = 0xFFE6E1E5,
        surfaceVariant = 0xFF49454F,
        onSurfaceVariant = 0xFFCAC4D0,
        outline = 0xFF938F99,
        outlineVariant = 0xFF49454F,
        scrim = 0xFF000000,
        inverseSurface = 0xFFE6E1E5,
        inverseOnSurface = 0xFF313033,
        inversePrimary = 0xFF6750A4,
        surfaceDim = 0xFF141218,
        surfaceBright = 0xFF3B383E,
        surfaceContainerLowest = 0xFF0F0D13,
        surfaceContainerLow = 0xFF1D1B20,
        surfaceContainer = 0xFF211F26,
        surfaceContainerHigh = 0xFF2B2930,
        surfaceContainerHighest = 0xFF36343B,
        isDark = true
    )

    // 🌊 Ocean tones
    val oceanLight = light.copy(
        primary = 0xFF0EA5FF,
        onPrimary = 0xFFFFFFFF,
        secondary = 0xFF22D3EE,
        tertiary = 0xFF0284C7,
        background = 0xFFE0F7FF,
        surface = 0xFFE6F9FF,
        isDark = false
    )

    val oceanDark = dark.copy(
        primary = 0xFF38BDF8,
        onPrimary = 0xFF001018,
        secondary = 0xFF06B6D4,
        tertiary = 0xFF0EA5E9,
        background = 0xFF021B2D,
        surface = 0xFF06202F,
        isDark = true
    )

    // 🌅 Sunset tones
    val sunsetLight = light.copy(
        primary = 0xFFFF6B6B,
        onPrimary = 0xFFFFFFFF,
        secondary = 0xFFFF9F43,
        tertiary = 0xFFFFC046,
        background = 0xFFFFF5E6,
        surface = 0xFFFFF0E0,
        isDark = false
    )

    val sunsetDark = dark.copy(
        primary = 0xFFFF8787,
        onPrimary = 0xFF2D0000,
        secondary = 0xFFFFB347,
        tertiary = 0xFFFFD26F,
        background = 0xFF1A0E0E,
        surface = 0xFF2D1C1C,
        isDark = true
    )
}