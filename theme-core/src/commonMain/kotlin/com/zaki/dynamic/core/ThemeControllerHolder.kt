package com.zaki.dynamic.core

import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import com.zaki.dynamic.core.controller.ThemeController

@Stable
class ThemeControllerHolder(val controller: ThemeController)

val LocalThemeController = staticCompositionLocalOf<ThemeControllerHolder> {
    error("ThemeController not provided")
}