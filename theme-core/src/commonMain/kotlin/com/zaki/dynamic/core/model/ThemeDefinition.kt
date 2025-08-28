package com.zaki.dynamic.core.model

import com.zaki.dynamic.core.model.tokens.ElevationTokens
import com.zaki.dynamic.core.model.tokens.Palette
import com.zaki.dynamic.core.model.tokens.ShapeTokens
import com.zaki.dynamic.core.model.tokens.TypographyTokens
import kotlinx.serialization.Serializable

@Serializable
data class ThemeDefinition(
    val id: ThemeId,
    val displayName: String,
    val palette: Palette,
    val typography: TypographyTokens,
    val shapes: ShapeTokens,
    val elevations: ElevationTokens = ElevationTokens(),
    val meta: Map<String, String> = emptyMap()
)
