trait Scala_Mixims_Traits {
  def print()
}
abstract class PrintA4{
  def printA4()
}

class A6 extends PrintA4 with Scala_Mixims_Traits{            // First one is abstract class second one is trait
  def print(){                                        // Trait print
    println("print sheet")
  }
  def printA4(){                                      // Abstract class printA4
    println("Print A4 Sheet")
  }
}
object MainObject_Maxims_Traits{
  def main(args:Array[String]){
    var a = new A6()
    a.print()
    a.printA4()
  }
}
