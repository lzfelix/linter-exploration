package todo

object View {
  def printMenu(): Unit = {
    print(s"""
             |Options:
             |\t 1 - List tasks
             |\t 2 - Add task
             |\t 3 - Edit task
             |\t 4 - Remove task
             |\t 5 - Exit
             |Your option: """.stripMargin)
  }
}
