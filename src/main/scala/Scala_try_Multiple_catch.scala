class Scala_try_Multiple_catch {
  def divide(a:Int, b:Int) = {
    try{
      a/b
      var arr = Array(1,2)
      arr(10)
    }catch{
      case e: ArithmeticException => println(e)
      case ex: Throwable =>println("found a unknown exception"+ ex)
    }
    println("Rest of the code is executing...")
  }
}
object Scala_try_mul_obj
{
  def main(args: Array[String]): Unit = {
    var e = new Scala_try_Multiple_catch()
    e.divide(100,10)

  }

}
