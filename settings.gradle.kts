enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "KMP_Dynamic_Theme"
include(":samples")
include(":theme-core")
include(":theme-compose")
include(":theme-adapter-material3")
include(":theme-dynamic-android")