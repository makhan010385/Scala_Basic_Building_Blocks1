case class Case_Class(name:String, age:Int)
object MainObject
{
  def main(args:Array[String])
  {
    var c = Case_Class("Xyz", 23)
    var d = Case_Class("Xyz", 24)
    ///var f = d==c

    println("the age of c variable is:"+c.age)
    println("the name  of c variable is:"+c.name)
//    var d = Case_Class("Xyz", 23)
//    var e= c.copy()
//    val match2 =c==e
//    print(match2)
//    print("Student name form e:" + e.name)
//    println("Student name:" + c.name);
//    println("Student age: " + c.age);
//    println("Student name form d:" + d.name);
//    println("Student age from d: " + d.age);
//      val matching = c==d
//    print(matching)

  }
}
