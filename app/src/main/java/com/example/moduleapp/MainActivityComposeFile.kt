package com.example.moduleapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.core.designsystem.ModuleappTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun DesignCompose(){
    ModuleappTheme{
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        }
    }
}