package todo

import todo.Model.TodoList

object Controller {
  def list(todoList: TodoList): TodoList = {
    println("list tasks")
    todoList
  }

  def add(todoList: TodoList): TodoList = {
    println("add task")
    todoList
  }

  def edit(todoList: TodoList): TodoList = {
    println("edit task")
    todoList
  }

  def drop(todoList: TodoList): TodoList = {
    println("remove task")
    todoList
  }
}
