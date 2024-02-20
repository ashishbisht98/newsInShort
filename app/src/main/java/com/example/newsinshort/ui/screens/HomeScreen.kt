package com.example.newsinshort.ui.screens

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.newsinshort.ui.components.Loader
import com.example.newsinshort.ui.components.NewsRowComponent
import com.example.newsinshort.ui.viewmodel.NewsViewModel
import com.example.utilities.ResourceState


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    newsViewModel: NewsViewModel = hiltViewModel()
) {

    val newsRes by newsViewModel.news.collectAsState()

    val pagerState = rememberPagerState(0, 0F) { 100 }


    VerticalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize(),
        pageSize = PageSize.Fill,
        pageSpacing = 8.dp
    ) { page: Int ->

        when (newsRes) {
            is ResourceState.Loading -> {
                Log.d("Homescreen", "inside Loading")
                Loader()
            }

            is ResourceState.Success -> {
                Log.d("Homescreen", "inside_Success")
                val response = (newsRes as ResourceState.Success).data
                Log.d(
                    "Homescreen",
                    "inside Success ${response.status} and ${response.totalResults}"
                )

                if(response.articles.isNotEmpty()) {
                    NewsRowComponent(page,response.articles[page])
                }

            }

            is ResourceState.Error -> {
                val error = (newsRes as ResourceState.Error)
                Log.d("Homescreen", "$error")
            }
        }
    }
}


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}