object Scala_lambda_WithAnyCollection {
  def transform( l:List[Int], f:Int => Double)
  = {
    l.map(f)


    }
  def main(args: Array[String]): Unit = {
    // lambda is passed to f:Int => Double
    val res = transform(List(1, 2, 3), r => 3.14 * r * r)
    println(res)
  }
}
