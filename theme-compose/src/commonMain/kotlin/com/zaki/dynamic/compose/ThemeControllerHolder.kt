package com.zaki.dynamic.compose

import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import com.zaki.dynamic.core.controller.ThemeController

@Stable
class ThemeControllerHolder(val controller: ThemeController)

val LocalThemeController = staticCompositionLocalOf<ThemeControllerHolder> {
    error("ThemeController not provided")
}