package com.example.feature.homedetail.impl.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MovieDetailScreen(filmId: Int?){
    Text(text = "Film ID:$filmId")
}