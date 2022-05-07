//var x= 23
class Clousre_feature
{
   var x = 20
  def function_name(y:Int)
  {

    println(x+y)
  }

}
object  main
{
  def main(args: Array[String]): Unit = {
    var obj = new Clousre_feature()
    obj.function_name(3)
//    print("outside body:"+x)
  }

}