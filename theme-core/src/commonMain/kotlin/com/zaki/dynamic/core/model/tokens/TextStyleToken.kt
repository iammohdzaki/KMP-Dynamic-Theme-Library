package com.zaki.dynamic.core.model.tokens

import kotlinx.serialization.Serializable

@Serializable
data class TextStyleToken(
    val fontFamily: String? = null,
    val sizeSp: Float,
    val lineHeightSp: Float? = null,
    val weight: Int? = null // 100..900
)