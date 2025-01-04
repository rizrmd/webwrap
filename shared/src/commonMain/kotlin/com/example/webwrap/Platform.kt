package com.example.webwrap

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform