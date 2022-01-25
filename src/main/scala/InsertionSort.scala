class InsertionSort {

  def insertionSort(listInput: List[Int]): List[Int] =
    if (listInput.isEmpty) Nil
    else insert(listInput.head, insertionSort(listInput.tail))

  def insert(head : Int, listTail: List[Int]) : List[Int] =
    if(listTail.isEmpty) List(head)
    else if(head > listTail.head) listTail.head :: insert(head, listTail.tail)
    else head :: listTail
}
