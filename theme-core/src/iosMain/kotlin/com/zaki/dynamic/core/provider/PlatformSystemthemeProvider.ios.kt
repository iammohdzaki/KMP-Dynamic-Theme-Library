package com.zaki.dynamic.core.provider

import platform.UIKit.UIScreen
import platform.UIKit.UITraitCollection
import platform.UIKit.UIUserInterfaceStyleDark
import platform.UIKit.UIUserInterfaceStyleLight
import platform.UIKit.UIUserInterfaceStyleUnspecified

actual class PlatformSystemThemeProvider actual constructor() : SystemThemeProvider {
    override fun isSystemDark(): Boolean {
        val style = UIScreen.mainScreen.traitCollection.userInterfaceStyle
        return when (style) {
            UIUserInterfaceStyleDark -> true
            UIUserInterfaceStyleLight -> false
            UIUserInterfaceStyleUnspecified -> false // fallback
            else -> false
        }
    }
}