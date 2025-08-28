package com.zaki.dynamic.theme

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform