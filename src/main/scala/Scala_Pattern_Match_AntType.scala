object Scala_Pattern_Match_AntType {
  def main(args: Array[String]): Unit = {
    var result = search("Hello")
    print(result)
  }

  def search(a: Any): Any = a match {
    case 1 => println("One")
    case "Two" => println("Two")
    case "Hello" => println("Hello")
    case _ => println("No")
  }
}