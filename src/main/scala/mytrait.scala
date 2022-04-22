trait mytrait {
  // Abstract and non-abstract method
  def portal
  def tutorial()
  {
    println("Scala tutorial")
  }
}
// GFG class extends trait
class Derive_Class extends mytrait
{
  def portal()
  {
    println("Welcome!! Scala Student")
  }
}

object Main_Traits
{

  // Main method
  def main(args: Array[String])
  {

    // object of GFG class
    var obj = new Derive_Class ();
    obj.tutorial()
    obj.portal()
  }
}
