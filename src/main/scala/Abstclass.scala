abstract class Abstclass {
  def portal
  def tutorial()
  {
    println("Scala tutorial")
  }
}
class Derive_class extends Abstclass
{
  def portal()
  {
    println("Welcome!! Scala Student")
  }
}
object Main_Abstract_class
{

  // Main method
  def main(args: Array[String])
  {
    // object of GFG class
    var obj = new Derive_class();
    obj.tutorial()
    obj.portal()
  }
}
