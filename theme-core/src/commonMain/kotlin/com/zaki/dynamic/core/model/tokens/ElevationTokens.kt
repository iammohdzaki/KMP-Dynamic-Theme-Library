package com.zaki.dynamic.core.model.tokens

import kotlinx.serialization.Serializable

@Serializable
data class ElevationTokens(
    val level0: Float = 0f,
    val level1: Float = 1f,
    val level2: Float = 3f,
    val level3: Float = 6f
)