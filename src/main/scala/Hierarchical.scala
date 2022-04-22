class Hierarchical {
  var Name1: String = "Siya"
  var Name2: String = "Soniya"
}
class Child1 extends Hierarchical
{
  var Age: Int = 32
  def details1()
  {
    println(" Name: " +Name1);
    println(" Age: " +Age);
  }
}
// Derived from Parent class
class Child2 extends Hierarchical
{
  var Height: Int = 164

  // Method
  def details2()
  {
    println(" Name: " +Name2);
    println(" Height: " +Height);
  }
}

object Main_Hierarchical
{

  // Driver code
  def main(args: Array[String])
  {

    // Creating objects of both derived classes
    val ob1 = new Child1();
    val ob2 = new Child2();
    ob1.details1();
    ob2.details2();
  }
}
