package com.zaki.dynamic.core.themes

import com.zaki.dynamic.core.model.tokens.ShapeTokens
import com.zaki.dynamic.core.model.tokens.TextStyleToken
import com.zaki.dynamic.core.model.tokens.TypographyTokens

fun defaultTypography() = TypographyTokens(
    displayLarge = TextStyleToken(sizeSp = 48f, weight = 700),
    headlineMedium = TextStyleToken(sizeSp = 28f, weight = 600),
    bodyMedium = TextStyleToken(sizeSp = 16f),
    labelSmall = TextStyleToken(sizeSp = 11f)
)

fun defaultShapes() = ShapeTokens(
    cornerRadiusDp = 12f,
    pillRadiusDp = 28f
)