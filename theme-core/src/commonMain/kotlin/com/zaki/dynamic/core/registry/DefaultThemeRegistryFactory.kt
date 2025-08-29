package com.zaki.dynamic.core.registry

import com.zaki.dynamic.core.themes.DefaultMaterial3Themes

object DefaultThemeRegistryFactory {
    fun createWithDefaults(): ThemeRegistry {
        return DefaultThemeRegistry().apply {
            registerAll(DefaultMaterial3Themes.defaults)
        }
    }
}