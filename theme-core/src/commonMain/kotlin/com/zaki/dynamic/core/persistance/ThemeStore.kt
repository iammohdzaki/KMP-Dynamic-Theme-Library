package com.zaki.dynamic.core.persistance

import com.zaki.dynamic.core.model.ThemeSelection

/**
 * Defines a contract for persisting and restoring [ThemeSelection].
 *
 * Implementations of this interface allow the theming system to save
 * and reload the user's chosen theme between app launches.
 *
 * This is intentionally pluggable — you can back it with:
 * - DataStore (recommended)
 * - Multiplatform Settings (recommended)
 * - SharedPreferences
 * - Database
 * - In-memory cache (for testing)
 *
 * Example:
 * ```
 * class DataStoreThemeStore(private val dataStore: DataStore<Preferences>) : ThemeStore {
 *     override suspend fun load(): ThemeSelection? {
 *         // read from DataStore and map to ThemeSelection
 *     }
 *
 *     override suspend fun save(selection: ThemeSelection) {
 *         // persist ThemeSelection to DataStore
 *     }
 * }
 * ```
 */
interface ThemeStore {

    /**
     * Loads the previously saved [ThemeSelection], if available.
     *
     * @return The saved [ThemeSelection], or `null` if none has been saved yet.
     */
    suspend fun load(): ThemeSelection?

    /**
     * Persists the given [ThemeSelection] for future use.
     *
     * @param selection The theme configuration to save.
     */
    suspend fun save(selection: ThemeSelection)
}