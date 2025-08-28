@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.compose)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.zaki.dynamic.material3"
    compileSdk = 35
    defaultConfig { minSdk = 24 }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
kotlin {
    androidTarget{
        compilations.all {
            kotlinOptions {
                jvmTarget = "17"
            }
        }
    }
    applyDefaultHierarchyTemplate()
    jvm("desktop")
    wasmJs()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":theme-core"))
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
            }
        }
    }
}