package com.zaki.dynamic.core.model

import kotlinx.serialization.Serializable

@Serializable
data class ThemeSelection(
    val mode: ThemeMode,
    val explicitThemeId: ThemeId? = null
)
