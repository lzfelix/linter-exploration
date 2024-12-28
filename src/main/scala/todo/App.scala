package todo

import todo.Model.TodoList
import scala.annotation.tailrec

object App extends App {
  @tailrec
  private def updateWorld(todoList: TodoList): TodoList = {
    View.printMenu()
    val userInput: Int = scala.io.StdIn.readInt()

    userInput match {
      case 1 => Controller.list(todoList)
      case 2 => Controller.add(todoList)
      case 3 => Controller.edit(todoList)
      case 4 => Controller.drop(todoList)
      case 5 => System.exit(0)
      case _ => println("Invalid option, try again.")
    }

    updateWorld(todoList)
  }

  updateWorld(Map.empty)
}