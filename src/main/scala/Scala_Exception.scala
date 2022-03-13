class Scala_Exception  {
  def divide(a:Int, b:Int) = {
    a/b             // Exception occurred here
    println("Rest of the code is executing...")
  }

}

object  Scala_Exception_obj
{

  def main(args: Array[String]): Unit = {
    var e = new Scala_Exception()
    e.divide(100,0)

  }
}
