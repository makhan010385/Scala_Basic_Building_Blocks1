class Scala_Primary_Constructor(id:Int, name:String) {
  def showDetails(){
    println(id+" "+name);
  }
}
object Scala_Primary_Constructor{

  def main(args: Array[String]): Unit = {

      var s = new Scala_Primary_Constructor(101,"Rama");
      s.showDetails()
    }
}
