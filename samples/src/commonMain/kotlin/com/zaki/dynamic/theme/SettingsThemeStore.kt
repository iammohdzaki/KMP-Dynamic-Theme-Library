package com.zaki.dynamic.theme

import com.russhwolf.settings.Settings
import com.zaki.dynamic.core.model.ThemeSelection
import com.zaki.dynamic.core.persistance.ThemeStore
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class SettingsThemeStore(
    private val settings: Settings
) : ThemeStore {
    private val KEY = "theme.selection.json"
    private val json = Json {
        ignoreUnknownKeys = true
    }

    override suspend fun load(): ThemeSelection? =
        settings.getStringOrNull(KEY)?.let {
            json.decodeFromString<ThemeSelection>(it)
        }

    override suspend fun save(selection: ThemeSelection) {
        settings.putString(KEY, json.encodeToString(selection))
    }
}