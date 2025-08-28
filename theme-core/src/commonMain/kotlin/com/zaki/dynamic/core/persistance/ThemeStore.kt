package com.zaki.dynamic.core.persistance

import com.zaki.dynamic.core.model.ThemeSelection

interface ThemeStore { // pluggable persistence
    suspend fun load(): ThemeSelection?
    suspend fun save(selection: ThemeSelection)
}