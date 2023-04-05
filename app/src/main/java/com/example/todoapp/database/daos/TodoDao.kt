package com.example.todoapp.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.todoapp.entities.Todo

@Dao
interface TodoDao {
    @Insert
    suspend fun insertTodo(todo: Todo)
    @Delete
    suspend fun delete(todo: Todo)
    @Query("SELECT * From Todo")
    fun getAllUsers(): List<Todo>
    abstract fun getAllTodos(): Any
}
