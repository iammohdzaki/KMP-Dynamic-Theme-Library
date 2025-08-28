package com.zaki.dynamic.core.provider

actual class PlatformSystemThemeProvider actual constructor() : SystemThemeProvider {
    actual override fun isSystemDark(): Boolean {
        return false
    }
}