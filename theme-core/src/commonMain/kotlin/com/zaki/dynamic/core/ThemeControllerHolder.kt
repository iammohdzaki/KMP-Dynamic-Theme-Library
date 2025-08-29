package com.zaki.dynamic.core

import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import com.zaki.dynamic.core.controller.ThemeController

/**
 * A stable wrapper for [ThemeController] to make it usable in Compose.
 *
 * This holder ensures that the [ThemeController] can be provided and consumed
 * via a [androidx.compose.runtime.CompositionLocal] without accidentally breaking stability guarantees.
 *
 * @property controller The [ThemeController] instance managed by this holder.
 */
@Stable
class ThemeControllerHolder(val controller: ThemeController)

/**
 * CompositionLocal that provides access to a [ThemeControllerHolder].
 *
 * This should be set at the root of your Compose hierarchy using [androidx.compose.runtime.CompositionLocalProvider],
 * and can then be accessed anywhere down the tree to control or observe themes.
 *
 * Example:
 * ```
 * CompositionLocalProvider(
 *     LocalThemeController provides ThemeControllerHolder(themeController)
 * ) {
 *     // Inside here, you can access LocalThemeController.current.controller
 *     val controller = LocalThemeController.current.controller
 *     val themeState by controller.state.collectAsState()
 * }
 * ```
 *
 * @throws IllegalStateException if accessed without being provided.
 */
val LocalThemeController = staticCompositionLocalOf<ThemeControllerHolder> {
    error("ThemeController not provided")
}