package com.zaki.dynamic.core.themes

import com.zaki.dynamic.core.themes.palettes.LeafGreenPalette
import com.zaki.dynamic.core.themes.palettes.RedFlamePalette
import com.zaki.dynamic.core.themes.palettes.TreeBrownPalette

object DefaultMaterial3Themes {

    fun getFamilies() = listOf(
        TreeBrownPalette.treeBrownFamily,
        LeafGreenPalette.leafGreenFamily,
        RedFlamePalette.redFLameFamily
    )

    fun getDefaults() = getFamilies().flatMap { listOf(it.light, it.dark) }
}