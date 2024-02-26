package com.example.feature.homedetail.impl.presentation


import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
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
    val context = LocalContext.current
    val state by viewModel.state.collectAsStateWithLifecycle()
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        AsyncImage(
            model = state.movieDetailInfo.poster?.url,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = state.movieDetailInfo.name.toString(),
            modifier = Modifier.padding(top = 30.dp),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "${state.movieDetailInfo.year}",
            color = Color(255, 140, 0),
            modifier = Modifier
                .padding(top = 30.dp),
            fontSize = 18.sp
        )
        state.movieDetailInfo.genres?.let {
            Text(
                text = "Жанр: ${it.joinToString { it?.name.toString() }}",
                modifier = Modifier.padding(top = 30.dp),
                fontSize = 18.sp
            )
        }
        state.movieDetailInfo.countries?.let {
            Text(
                text = "Страна: ${it.joinToString { it?.name.toString() }}",
                modifier = Modifier.padding(top = 30.dp),
                fontSize = 18.sp
            )
        }
        Text(
            text = state.movieDetailInfo.description.toString(),
            modifier = Modifier.padding(top = 30.dp),
            fontSize = 18.sp
        )
        Text(
            text = "Трейлеры",
            modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        state.movieDetailInfo.videos?.trailers?.map { trailer ->
            ClickableText(
                text = AnnotatedString( trailer?.name ?:  ""),
                onClick = {
                    val url = trailer?.url
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                    context.startActivity(intent)
                },
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}
