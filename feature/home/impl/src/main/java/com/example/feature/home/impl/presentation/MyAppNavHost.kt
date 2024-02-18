package com.example.feature.home.impl.presentation


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import coil.compose.AsyncImage
import org.koin.androidx.compose.koinViewModel
import com.example.feature.homedetail.impl.presentation.MovieDetailScreen

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
                onNavigateToDetail = {filmId ->
                    navController.navigate("detail/$filmId")
                }
            )
        }
        composable(
            "detail/{filmId}",
            arguments = listOf(navArgument("filmId") {defaultValue = 0})
        ) {backStackEntry ->
            MovieDetailScreen(backStackEntry.arguments?.getInt("filmId"))
        }
    }
}

@Composable
fun MovieScreen(
    viewModel: MovieViewModel=koinViewModel(),
    onNavigateToDetail: (Int) -> Unit
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        items(state.movieList) { movie ->
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable(onClick = { movie.id?.let { onNavigateToDetail(it) } })
                    .padding(vertical = 8.dp)
                    .padding(start = 13.dp, end = 13.dp)
                    .shadow(8.dp, shape = RoundedCornerShape(8.dp))
            ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    AsyncImage(
                        model = movie.poster?.previewUrl,
                        contentDescription = null,
                        modifier = Modifier
                            .size(80.dp)
                            .padding(top = 6.dp, bottom = 6.dp)
                    )
                    Column {
                        Text(
                            text = movie.name.toString(),
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "${movie.genres?.joinToString { it.name }}",
                            fontSize = 18.sp
                        )
                    }
                }
            }
        }
    }
}