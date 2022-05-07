object Scala_Map {
  def main(args: Array[String]): Unit = {
    // list of numbers
    val l = List(1, 1, 2, 3, 5, 8)

    // squaring each element of the list
    val res = l.map( (x:Int) => x * x )

    /* OR
    val res = l.map( x=> x * x )
    */
    println(res)
  }
}
