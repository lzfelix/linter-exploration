

def updateWorld(todoList: TodoList): (TodoList, Int) = {
}

def printMenu = {
  println(
    """
      |Options:
      |\t 1 - List tasks
      |\t 2 - Add task
      |\t 3 - Edit task
      |\t 4 - Remove task
      |\t 5 - Under development
      |\t 6 - Exit
      |Your option:
      |""".stripMargin)
}

object Main extends App {
  val todoList: Map[String, Task] = Map.empty

  Iterator
    .continually(printMenu)
    .foreach(input => actionParser)

    val userInput = scala.io.StdIn.readInt()
    match
    userInput {
      case 1 => println("list tasks")
      case 2 => println("add task")
      case 3 => println("edit task")
      case 4 => println("remove task")
      case 5 => println("under development")
      case _ => _
    }.takeWhile(_ != 6)
  }
}