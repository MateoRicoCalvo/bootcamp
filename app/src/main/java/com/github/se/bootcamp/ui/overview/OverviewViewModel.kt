package com.github.se.bootcamp.ui.overview

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
