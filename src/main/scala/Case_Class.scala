case class Case_Class(name:String, age:Int)
object MainObject
{
  def main(args:Array[String])
  {
    var c = Case_Class("Xyz", 23)
    println("Student name:" + c.name);
    println("Student age: " + c.age);
  }
}
