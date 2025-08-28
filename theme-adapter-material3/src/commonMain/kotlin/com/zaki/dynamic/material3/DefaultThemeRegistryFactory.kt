package com.zaki.dynamic.material3

import com.zaki.dynamic.core.registry.DefaultThemeRegistry
import com.zaki.dynamic.core.registry.ThemeRegistry
import com.zaki.dynamic.material3.themes.DefaultMaterial3Themes

object DefaultThemeRegistryFactory {
    fun createWithDefaults(): ThemeRegistry {
        return DefaultThemeRegistry().apply {
            registerAll(DefaultMaterial3Themes.defaults)
        }
    }
}