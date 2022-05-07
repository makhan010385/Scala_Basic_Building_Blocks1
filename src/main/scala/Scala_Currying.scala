object Scala_Currying {
  // Define currying function
  def add(x: Int, y: Int) = x + y;
  def main(args: Array[String]): Unit = {
    var x=add(20,19)
     x=x+5
    println(x);
  }
}
