package com.example.core.navigation

import cafe.adriel.voyager.core.registry.ScreenProvider

sealed class SharedScreen: ScreenProvider {
    data class MovieScreen(val index: Int):SharedScreen()
}