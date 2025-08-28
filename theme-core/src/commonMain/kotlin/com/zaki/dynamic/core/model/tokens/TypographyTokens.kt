package com.zaki.dynamic.core.model.tokens

import com.zaki.dynamic.core.model.tokens.TextStyleToken
import kotlinx.serialization.Serializable

@Serializable
data class TypographyTokens(
    val displayLarge: TextStyleToken,
    val headlineMedium: TextStyleToken,
    val bodyMedium: TextStyleToken,
    val labelSmall: TextStyleToken,
// ...add what you need
)