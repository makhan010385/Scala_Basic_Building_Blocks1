object Nothing_datatypes {
  def main(Args: Array[String]): Unit = {
    println(null);
    //println(none) // gives error : not found : value none
    println(Nil)
    println(None.toList)
    //checking whether None is empty or not
    println(None.isEmpty)
    //printing value of None as string
    println(None.toString)
  }
}
