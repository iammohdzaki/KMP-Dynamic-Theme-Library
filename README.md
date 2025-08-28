# 🌌 Dynamic Theme – Kotlin Multiplatform Library

A **Kotlin Multiplatform** library for **dynamic theme management** using **Jetpack Compose Multiplatform**.

It allows you to:

- Register **custom theme families** (Light + Dark variants)
- Switch between **System / Light / Dark modes**
- Persist theme selection with pluggable **ThemeStore**
- Provide **Material 3 adapters** with support for **custom typography & shapes**
- Preview and switch themes dynamically with a **built-in Theme Picker UI**

---

## ✨ Features
- 🎨 **Theme Registry** – register and manage theme families
- 🛠 **Theme Controller** – central manager for selection, persistence, and system integration
- 📦 **Composable Adapter** – plug your UI with Material 3 (typography, shapes, colors)
- 🌗 **Theme Families** – group Light/Dark variants under a single name
- 💾 **Persistence** – pluggable `ThemeStore` (works with `MultiplatformSettings` or custom stores)
- 🖥 **System-aware** – respects system theme if enabled
- 📱 **Composable UI** – `ThemePickerBottomSheet` & sample `AppScaffold`

---

<p align="center"> <img src="images/img.png" alt="Theme Picker Bottom Sheet Preview" width="400"/> </p>

## 🚀 Installation

Add the dependency to your `commonMain`:

```kotlin
commonMain.dependencies {
    implementation("com.yourorg:dynamic-theme:<version>")
    implementation("com.russhwolf:multiplatform-settings:1.1.1") // if using SettingsThemeStore
}
```

## 📐 Architecture

Below is the high-level architecture of the **Dynamic Theme Multiplatform Library**:

```mermaid
flowchart TD
    subgraph Controller["ThemeController"]
        A1[State Flow]
        A2[Theme Selection]
    end

    subgraph Registry["ThemeRegistry"]
        B1[ThemeDefinition]
        B2[ThemeFamily]
    end

    subgraph Store["ThemeStore"]
        C1[SettingsThemeStore]
        C2[Persistence Layer]
    end

    subgraph System["SystemThemeProvider"]
        D1[Detects Light/Dark Mode]
    end

    subgraph UI["UI Layer"]
        E1[DynamicThemeProvider]
        E2[Material3Adapter]
        E3[AppUI]
    end

    Controller --> Registry
    Controller --> Store
    Controller --> System
    Controller --> UI

    Registry --> B1
    Registry --> B2

    Store --> C1
    Store --> C2

    UI --> E1
    UI --> E2
    UI --> E3
```   

## 🏗 Architecture Overview

```
dynamic-theme/
 ├── core/               # Theme abstractions
 │   ├── ThemeDefinition
 │   ├── ThemeFamily
 │   ├── ThemeRegistry
 │   ├── ThemeController
 │   └── ThemeStore
 ├── adapters/           # Compose adapters (Material 3)
 │   └── Material3Adapter
 ├── persistence/        # Pluggable persistence stores
 │   └── SettingsThemeStore
 └── ui/                 # Optional UI components
     └── ThemePickerBottomSheet
```


---

## 📦 Core Concepts

### 1. ThemeDefinition
Represents a **single theme variant** (Light or Dark).

```kotlin
val lightTheme = ThemeDefinition(
    id = ThemeId("ocean_light"),
    displayName = "Ocean Light",
    palette = lightPalette
)
```

---

### 2. ThemeFamily
A **pair of Light/Dark themes** grouped under a single name.

```kotlin
val oceanFamily = ThemeFamily(
    displayName = "Ocean",
    light = oceanLight,
    dark = oceanDark
)
```

---

### 3. ThemeRegistry
Registers all available themes.

```kotlin
val registry = DefaultThemeRegistry().apply {
    registerFamily(oceanFamily)
    registerFamily(forestFamily)
}
```

---

### 4. ThemeController
Manages active theme, system mode, and persistence.

```kotlin
val controller = ThemeController(
    registry = registry,
    store = SettingsThemeStore(Settings()), // pluggable
    system = PlatformSystemThemeProvider(),
    defaultThemeId = ThemeId("m3_light")
)
```

---

### 5. Compose Adapter
Applies theme to your UI (Material 3).

```kotlin
DynamicThemeProvider(
    controller = controller,
    adapter = Material3Adapter(
        typography = CustomTypography(),
        shapes = CustomShapes()
    )
) {
    AppScaffold()
}
```

---

## 🎨 Theme Picker UI

A ready-to-use **Bottom Sheet** for switching themes:

```kotlin
ThemePickerBottomSheet(
    onDismiss = { showSheet = false }
)
```

It shows:
- **Theme mode toggle** → System / Light / Dark
- **Theme families** → Select from available themes
- **DualVariantCircle** → Preview both Light & Dark variant in one icon

---

## 🛠 Persistence

Implement your own `ThemeStore` if you don’t want to use `MultiplatformSettings`:

```kotlin
interface ThemeStore {
    suspend fun load(): ThemeSelection?
    suspend fun save(selection: ThemeSelection)
}
```

Example: `SettingsThemeStore` using `MultiplatformSettings`.

---

## 🧑‍💻 Sample App

A sample scaffold to showcase theme switching:

```kotlin
Scaffold(
    topBar = {
        TopAppBar(
            title = { Text("Dynamic Theme") },
            actions = {
                IconButton(onClick = { showSheet = true }) {
                    Icon(Icons.Default.ColorLens, contentDescription = "Pick theme")
                }
            }
        )
    }
) { padding ->
    Column(Modifier.padding(padding)) {
        Button(onClick = {}) { Text("Sample Button") }
        OutlinedTextField(value = "", onValueChange = {}, label = { Text("Input") })
        Switch(checked = true, onCheckedChange = {})
    }
}
```

---

## 🔧 Extending the Library

- Add new themes by **registering families** in the registry
- Provide **custom adapters** (e.g., Material 2, your own design system)
- Replace persistence with your own store (e.g., `DataStore`, `Database`)
- Add new UI components (custom pickers, theme previews)

---

## 📄 License
```
MIT License
Copyright (c) 2025
```
