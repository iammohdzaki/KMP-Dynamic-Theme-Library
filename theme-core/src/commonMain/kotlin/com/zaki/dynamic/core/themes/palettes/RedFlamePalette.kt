package com.zaki.dynamic.core.themes.palettes

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import com.zaki.dynamic.core.model.ThemeDefinition
import com.zaki.dynamic.core.model.ThemeFamily
import com.zaki.dynamic.core.model.ThemeId
import com.zaki.dynamic.core.themes.defaultShapes
import com.zaki.dynamic.core.themes.defaultTypography
import com.zaki.dynamic.core.toPalette

object RedFlamePalette {

    val primaryLight = Color(0xFF8F4A4E)
    val onPrimaryLight = Color(0xFFFFFFFF)
    val primaryContainerLight = Color(0xFFFFDADA)
    val onPrimaryContainerLight = Color(0xFF723338)
    val secondaryLight = Color(0xFF765657)
    val onSecondaryLight = Color(0xFFFFFFFF)
    val secondaryContainerLight = Color(0xFFFFDADA)
    val onSecondaryContainerLight = Color(0xFF5D3F40)
    val tertiaryLight = Color(0xFF76592F)
    val onTertiaryLight = Color(0xFFFFFFFF)
    val tertiaryContainerLight = Color(0xFFFFDDB2)
    val onTertiaryContainerLight = Color(0xFF5C421A)
    val errorLight = Color(0xFFBA1A1A)
    val onErrorLight = Color(0xFFFFFFFF)
    val errorContainerLight = Color(0xFFFFDAD6)
    val onErrorContainerLight = Color(0xFF93000A)
    val backgroundLight = Color(0xFFFFF8F7)
    val onBackgroundLight = Color(0xFF22191A)
    val surfaceLight = Color(0xFFFFF8F7)
    val onSurfaceLight = Color(0xFF22191A)
    val surfaceVariantLight = Color(0xFFF4DDDD)
    val onSurfaceVariantLight = Color(0xFF524343)
    val outlineLight = Color(0xFF857373)
    val outlineVariantLight = Color(0xFFD7C1C1)
    val scrimLight = Color(0xFF000000)
    val inverseSurfaceLight = Color(0xFF382E2E)
    val inverseOnSurfaceLight = Color(0xFFFFEDEC)
    val inversePrimaryLight = Color(0xFFFFB3B6)
    val surfaceDimLight = Color(0xFFE7D6D6)
    val surfaceBrightLight = Color(0xFFFFF8F7)
    val surfaceContainerLowestLight = Color(0xFFFFFFFF)
    val surfaceContainerLowLight = Color(0xFFFFF0F0)
    val surfaceContainerLight = Color(0xFFFCEAE9)
    val surfaceContainerHighLight = Color(0xFFF6E4E4)
    val surfaceContainerHighestLight = Color(0xFFF0DEDE)

    val primaryDark = Color(0xFFFFB3B6)
    val onPrimaryDark = Color(0xFF561D23)
    val primaryContainerDark = Color(0xFF723338)
    val onPrimaryContainerDark = Color(0xFFFFDADA)
    val secondaryDark = Color(0xFFE6BDBD)
    val onSecondaryDark = Color(0xFF44292A)
    val secondaryContainerDark = Color(0xFF5D3F40)
    val onSecondaryContainerDark = Color(0xFFFFDADA)
    val tertiaryDark = Color(0xFFE6C08D)
    val onTertiaryDark = Color(0xFF432C06)
    val tertiaryContainerDark = Color(0xFF5C421A)
    val onTertiaryContainerDark = Color(0xFFFFDDB2)
    val errorDark = Color(0xFFFFB4AB)
    val onErrorDark = Color(0xFF690005)
    val errorContainerDark = Color(0xFF93000A)
    val onErrorContainerDark = Color(0xFFFFDAD6)
    val backgroundDark = Color(0xFF1A1111)
    val onBackgroundDark = Color(0xFFF0DEDE)
    val surfaceDark = Color(0xFF1A1111)
    val onSurfaceDark = Color(0xFFF0DEDE)
    val surfaceVariantDark = Color(0xFF524343)
    val onSurfaceVariantDark = Color(0xFFD7C1C1)
    val outlineDark = Color(0xFF9F8C8C)
    val outlineVariantDark = Color(0xFF524343)
    val scrimDark = Color(0xFF000000)
    val inverseSurfaceDark = Color(0xFFF0DEDE)
    val inverseOnSurfaceDark = Color(0xFF382E2E)
    val inversePrimaryDark = Color(0xFF8F4A4E)
    val surfaceDimDark = Color(0xFF1A1111)
    val surfaceBrightDark = Color(0xFF413737)
    val surfaceContainerLowestDark = Color(0xFF140C0C)
    val surfaceContainerLowDark = Color(0xFF22191A)
    val surfaceContainerDark = Color(0xFF271D1D)
    val surfaceContainerHighDark = Color(0xFF322828)
    val surfaceContainerHighestDark = Color(0xFF3D3232)

