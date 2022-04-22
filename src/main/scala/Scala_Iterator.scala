object Scala_Iterator {
  def main(args: Array[String]): Unit = {
    val v = Iterator(5, 1, 2, 3, 6, 4)

    //checking for availability of next element
    while(v.hasNext)

    //printing the element
      println(v.next)
  }
}
