package com.zaki.dynamic.core.themes

import com.zaki.dynamic.core.model.ThemeDefinition
import com.zaki.dynamic.core.model.ThemeFamily
import com.zaki.dynamic.core.model.ThemeId

object DefaultMaterial3Themes {

    // 🌙 Standard Material3
    val lightTheme = ThemeDefinition(
        id = ThemeId("m3_light"),
        displayName = "Material3 Light",
        palette = Material3Palettes.light,
        typography = defaultTypography(),
        shapes = defaultShapes(),
        meta = mapOf("materialVersion" to "3", "default" to "true")
    )

    val darkTheme = ThemeDefinition(
        id = ThemeId("m3_dark"),
        displayName = "Material3 Dark",
        palette = Material3Palettes.dark,
        typography = defaultTypography(),
        shapes = defaultShapes(),
        meta = mapOf("materialVersion" to "3", "default" to "true")
    )

    val standard = ThemeFamily(
        id = ThemeId("standard"),
        displayName = "Standard",
        light = lightTheme,
        dark = darkTheme
    )

    // 🌊 Ocean
    val oceanLight = ThemeDefinition(
        id = ThemeId("ocean_light"),
        displayName = "Ocean Light",
        palette = Material3Palettes.oceanLight,
        typography = defaultTypography(),
        shapes = defaultShapes()
    )

    val oceanDark = ThemeDefinition(
        id = ThemeId("ocean_dark"),
        displayName = "Ocean Dark",
        palette = Material3Palettes.oceanDark,
        typography = defaultTypography(),
        shapes = defaultShapes()
    )

    val ocean = ThemeFamily(
        id = ThemeId("ocean"),
        displayName = "Ocean",
        light = oceanLight,
        dark = oceanDark
    )

    // 🌅 Sunset
    val sunsetLight = ThemeDefinition(
        id = ThemeId("sunset_light"),
        displayName = "Sunset Light",
        palette = Material3Palettes.sunsetLight,
        typography = defaultTypography(),
        shapes = defaultShapes()
    )

    val sunsetDark = ThemeDefinition(
        id = ThemeId("sunset_dark"),
        displayName = "Sunset Dark",
        palette = Material3Palettes.sunsetDark,
        typography = defaultTypography(),
        shapes = defaultShapes()
    )

    val sunset = ThemeFamily(
        id = ThemeId("sunset"),
        displayName = "Sunset",
        light = sunsetLight,
        dark = sunsetDark
    )

    val families = listOf(standard, ocean, sunset)
    val defaults: List<ThemeDefinition> = families.flatMap { listOf(it.light, it.dark) }
}