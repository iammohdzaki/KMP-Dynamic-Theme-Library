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

    // 🍃 Forest
    val forestLight = ThemeDefinition(
        id = ThemeId("forest_light"),
        displayName = "Forest Light",
        palette = Material3Palettes.forestLight,
        typography = defaultTypography(),
        shapes = defaultShapes()
    )

    val forestDark = ThemeDefinition(
        id = ThemeId("forest_dark"),
        displayName = "Forest Dark",
        palette = Material3Palettes.forestDark,
        typography = defaultTypography(),
        shapes = defaultShapes()
    )

    val forest = ThemeFamily(
        id = ThemeId("forest"),
        displayName = "Forest",
        light = forestLight,
        dark = forestDark
    )

    // 🌸 Blossom
    val blossomLight = ThemeDefinition(
        id = ThemeId("blossom_light"),
        displayName = "Blossom Light",
        palette = Material3Palettes.blossomLight,
        typography = defaultTypography(),
        shapes = defaultShapes()
    )

    val blossomDark = ThemeDefinition(
        id = ThemeId("blossom_dark"),
        displayName = "Blossom Dark",
        palette = Material3Palettes.blossomDark,
        typography = defaultTypography(),
        shapes = defaultShapes()
    )

    val blossom = ThemeFamily(
        id = ThemeId("blossom"),
        displayName = "Blossom",
        light = blossomLight,
        dark = blossomDark
    )

    // 🔥 Volcano
    val volcanoLight = ThemeDefinition(
        id = ThemeId("volcano_light"),
        displayName = "Volcano Light",
        palette = Material3Palettes.volcanoLight,
        typography = defaultTypography(),
        shapes = defaultShapes()
    )

    val volcanoDark = ThemeDefinition(
        id = ThemeId("volcano_dark"),
        displayName = "Volcano Dark",
        palette = Material3Palettes.volcanoDark,
        typography = defaultTypography(),
        shapes = defaultShapes()
    )

    val volcano = ThemeFamily(
        id = ThemeId("volcano"),
        displayName = "Volcano",
        light = volcanoLight,
        dark = volcanoDark
    )

    // ❄️ Arctic
    val arcticLight = ThemeDefinition(
        id = ThemeId("arctic_light"),
        displayName = "Arctic Light",
        palette = Material3Palettes.arcticLight,
        typography = defaultTypography(),
        shapes = defaultShapes()
    )

    val arcticDark = ThemeDefinition(
        id = ThemeId("arctic_dark"),
        displayName = "Arctic Dark",
        palette = Material3Palettes.arcticDark,
        typography = defaultTypography(),
        shapes = defaultShapes()
    )

    val arctic = ThemeFamily(
        id = ThemeId("arctic"),
        displayName = "Arctic",
        light = arcticLight,
        dark = arcticDark
    )

    // ⚡ Neon
    val neonLight = ThemeDefinition(
        id = ThemeId("neon_light"),
        displayName = "Neon Light",
        palette = Material3Palettes.neonLight,
        typography = defaultTypography(),
        shapes = defaultShapes()
    )

    val neonDark = ThemeDefinition(
        id = ThemeId("neon_dark"),
        displayName = "Neon Dark",
        palette = Material3Palettes.neonDark,
        typography = defaultTypography(),
        shapes = defaultShapes()
    )

    val neon = ThemeFamily(
        id = ThemeId("neon"),
        displayName = "Neon",
        light = neonLight,
        dark = neonDark
    )

    // 👇 Collect them all
    val families = listOf(
        standard, ocean, sunset,
        forest, blossom, volcano,
        arctic, neon
    )
    val defaults: List<ThemeDefinition> = families.flatMap { listOf(it.light, it.dark) }
}