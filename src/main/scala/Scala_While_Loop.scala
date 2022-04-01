class Scala_While_Loop
{ var a :Int=11
def while_loop()
  {
    while( a <= 10)
    {

      a=a+1
    }

  }
  println(a)
}
object  Scala_While_Loop_obj {

  def main(args: Array[String]): Unit = {
    var b = new Scala_While_Loop()
      b.while_loop()

  }
}