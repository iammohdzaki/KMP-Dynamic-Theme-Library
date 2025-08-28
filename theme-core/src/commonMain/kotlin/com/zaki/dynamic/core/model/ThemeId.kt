package com.zaki.dynamic.core.model

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class ThemeId(val value: String)

@Serializable
enum class ThemeMode { SYSTEM, LIGHT, DARK }