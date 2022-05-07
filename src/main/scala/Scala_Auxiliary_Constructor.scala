class Scala_Auxiliary_Constructor(Aname: String, Cname: String) {
  var no: Int = 0;;
  def display()
  {
    println("Author name: " + Aname);
    println("Chapter name: " + Cname);
    println("Total number of articles: " + no);

  }

  // Auxiliary Constructor
  def this(Aname: String, Cname: String, no:Int)
  {

    // Invoking primary constructor
    this(Aname, Cname)
    this.no=no
  }
}
object Main_Auxiliary_Constructor
{
  def main(args: Array[String])
  {

    // Creating object of GFG class
    var obj = new Scala_Auxiliary_Constructor("Anya", "Constructor", 34);
    obj.display();
  }
}
