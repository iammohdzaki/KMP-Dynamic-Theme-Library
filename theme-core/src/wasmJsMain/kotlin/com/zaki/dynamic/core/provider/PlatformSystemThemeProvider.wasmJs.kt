package com.zaki.dynamic.core.provider

actual class PlatformSystemThemeProvider : SystemThemeProvider {
     actual override fun isSystemDark(): Boolean {
        return false
    }
}