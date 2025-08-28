package com.zaki.dynamic.core.provider

expect class PlatformSystemThemeProvider() : SystemThemeProvider {
    override fun isSystemDark(): Boolean
}