package com.zaki.dynamic.core.provider

/**
 * Provides information about whether the system is currently using dark mode.
 *
 * This interface is defined as `expect`/`actual`, so each platform
 * (Android, Desktop, iOS, etc.) must supply its own implementation.
 *
 * Example (Android actual):
 * ```
 * actual class PlatformSystemThemeProvider : SystemThemeProvider {
 *     actual override fun isSystemDark(): Boolean {
 *         val uiMode = context.resources.configuration.uiMode
 *         return (uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
 *     }
 * }
 * ```
 */
interface SystemThemeProvider { // expect/actual for platform dark-mode
    /**
     * @return `true` if the system is currently in dark mode, `false` otherwise.
     */
    fun isSystemDark(): Boolean
}