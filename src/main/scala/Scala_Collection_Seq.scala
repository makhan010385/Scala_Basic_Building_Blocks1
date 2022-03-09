object Scala_Collection_Seq {
  def main(args: Array[String]): Unit = {
    var Roll_number:Seq[Int] = Seq(52,85,1,8,3,2,7)
    Roll_number.foreach((element:Int) => print(element+" "))
    println("\nAccessing element by using index")
    println(Roll_number(2))

  }
}
