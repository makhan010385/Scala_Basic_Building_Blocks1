class Multilevel {
  var Name: String = "Mtech"
}
class mtech1 extends Multilevel {

  var Roll_No: Int = 130
}
class info extends mtech1
{
  // Method
  def details(){
    println("Name: " +Name);
    println("Roll_number: " +Roll_No);
  }

}
object Multilevel_Inheritance
{
  def main(args: Array[String]): Unit = {
    val ob = new info();
    ob.details();
  }
}
