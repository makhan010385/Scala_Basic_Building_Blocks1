object Scala_Currying_Another_Way {
  // transforming the function that
  // takes two(multiple) arguments into
  // a function that takes one(single) argument.
  def add2(a: Int) = (b: Int) => a + b;

  def main(args: Array[String]): Unit = {
    println(add2(20)(19));
  }
}
