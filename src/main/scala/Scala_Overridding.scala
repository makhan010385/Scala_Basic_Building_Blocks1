class Scala_Overridding {
  def NumberOfStudents()=
  {
    0 // Utilized for returning an Integer
  }
}
class class_1 extends Scala_Overridding {
  // Using Override keyword
  override def NumberOfStudents() = {
    30
  }
}

class class_2 extends Scala_Overridding
{

  // Using override keyword
  override def NumberOfStudents()=
  {
    32
  }
}
class class_3 extends Scala_Overridding
{

  // Using override keyword
  override def NumberOfStudents()=
  {
    29
  }
}
object Scala_Overridding_Obj{

  def main(args: Array[String]): Unit = {
    var x=new class_1()
    var y=new class_2()
    var z=new class_3()
    // Displays number of students in class_1
    println("Number of students in class 1 : " +
      x.NumberOfStudents())

    // Displays number of students in class_2
    println("Number of students in class 2 : " +
      y.NumberOfStudents())

    // Displays number of students in class_3
    println("Number of students in class 3 : " +
      z.NumberOfStudents())
  }
}