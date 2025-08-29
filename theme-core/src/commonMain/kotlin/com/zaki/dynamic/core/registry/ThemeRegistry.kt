package com.zaki.dynamic.core.registry

import com.zaki.dynamic.core.model.ThemeDefinition
import com.zaki.dynamic.core.model.ThemeFamily
import com.zaki.dynamic.core.model.ThemeId

/**
 * A registry for managing [ThemeDefinition]s and [ThemeFamily] groups.
 *
 * The registry allows applications to:
 * - Register individual themes (`register`, `registerAll`)
 * - Register theme families (`registerFamily`, `registerFamilies`)
 * - Retrieve registered themes (`all`, `get`)
 * - Retrieve registered families (`families`)
 *
 * Typical usage:
 * ```
 * val registry: ThemeRegistry = DefaultThemeRegistryFactory.createWithDefaults()
 *
 * // Add a custom theme
 * registry.register(myCustomTheme)
 *
 * // Add a family (light + dark)
 * registry.registerFamily(myThemeFamily)
 *
 * // Query all themes
 * val allThemes = registry.all()
 * ```
 *
 * Implementations may choose to persist themes differently
 * (e.g., in-memory [DefaultThemeRegistry], or a persistent registry).
 */
interface ThemeRegistry {

    /**
     * Registers a single [ThemeDefinition] in the registry.
     *
     * @param theme The theme to register.
     */
    fun register(theme: ThemeDefinition)

    /**
     * Registers a list of [ThemeDefinition]s in the registry.
     *
     * @param themes The list of themes to register.
     */
    fun registerAll(themes: List<ThemeDefinition>)

    /**
     * Returns all registered [ThemeDefinition]s.
     *
     * @return A list of themes, in registration order.
     */
    fun all(): List<ThemeDefinition>

    /**
     * Retrieves a theme by its [ThemeId].
     *
     * @param id The ID of the theme to look up.
     * @return The matching [ThemeDefinition], or `null` if not found.
     */
    fun get(id: ThemeId): ThemeDefinition?

    /**
     * Registers a [ThemeFamily] (a pair of light/dark themes).
     *
     * Both [ThemeFamily.light] and [ThemeFamily.dark] are registered
     * as individual themes, and the family itself is added to the registry.
     *
     * @param family The theme family to register.
     */
    fun registerFamily(family: ThemeFamily)

    /**
     * Registers multiple [ThemeFamily] instances.
     *
     * @param families The list of theme families to register.
     */
    fun registerFamilies(families: List<ThemeFamily>)

    /**
     * Returns all registered [ThemeFamily]s.
     *
     * @return A list of families, in registration order.
     */
    fun families(): List<ThemeFamily>
}