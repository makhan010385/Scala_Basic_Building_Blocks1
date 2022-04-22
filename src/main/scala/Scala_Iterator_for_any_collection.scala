object Scala_Iterator_for_any_collection {
  def main(args: Array[String]): Unit = {
    var v  = Array(5,1,2,3,6,4,"mkkkk")
    // defining an iterator
    // for a collection
    v(0)=3
    val i = v.iterator
    while (i.hasNext)
      print(i.next + " ")
  }
}