    private val lightScheme = lightColorScheme(
        primary = primaryLight,
        onPrimary = onPrimaryLight,
        primaryContainer = primaryContainerLight,
        onPrimaryContainer = onPrimaryContainerLight,
        secondary = secondaryLight,
        onSecondary = onSecondaryLight,
        secondaryContainer = secondaryContainerLight,
        onSecondaryContainer = onSecondaryContainerLight,
        tertiary = tertiaryLight,
        onTertiary = onTertiaryLight,
        tertiaryContainer = tertiaryContainerLight,
        onTertiaryContainer = onTertiaryContainerLight,
        error = errorLight,
        onError = onErrorLight,
        errorContainer = errorContainerLight,
        onErrorContainer = onErrorContainerLight,
        background = backgroundLight,
        onBackground = onBackgroundLight,
        surface = surfaceLight,
        onSurface = onSurfaceLight,
        surfaceVariant = surfaceVariantLight,
        onSurfaceVariant = onSurfaceVariantLight,
        outline = outlineLight,
        outlineVariant = outlineVariantLight,
        scrim = scrimLight,
        inverseSurface = inverseSurfaceLight,
        inverseOnSurface = inverseOnSurfaceLight,
        inversePrimary = inversePrimaryLight,
        surfaceDim = surfaceDimLight,
        surfaceBright = surfaceBrightLight,
        surfaceContainerLowest = surfaceContainerLowestLight,
        surfaceContainerLow = surfaceContainerLowLight,
        surfaceContainer = surfaceContainerLight,
        surfaceContainerHigh = surfaceContainerHighLight,
        surfaceContainerHighest = surfaceContainerHighestLight,
    )

    private val darkScheme = darkColorScheme(
        primary = primaryDark,
        onPrimary = onPrimaryDark,
        primaryContainer = primaryContainerDark,
        onPrimaryContainer = onPrimaryContainerDark,
        secondary = secondaryDark,
        onSecondary = onSecondaryDark,
        secondaryContainer = secondaryContainerDark,
        onSecondaryContainer = onSecondaryContainerDark,
        tertiary = tertiaryDark,
        onTertiary = onTertiaryDark,
        tertiaryContainer = tertiaryContainerDark,
        onTertiaryContainer = onTertiaryContainerDark,
        error = errorDark,
        onError = onErrorDark,
        errorContainer = errorContainerDark,
        onErrorContainer = onErrorContainerDark,
        background = backgroundDark,
        onBackground = onBackgroundDark,
        surface = surfaceDark,
        onSurface = onSurfaceDark,
        surfaceVariant = surfaceVariantDark,
        onSurfaceVariant = onSurfaceVariantDark,
        outline = outlineDark,
        outlineVariant = outlineVariantDark,
        scrim = scrimDark,
        inverseSurface = inverseSurfaceDark,
        inverseOnSurface = inverseOnSurfaceDark,
        inversePrimary = inversePrimaryDark,
        surfaceDim = surfaceDimDark,
        surfaceBright = surfaceBrightDark,
        surfaceContainerLowest = surfaceContainerLowestDark,
        surfaceContainerLow = surfaceContainerLowDark,
        surfaceContainer = surfaceContainerDark,
        surfaceContainerHigh = surfaceContainerHighDark,
        surfaceContainerHighest = surfaceContainerHighestDark,
    )

    private val lightTheme = ThemeDefinition(
        id = ThemeId("red_flame_light"),
        displayName = "Red Flame Light",
        palette = lightScheme.toPalette(false),
        typography = defaultTypography(),
        shapes = defaultShapes(),
        meta = mapOf("materialVersion" to "3", "default" to "true")
    )

    private val darkTheme = ThemeDefinition(
        id = ThemeId("red_flame_dark"),
        displayName = "Red Flame Dark",
        palette = darkScheme.toPalette(true),
        typography = defaultTypography(),
        shapes = defaultShapes(),
        meta = mapOf("materialVersion" to "3", "default" to "true")
    )

    const val FAMILY_ID = "red_flame"
    val redFLameFamily = ThemeFamily(
        id = ThemeId(FAMILY_ID),
        displayName = "Red Flame",
        light = lightTheme,
        dark = darkTheme
    )
}