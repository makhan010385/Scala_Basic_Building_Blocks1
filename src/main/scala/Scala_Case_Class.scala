case class Scala_Case_Class(name:String, age:Int)
case class Scala_Case_Class1(name:String, age:Int,roll:Int)
object  Scala_Case_CLass_Obj
{
  def main(args: Array[String]): Unit = {
//    var c = Scala_Case_Class("Nidhi", 23)
    var d = Scala_Case_Class1("Nidhi", 23, 34)

    // Display both Parameter
    println("Name of the employee is " + d.name);
    println("Age of the employee is " + d.roll);
  }
}