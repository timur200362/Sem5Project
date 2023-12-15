package com.example.feature.home.impl.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.core.designsystem.ModuleappTheme

@Composable
fun DesignCompose(){
    ModuleappTheme{
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            LazyColumnSample()
        }
    }
}

@Composable
fun LazyColumnSample() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        item {

        }
        items(100) { position ->
            MyListItem(

            )
        }
    }
}

@Composable
fun MyListItem(

){

}