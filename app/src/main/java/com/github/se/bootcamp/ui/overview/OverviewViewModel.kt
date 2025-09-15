/*package com.github.se.bootcamp.ui.overview

import androidx.lifecycle.ViewModel
import com.github.se.bootcamp.model.todo.ToDosRepository
import com.github.se.bootcamp.model.todo.ToDosRepositoryProvider

/**
 * ViewModel for the Overview screen.
 *
 * Responsible for managing the UI state, by fetching and providing ToDo items via the
 * [ToDosRepository].
 *
 * @property todoRepository The repository used to fetch and manage ToDo items.
 */
class OverviewViewModel(
    private val todoRepository: ToDosRepository = ToDosRepositoryProvider.repository,
    /** You can add parameters with default values here */
) : ViewModel()
*/

 package com.github.se.bootcamp.ui.overview

 import androidx.lifecycle.ViewModel
 import androidx.lifecycle.viewModelScope
 import com.github.se.bootcamp.model.todo.ToDo
 import com.github.se.bootcamp.model.todo.ToDosRepository
 import com.github.se.bootcamp.model.todo.ToDosRepositoryProvider
 import kotlinx.coroutines.flow.MutableStateFlow
 import kotlinx.coroutines.flow.StateFlow
 import kotlinx.coroutines.launch

 class OverviewViewModel(
     private val todoRepository: ToDosRepository = ToDosRepositoryProvider.repository,
 ) : ViewModel() {

     private val _todos = MutableStateFlow<List<ToDo>>(emptyList())
     val todos: StateFlow<List<ToDo>> = _todos

     init {
         loadTodos()
     }

     private fun loadTodos() {
         viewModelScope.launch {
             val todosList = todoRepository.getAllTodos()
                 .sortedBy { it.creationDate } // Asegura orden por fecha de creación
             _todos.value = todosList
         }
     }
 }