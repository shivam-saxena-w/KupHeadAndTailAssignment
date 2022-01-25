import org.scalatest.funsuite.AnyFunSuite

class InsertTesting extends AnyFunSuite {
  // Object Creation
  val sortObject = new InsertionSort

  test("Testing basic sort functionality"){
    assert(List(1,2,3,4) == sortObject.insertionSort(List(4,3,2,1)))
  }

  test("Trying to pass an Empty List"){
    assert(List() == sortObject.insertionSort(List()))
  }

  test("Trying to pass same numbers"){
    assert(List(1,1,1,1) == sortObject.insertionSort(List(1,1,1,1)))
  }
}