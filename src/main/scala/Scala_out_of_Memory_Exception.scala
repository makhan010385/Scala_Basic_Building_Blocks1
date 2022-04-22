object Scala_out_of_Memory_Exception {

  def main(args: Array[String]): Unit = {
    val myArray = new Array[Integer](1000 * 1000 * 1000)
  }
}
