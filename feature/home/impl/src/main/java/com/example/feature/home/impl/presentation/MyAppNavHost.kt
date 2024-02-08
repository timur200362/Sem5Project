package com.example.feature.home.impl.presentation


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.example.core.designsystem.ModuleappTheme
import org.koin.androidx.compose.koinViewModel

@Composable
fun MyAppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "movie"
){
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ){
        composable("movie"){
            MovieScreen (
                onNavigateToDetail = {navController.navigate("detail")}
            )
        }
        composable("detail") {
        }
    }
}

@Composable
fun MovieScreen(
    viewModel: MovieViewModel=koinViewModel(),
    onNavigateToDetail: () -> Unit
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        items(state.movieList) { movie ->
            AsyncImage(
                model = movie.poster?.previewUrl,
                contentDescription = null,
                modifier = Modifier
                    .clickable (onClick = onNavigateToDetail)
                    .size(250.dp)
            )
        }
    }
}
//@Composable
//fun RowImages(
//    movie:Movie,
//    //onNavigateToDetail: () -> Unit
//){
//    LazyRow {
//        item {
//            AsyncImage(
//                model = movie.poster?.previewUrl,
//                contentDescription = null,
//                modifier = Modifier
//                    .size(220.dp)
//                    .padding(start = 1.dp)
//            )
//        }
//        item {
//            Spacer(modifier = Modifier.width(6.dp))
//        }
//        item {
//            AsyncImage(
//                model = movie.poster?.previewUrl,
//                contentDescription = null,
//                modifier = Modifier
//                    .size(220.dp)
//                    .padding(end = 1.dp)
//            )
//        }
//    }
//}