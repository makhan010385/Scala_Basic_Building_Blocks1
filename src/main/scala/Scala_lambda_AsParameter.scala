object Scala_lambda_AsParameter {

  // transform function with integer x and
  // function f as parameter
  // f accepts Int and returns Double
  def transform( x:Int, f:Int => Double)
  =
    f(x)
  def main(args: Array[String]): Unit = {

    // lambda is passed to f:Int => Double
    val res = transform(2, r => 3.14 * r * r)

    println("The output of Circle is:"+res)
  }
}
