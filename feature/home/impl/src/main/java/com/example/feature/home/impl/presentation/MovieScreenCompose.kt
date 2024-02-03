package com.example.feature.home.impl.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.core.designsystem.ModuleappTheme
import org.koin.androidx.compose.koinViewModel

@Composable
fun DesignCompose(){
    ModuleappTheme{
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            LazyColumnSample()
        }
    }
}

@Composable
fun LazyColumnSample(viewModel: MovieViewModel=koinViewModel()) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        items(state.movieList) { movie ->
            Text(movie.name)
        }
    }
}