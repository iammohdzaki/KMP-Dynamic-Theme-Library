package com.zaki.dynamic.theme.theme

/**
 * Created by Zaki on 28-07-2024.
 */
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.zaki.dynamic.core.model.ThemeDefinition
import com.zaki.dynamic.core.model.ThemeFamily
import com.zaki.dynamic.core.model.ThemeId
import com.zaki.dynamic.core.model.tokens.Palette
import com.zaki.dynamic.core.themes.defaultShapes
import com.zaki.dynamic.core.themes.defaultTypography

private val lightScheme = Palette(
    primaryLight,
    onPrimaryLight,
    primaryContainerLight,
    onPrimaryContainerLight,
    secondaryLight,
    onSecondaryLight,
    secondaryContainerLight,
    onSecondaryContainerLight,
    tertiaryLight,
    onTertiaryLight,
    tertiaryContainerLight,
    onTertiaryContainerLight,
    errorLight,
    onErrorLight,
    errorContainerLight,
    onErrorContainerLight,
    backgroundLight,
    onBackgroundLight,
    surfaceLight,
    onSurfaceLight,
    surfaceVariantLight,
    onSurfaceVariantLight,
    outlineLight,
    outlineVariantLight,
    scrimLight,
    inverseSurfaceLight,
    inverseOnSurfaceLight,
    inversePrimaryLight,
    surfaceDimLight,
    surfaceBrightLight,
    surfaceContainerLowestLight,
    surfaceContainerLowLight,
    surfaceContainerLight,
    surfaceContainerHighLight,
    surfaceContainerHighestLight,
    isDark = false
)

private val darkScheme = Palette(
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
    isDark = true
)

// 🌙 Standard Material3
val defaultLightTheme = ThemeDefinition(
    id = ThemeId("default_light"),
    displayName = "Default",
    palette = lightScheme,
    typography = defaultTypography(),
    shapes = defaultShapes(),
    meta = mapOf("materialVersion" to "3", "default" to "true")
)

val defaultDarkTheme = ThemeDefinition(
    id = ThemeId("default_dark"),
    displayName = "Default",
    palette = darkScheme,
    typography = defaultTypography(),
    shapes = defaultShapes(),
    meta = mapOf("materialVersion" to "3", "default" to "true")
)

val defaultFamily = ThemeFamily(
    id = ThemeId("default_family"),
    displayName = "Default",
    light = defaultLightTheme,
    dark = defaultDarkTheme
)