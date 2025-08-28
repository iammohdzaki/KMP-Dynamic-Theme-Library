package com.zaki.dynamic.core.controller

import com.zaki.dynamic.core.provider.SystemThemeProvider
import com.zaki.dynamic.core.model.ThemeDefinition
import com.zaki.dynamic.core.model.ThemeFamily
import com.zaki.dynamic.core.model.ThemeId
import com.zaki.dynamic.core.model.ThemeMode
import com.zaki.dynamic.core.model.ThemeSelection
import com.zaki.dynamic.core.model.ThemeState
import com.zaki.dynamic.core.persistance.ThemeStore
import com.zaki.dynamic.core.registry.ThemeRegistry
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class ThemeController(
    private val registry: ThemeRegistry,
    private val store: ThemeStore,
    val system: SystemThemeProvider,
    private val defaultThemeId: ThemeId
) {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private val _state = MutableStateFlow<ThemeState?>(null)
    val state: StateFlow<ThemeState> = _state.filterNotNull().stateIn(
        scope, SharingStarted.Eagerly, initialValue =
            resolve(ThemeSelection(ThemeMode.SYSTEM, null))
    )

    init {
        scope.launch {
            val persisted = store.load() ?: ThemeSelection(
                ThemeMode.SYSTEM,
                null
            )
            _state.value = resolve(persisted)
        }
    }

    fun availableThemes(): List<ThemeDefinition> = registry.all()

    fun getAvailableThemeFamilies(): List<ThemeFamily> = registry.families()

    fun setMode(mode: ThemeMode) {
        update(
            selection =
                current().selection.copy(mode = mode)
        )
    }

    fun setExplicitTheme(themeId: ThemeId?) {
        update(
            selection =
                current().selection.copy(explicitThemeId = themeId)
        )
    }

    private fun update(selection: ThemeSelection) {
        val resolved = resolve(selection)
        _state.value = resolved
        scope.launch { store.save(selection) }
    }

    private fun current(): ThemeState = _state.value ?: resolve(ThemeSelection(ThemeMode.SYSTEM, null))
    private fun resolve(selection: ThemeSelection): ThemeState {
        val isDark = when (selection.mode) {
            ThemeMode.SYSTEM -> system.isSystemDark()
            ThemeMode.DARK -> true
            ThemeMode.LIGHT -> false
        }
        4
        val theme = selection.explicitThemeId?.let { registry.get(it) }
            ?: pickDefault(isDark)
        return ThemeState(selection, theme)
    }

    private fun pickDefault(isDark: Boolean): ThemeDefinition {
        // Strategy: prefer meta["default"]=="true" matching isDark; else first matching; else fallback.
        return registry.all().firstOrNull {
            it.palette.isDark == isDark &&
                    it.meta["default"] == "true"
        }
            ?: registry.all().firstOrNull { it.palette.isDark == isDark }
            ?: registry.get(defaultThemeId)
            ?: registry.all().first()
    }
}
