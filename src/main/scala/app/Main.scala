package app

import app.Datatypes.TodoList
import scala.annotation.tailrec

object Main extends App {
  private def printMenu(): Unit = {
    print(s"""
        |Options:
        |\t 1 - List tasks
        |\t 2 - Add task
        |\t 3 - Edit task
        |\t 4 - Remove task
        |\t 5 - Exit
        |Your option: """.stripMargin)
  }

  @tailrec
  private def updateWorld(todoList: TodoList): TodoList = {
    printMenu()
    val userInput: Int = scala.io.StdIn.readInt()

    userInput match {
      case 1 => StateTracker.list(todoList)
      case 2 => StateTracker.add(todoList)
      case 3 => StateTracker.edit(todoList)
      case 4 => StateTracker.drop(todoList)
      case 5 => System.exit(0)
      case _ => println("Invalid option, try again.")
    }

    updateWorld(todoList)
  }

  updateWorld(Map.empty)
}