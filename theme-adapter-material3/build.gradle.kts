@file:OptIn(ExperimentalWasmDsl::class)

import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.compose)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.maven.publish)
}

group = "com.zaki.dynamic.material3"
version = findProperty("version") as String? ?: "0.0.1"

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

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    signAllPublications()

    coordinates(group.toString(), project.name, version.toString())

    pom {
        name = project.name
        description.set("Kotlin Multiplatform library for themes")
        url.set("https://github.com/iammohdzaki/KMP-Dynamic-Theme-Library")
        inceptionYear = "2025"
        licenses {
            license {
                name = "The Apache License, Version 2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                distribution = "https://www.apache.org/licenses/LICENSE-2.0.txt"
            }
        }
        developers {
            developer {
                id = "iammohdzaki"
                name = "Mohammad Zaki"
                url = "https://github.com/iammohdzaki"
            }
        }
        scm {
            url = "https://github.com/iammohdzaki/KMP-Dynamic-Theme-Library"
            connection = "scm:git:git://github.com/iammohdzaki/KMP-Dynamic-Theme-Library.git"
            developerConnection = "scm:git:ssh://git@github.com/iammohdzaki/KMP-Dynamic-Theme-Library.git"
        }
    }
}
