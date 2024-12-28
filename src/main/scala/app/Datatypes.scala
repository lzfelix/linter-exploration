package app

import java.time.LocalDate

object Datatypes {
  type TodoList = Map[String, List[Task]]

  case class Task(name: String,
                  description: String,
                  startDate: LocalDate,
                  dueBy: LocalDate)
}
