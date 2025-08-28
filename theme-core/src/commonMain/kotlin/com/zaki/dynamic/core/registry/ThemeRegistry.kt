package com.zaki.dynamic.core.registry

import com.zaki.dynamic.core.model.ThemeDefinition
import com.zaki.dynamic.core.model.ThemeFamily
import com.zaki.dynamic.core.model.ThemeId

interface ThemeRegistry {
    fun register(theme: ThemeDefinition)
    fun registerAll(themes: List<ThemeDefinition>)
    fun all(): List<ThemeDefinition>
    fun get(id: ThemeId): ThemeDefinition?
    // 👇 Family support
    fun registerFamily(family: ThemeFamily) {
        register(family.light)
        register(family.dark)
        _families[family.id.value] = family
    }

    fun registerFamilies(families: List<ThemeFamily>) {
        families.forEach(::registerFamily)
    }

    fun families(): List<ThemeFamily>

    companion object {
        private val _families = LinkedHashMap<String, ThemeFamily>()
    }
}
