package com.zaki.dynamic.core.registry

import com.zaki.dynamic.core.model.ThemeDefinition
import com.zaki.dynamic.core.model.ThemeFamily
import com.zaki.dynamic.core.model.ThemeId

/**
 * Default in-memory implementation of [ThemeRegistry].
 *
 * Stores themes and families in ordered maps, preserving registration order.
 * This implementation is lightweight and suitable for most applications.
 */
internal class DefaultThemeRegistry : ThemeRegistry {
    private val map = LinkedHashMap<String, ThemeDefinition>()
    private val familyMap = LinkedHashMap<String, ThemeFamily>()

    override fun register(theme: ThemeDefinition) {
        map[theme.id.value] = theme
    }

    override fun registerAll(themes: List<ThemeDefinition>) {
        themes.forEach(::register)
    }

    override fun all(): List<ThemeDefinition> = map.values.toList()

    override fun get(id: ThemeId) = map[id.value]

    override fun registerFamily(family: ThemeFamily) {
        register(family.light)
        register(family.dark)
        familyMap[family.id.value] = family
    }

    override fun registerFamilies(families: List<ThemeFamily>) {
        families.forEach(::registerFamily)
    }

    override fun families(): List<ThemeFamily> = familyMap.values.toList()
}