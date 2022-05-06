import scala.collection.mutable

object linkedList extends App{

  val list1 = List(Array(1,2,3), Array(1,2,3,4,5))
  val list2 = List(Array(1,2,3), Array(3,4,5))



  def getIntersection(list1: List[Array[Int]], list2: List[Array[Int]]) = {

    var currentNode1 = list1.head
    var currentNode2 = list2.head

    print(list1, list2)

    for(n <- list1) {

      for(y <- list2) {

        if(n.equals(y)) {
          println(s"$n = $y")
        }
      }

    }


  }

  getIntersection(list1, list2)

}