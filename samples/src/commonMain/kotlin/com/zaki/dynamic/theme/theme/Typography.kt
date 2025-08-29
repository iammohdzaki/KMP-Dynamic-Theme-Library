package com.zaki.dynamic.theme.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import kmp_dynamic_theme.samples.generated.resources.OpenSansBold
import kmp_dynamic_theme.samples.generated.resources.OpenSansMedium
import kmp_dynamic_theme.samples.generated.resources.OpenSansRegular
import kmp_dynamic_theme.samples.generated.resources.Res
import org.jetbrains.compose.resources.Font

/**
 * Created by Zaki on 21-07-2024.
 */
@Composable
fun SansFontFamily() = FontFamily(
    Font(Res.font.OpenSansRegular, FontWeight.Normal),
    Font(Res.font.OpenSansMedium, FontWeight.Medium),
    Font(Res.font.OpenSansBold, FontWeight.Bold)
)

@Composable
fun SansTypography() = Typography().run {
    val fontFamily = SansFontFamily()
    copy(
        displayLarge = displayLarge.copy(fontFamily = fontFamily),
        displayMedium = displayMedium.copy(fontFamily = fontFamily),
        displaySmall = displaySmall.copy(fontFamily = fontFamily),
        headlineLarge = headlineLarge.copy(fontFamily = fontFamily),
        headlineMedium = headlineMedium.copy(fontFamily = fontFamily),
        headlineSmall = headlineSmall.copy(fontFamily = fontFamily),
        titleLarge = titleLarge.copy(fontFamily = fontFamily),
        titleMedium = titleMedium.copy(fontFamily = fontFamily),
        titleSmall = titleSmall.copy(fontFamily = fontFamily),
        bodyLarge = bodyLarge.copy(fontFamily = fontFamily),
        bodyMedium = bodyMedium.copy(fontFamily = fontFamily),
        bodySmall = bodySmall.copy(fontFamily = fontFamily),
        labelLarge = labelLarge.copy(fontFamily = fontFamily),
        labelMedium = labelMedium.copy(fontFamily = fontFamily),
        labelSmall = labelSmall.copy(fontFamily = fontFamily)
    )
}


