package com.zaki.dynamic.core.registry

import com.zaki.dynamic.core.themes.DefaultMaterial3Themes

/**
 * Factory for creating a [ThemeRegistry] pre-populated with default themes.
 *
 * Example:
 * ```
 * val registry = DefaultThemeRegistryFactory.createWithDefaults()
 * val themes = registry.all()
 * ```
 */
object DefaultThemeRegistryFactory {

    /**
     * Creates a [DefaultThemeRegistry] and registers [DefaultMaterial3Themes.defaults].
     *
     * @return A [ThemeRegistry] containing default Material 3 themes.
     */
    fun createWithDefaults(): ThemeRegistry {
        return DefaultThemeRegistry().apply {
            // Register families first (this auto-registers light & dark)
            registerFamilies(DefaultMaterial3Themes.families)

            // If you also want to support "loose" themes not in a family:
            registerAll(DefaultMaterial3Themes.defaults)
        }
    }
}