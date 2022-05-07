object Scala_Currying_Partial_Application {
  def add2(a: Int) = (b: Int) => a + b;
  def main(args: Array[String]): Unit = {
    // Partially Applied function.
    val sum = add2(29);
    println(sum(5));
  }
}
