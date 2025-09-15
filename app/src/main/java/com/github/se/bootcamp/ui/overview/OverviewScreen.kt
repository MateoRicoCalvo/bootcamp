package com.github.se.bootcamp.ui.overview



import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.se.bootcamp.model.todo.ToDo
import java.text.SimpleDateFormat
import java.util.*

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
) {
    val todos = overviewViewModel.todos.collectAsState().value

    if (todos.isEmpty()) {
        Text(
            text = "The Todo list is empty.",
            modifier = Modifier.testTag(OverviewScreenTestTags.EMPTY_TODO_LIST_MSG)
        )
    } else {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .testTag(OverviewScreenTestTags.TODO_LIST)
                .padding(8.dp)
        ) {
            items(todos) { todo ->
                TodoItemCard(todo)
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

@Composable
fun TodoItemCard(todo: ToDo) {
    val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    val dueDate = dateFormat.format(todo.dueDate.toDate())
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .testTag(OverviewScreenTestTags.getTestTagForTodoItem(todo))
            .padding(4.dp)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(text = "Title: ${todo.name}")
            Text(text = "Status: ${todo.status}")
            Text(text = "Assignee: ${todo.assigneeName}")
            Text(text = "Due: $dueDate")
        }
    }
}
