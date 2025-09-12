package com.github.se.bootcamp.model.todo

/** Represents a repository that manages a local list of todos. */
class ToDosRepositoryLocal : ToDosRepository {
  override fun getNewUid(): String {
    TODO("Not yet implemented")
  }

  override suspend fun getAllTodos(): List<ToDo> {
    TODO("Not yet implemented")
  }

  override suspend fun getTodo(todoID: String): ToDo {
    TODO("Not yet implemented")
  }

  override suspend fun addTodo(toDo: ToDo) {
    TODO("Not yet implemented")
  }

  override suspend fun editTodo(todoID: String, newValue: ToDo) {
    TODO("Not yet implemented")
  }

  override suspend fun deleteTodo(todoID: String) {
    TODO("Not yet implemented")
  }
}
