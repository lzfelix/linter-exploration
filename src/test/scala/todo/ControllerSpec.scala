package todo

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import todo.Model.TodoList

class ControllerSpec extends AnyFlatSpec with Matchers {

  "add" should "return the same TodoList" in {
    val emptyTodoList: TodoList = Map.empty
    Controller.add(emptyTodoList) should equal(emptyTodoList)
  }
}
