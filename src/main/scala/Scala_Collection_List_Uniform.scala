object Scala_Collection_List_Uniform {
  def main(args: Array[String]): Unit = {
    val Stu_name = List.fill(3)("Rohit") // Repeats apples three times.
    println( "Stu_name : " + Stu_name  )

    val num = List.fill(10)(2)         // Repeats 2, 10 times.
    println( "num : " + num  )
  }
}
