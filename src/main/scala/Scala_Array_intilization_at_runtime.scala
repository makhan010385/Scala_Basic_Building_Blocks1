object Scala_Array_intilization_at_runtime {
  def main(args: Array[String]): Unit = {
    val arr = new Array[Int](3)
    println("the values of array is ")
    for (i <- 0 to 2) {
      arr(i) = scala.io.StdIn.readInt()
    }
    arr.foreach(println)
  }
  }
