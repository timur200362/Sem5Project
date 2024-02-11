package com.example.feature.homedetail.impl.presentation


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import com.example.core.designsystem.ModuleappTheme
import org.koin.androidx.compose.koinViewModel
import org.koin.core.parameter.parametersOf
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.platform.LocalContext
import com.example.feature.homedetail.impl.data.datasource.remote.response.DetailMovieByIdResponse

@Composable
fun MovieDetailScreen(filmId: Int?){
    ModuleappTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            if (filmId != null) {
                LoadInfo(id = filmId)
            }
        }
    }
}

@Composable
fun LoadInfo(
    id:Int,
    viewModel: MovieDetailViewModel = koinViewModel {parametersOf(id)},
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    val context = LocalContext.current
    Column {
//        AsyncImage(
//            model = state.movieDetailInfo.poster?.url,
//            contentDescription = null,
//            modifier = Modifier
//                .offset(y = 50.dp)
//        )
        Text(
            text = state.movieDetailInfo.name.toString(),
            modifier = Modifier.padding(top = 30.dp)
        )
        Text(
            text = "${state.movieDetailInfo.year}",
            modifier = Modifier
                //.background(Color.Yellow)
                .padding(top = 30.dp)
        )
        Text(
            text = state.movieDetailInfo.description.toString(),
            modifier = Modifier.padding(top = 30.dp)
        )
    }
}
