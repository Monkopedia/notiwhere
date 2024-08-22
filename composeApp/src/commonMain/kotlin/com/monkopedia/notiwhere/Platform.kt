package com.monkopedia.notiwhere

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform