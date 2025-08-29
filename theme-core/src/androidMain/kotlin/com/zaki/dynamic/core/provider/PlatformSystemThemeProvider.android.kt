package com.zaki.dynamic.core.provider

import android.content.res.Configuration
import android.content.res.Resources

actual class PlatformSystemThemeProvider actual constructor() :
    SystemThemeProvider {
    actual override fun isSystemDark(): Boolean {
        val uiMode = Resources.getSystem().configuration.uiMode
        val nightMask = Configuration.UI_MODE_NIGHT_MASK
        return (uiMode and nightMask) == Configuration.UI_MODE_NIGHT_YES
    }
}