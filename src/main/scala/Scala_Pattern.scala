object Scala_Pattern {
  def main(args: Array[String]): Unit = {
    var a = 3
    a match {
      case 1 => println("One")
      case 2 => println("Two")
      case _ => println("No")
    }
  }
}
