class Scala_try_catch {
  def divide(a:Int, b:Int) = {
    try{
      a/b
    }catch{
      case e: ArithmeticException => println(e)
    }
    println("Rest of the code is executing...")
  }
}
object  Scala_try_obj
{

  def main(args: Array[String]): Unit = {
    var e = new Scala_try_catch()
    e.divide(100,0)

  }
}
