class Scala_Procted_Access_Specifier {
  protected var a:Int = 10
}
class SubClass extends Scala_Procted_Access_Specifier{
  def display(){
    println("a = "+a)
  }


}

object MainObject3 {
  def main(args: Array[String]) {
    var s = new SubClass()
    s.display()
  }
}

