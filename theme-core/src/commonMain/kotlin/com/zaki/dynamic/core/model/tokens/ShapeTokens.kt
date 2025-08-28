package com.zaki.dynamic.core.model.tokens

import kotlinx.serialization.Serializable

@Serializable
data class ShapeTokens(
    val cornerRadiusDp: Float = 12f,
    val pillRadiusDp: Float = 28f
)