case class Scala_Case_Class(name:String, age:Int)
object  Scala_Case_CLass_Obj
{
  def main(args: Array[String]): Unit = {
    var c = Scala_Case_Class("Nidhi", 23)

    // Display both Parameter
    println("Name of the employee is " + c.name);
    println("Age of the employee is " + c.age);
  }
}