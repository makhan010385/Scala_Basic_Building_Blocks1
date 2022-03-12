class Scala_ExceptionExample {
  def divide(a:Int, b:Int) = {
    a/b             // Exception occurred here
    println("Rest of the code is executing...")
  }
}
object Scala_Excep
{

  def main(args: Array[String]): Unit = {
    var e = new Scala_ExceptionExample()
    e.divide(100,0)
  }
}
