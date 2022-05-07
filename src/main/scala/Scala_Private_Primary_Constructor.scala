class Scala_Private_Primary_Constructor  (val Aname: String = "Ankita",
                                                val Cname: String = "Constructors")
{
  def display()
  {
    println("Author name: " + Aname);
    println("Chapter name: " + Cname);

  }
}
object Main_Private_Primary
{
  def main(args: Array[String])
  {
    // Creating object of Scala_Private_Primary_Constructor class
    var obj = new Scala_Private_Primary_Constructor();
    obj.display();
  }
}
