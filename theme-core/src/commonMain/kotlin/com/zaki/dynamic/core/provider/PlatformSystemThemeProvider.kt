package com.zaki.dynamic.core.provider

/**
 * `expect` declaration for platform-specific implementation of [SystemThemeProvider].
 *
 * Each target platform (e.g., Android, Desktop, iOS) must provide an `actual class`
 * that determines whether the system is in dark mode.
 */
expect class PlatformSystemThemeProvider() : SystemThemeProvider {
    override fun isSystemDark(): Boolean
}