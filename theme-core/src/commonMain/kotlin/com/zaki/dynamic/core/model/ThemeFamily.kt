package com.zaki.dynamic.core.model

data class ThemeFamily(
    val id: ThemeId,
    val displayName: String,
    val light: ThemeDefinition,
    val dark: ThemeDefinition
)