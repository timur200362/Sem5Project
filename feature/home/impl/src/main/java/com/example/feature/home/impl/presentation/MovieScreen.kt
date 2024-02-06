package com.example.feature.home.impl.presentation

import android.os.Bundle
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
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.core.designsystem.ModuleappTheme

data class MovieScreen(
    val index: Int,
): Screen {

    @Composable
    override fun Content(){
        ModuleappTheme{
            val screenModel = getScreenModel<MovieScreenModel>()
            Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                Screen()
            }
        }
    }
    @Composable
    fun Screen(viewModel: MovieScreenModel=getScreenModel()) {
        val navigator = LocalNavigator.currentOrThrow
        val state by viewModel.state.collectAsStateWithLifecycle()
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
        ) {
            items(state.movieList) { movie ->
                Text(movie.name ?: "Timur")
                //AsyncImage(model = movie.poster, contentDescription = null, modifier = Modifier.padding(top=120.dp))
            }
        }
    }
}