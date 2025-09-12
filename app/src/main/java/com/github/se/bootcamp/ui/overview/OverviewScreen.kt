package com.github.se.bootcamp.ui.overview

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.se.bootcamp.model.todo.ToDo

object OverviewScreenTestTags {
  const val CREATE_TODO_BUTTON = "createTodoFab"
  const val LOGOUT_BUTTON = "logoutButton"
  const val EMPTY_TODO_LIST_MSG = "emptyTodoList"
  const val TODO_LIST = "todoList"

  fun getTestTagForTodoItem(todo: ToDo): String = "todoItem${todo.uid}"
}

@Composable
fun OverviewScreen(
    overviewViewModel: OverviewViewModel = viewModel(),
    /**
     * You can add parameters with default values here, e.g., onClick: () -> Unit = {}, modifier:
     * Modifier = Modifier, navController: NavHostController = rememberNavController(),
     *
     * You should not modify the `overviewViewModel` parameter.
     *
     * Note: Parameters with default values do not mean that you should use the default value in
     * your implementation. They ensure that we can still use your code in our tests.
     */
) {}
