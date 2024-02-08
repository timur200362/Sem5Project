package com.example.feature.home.impl.presentation


import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import com.example.core.designsystem.ModuleappTheme
import com.example.feature.home.impl.data.datasource.memory.Movie
import org.koin.androidx.compose.koinViewModel

@Composable
fun MovieScreen(){
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
            RowImages(movie)
        }
    }
}
@Composable
fun RowImages(movie:Movie){
    LazyRow {
        item {
            AsyncImage(
                model = movie.poster?.previewUrl,
                contentDescription = null,
                modifier = Modifier.size(220.dp).padding(start = 1.dp)
            )
        }
        item {
            Spacer(modifier = Modifier.width(6.dp))
        }
        item {
            AsyncImage(
                model = movie.poster?.previewUrl,
                contentDescription = null,
                modifier = Modifier.size(220.dp).padding(end = 1.dp)
            )
        }
    }
}