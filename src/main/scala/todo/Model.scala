package todo

import java.time.LocalDate

object Model {
  type TodoList = List[Task]

  case class Task(
      name: String,
      description: String,
      startDate: LocalDate,
      dueBy: LocalDate,
      status: String
  )
}
