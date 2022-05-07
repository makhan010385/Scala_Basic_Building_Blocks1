object Scala_lambda {
  def main(args: Array[String]): Unit = {
    // lambda expression
    val ex1 = (x:Int) => x + 2

    // with multiple parameters
    val ex2 = (x:Int, y:Int) => x * y

    println("The output of the number is :"+ex1(7))
    println(ex2(2, 3))
  }
}
