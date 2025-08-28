package com.zaki.dynamic.theme.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit

object Styles {
    @Composable
    fun TextStyleNormal(size: TextUnit) =
        TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = size
        )

    @Composable
    fun TextStyleMedium(size: TextUnit) =
        TextStyle(
            fontWeight = FontWeight.Medium,
            fontFamily = SansFontFamily(),
            fontSize = size
        )

    @Composable
    fun TextStyleSemiBold(size: TextUnit) =
        TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontFamily = SansFontFamily(),
            fontSize = size
        )

    @Composable
    fun TextStyleBold(size: TextUnit) =
        TextStyle(
            fontWeight = FontWeight.Bold,
            fontFamily = SansFontFamily(),
            fontSize = size
        )
}