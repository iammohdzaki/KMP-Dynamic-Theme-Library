package com.zaki.dynamic.core.provider

interface SystemThemeProvider { // expect/actual for platform dark-mode
    fun isSystemDark(): Boolean
}