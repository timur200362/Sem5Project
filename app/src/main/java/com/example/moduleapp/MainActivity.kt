package com.example.moduleapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.ComponentActivity
import cafe.adriel.voyager.core.registry.ScreenRegistry
import cafe.adriel.voyager.navigator.Navigator
import com.example.core.navigation.SharedScreen
import com.example.feature.home.impl.presentation.MovieScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ScreenRegistry {
            register<SharedScreen.MovieScreen> { provider->
                MovieScreen(0)
            }
        }

        setContent {
            Navigator(MovieScreen(0)){
            }
        }
    }
}