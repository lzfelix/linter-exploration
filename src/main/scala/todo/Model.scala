package todo

import java.time.LocalDate

object Model {
  type TodoList = Map[Int, List[Task]]

  case class Task(
      name: String,
      description: String,
      startDate: LocalDate,
      dueBy: LocalDate,
      status: String
  )
}
