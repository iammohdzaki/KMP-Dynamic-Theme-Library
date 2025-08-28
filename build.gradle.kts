plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.compose) apply false
    alias(libs.plugins.kotlinAndroid) apply false
}

allprojects {
    group = "com.zaki.dynamic"
    version = "0.1.0"
}