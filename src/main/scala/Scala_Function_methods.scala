object Scala_Function_methods {
  def main(args: Array[String]): Unit = {
//    Simple method:
    def m1(x: Int) = x + x
   println("output of method"+m1(2))  // 4
//    Simple function:

    val f1 = (x: Int) => x + x
    println("output of function"+f1(2))  // 4
  }

}
