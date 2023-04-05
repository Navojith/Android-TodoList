package com.example.todoapp.database.repositories

import com.example.todoapp.database.TodoDatabase
import com.example.todoapp.entities.Todo

class TodoRepository(
    private val db: TodoDatabase
) {
    suspend fun insert(todo: Todo) = db.getTodoDao().insertTodo(todo)
    suspend fun delete(todo: Todo) = db.getTodoDao().delete(todo)
    fun getAllTodos() =db.getTodoDao().getAllTodos()
}