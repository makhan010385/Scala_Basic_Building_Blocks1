class Scala_try_catch_Finally {
  def divide(a:Int, b:Int) = {
    try{
      a/b
      var arr = Array(1,2)
      arr(1)
    }catch{
      case e: ArithmeticException => println(e)
      case ex: Exception =>println(ex)
      case th: Throwable=>println("found a unknown exception"+th)
    }
    finally{
      println("Finaly block always executes")
    }
    println("Rest of the code is executing...")
  }
}
object Scala_try_finally_obj
{
  def main(args: Array[String]): Unit = {
    var e = new Scala_try_catch_Finally()
    e.divide(100,10)

  }

}