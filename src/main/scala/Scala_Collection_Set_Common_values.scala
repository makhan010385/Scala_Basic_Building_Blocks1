object Scala_Collection_Set_Common_values {
  def main(args: Array[String]): Unit = {

        val n1 = Set(11,45,67,78,89,86,90)
        val n2 = Set(10,20,45,67,34,78,98,89)

        println( "n1.&(n2) : " + n1.&(n2) )
        println( "n1.intersect(n2) : " + n1.intersect(n2) )


  }
}
