class Scala_While_Loop
{
def while_loop()
  { var a :Int=1
    while( a <= 10)
    {
      println(a)
      a=a+1
    }
  }

}
object  Scala_While_Loop_obj {

  def main(args: Array[String]): Unit = {
    var b = new Scala_While_Loop()
      b.while_loop()

  }
}