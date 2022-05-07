trait Scala_Traits {
  var Name: String = "Mtech"
}
trait  Roll_num {

  var Roll_No: Int = 130
}
trait  Roll_num2 {

  var Roll_No1: Int = 114
}

class info_mtech_stu extends  Scala_Traits with Roll_num with Roll_num2 {

  def display()
  {
    println("Name: " +Name);
    println("Roll_number: " +Roll_No);
    println("Roll_number: " +Roll_No1);

  }

}
object traits_scala
{
  def main(args: Array[String]): Unit = {
    val ob = new info_mtech_stu();
    ob.display();
  }
}