package com.github.se.bootcamp.ui.map

import androidx.compose.runtime.Composable

object MapScreenTestTags {
  const val GOOGLE_MAP_SCREEN = "mapScreen"

  fun getTestTagForTodoMarker(todoId: String): String = "todoMarker_$todoId"
}

@Composable
fun MapScreen(
    /**
     * You can add parameters with default values here, e.g., modifier: Modifier = Modifier,
     * navController: NavHostController = rememberNavController()
     *
     * Note: Parameters with default values do not mean that you should use the default value in
     * your implementation. They ensure that we can still use your code in our tests.
     */
) {}
