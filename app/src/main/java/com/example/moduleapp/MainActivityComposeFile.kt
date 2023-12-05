package com.example.moduleapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.core.designsystem.ModuleappTheme
import androidx.compose.ui.Modifier

@Composable
fun DesignCompose(){
    ModuleappTheme{
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            Greeting("Android")
        }
    }
}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
