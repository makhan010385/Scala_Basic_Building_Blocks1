object Scala_Collection_List_Operations {
  def main(args: Array[String]): Unit = {
    val Stu_name = "x" :: ("y" :: ("z" :: Nil))
    val Stu_nums = Nil
    println( "Head of Stu_name : " + Stu_name.head )
    println( "Tail of Stu_name : " + Stu_name.tail )
    println( "Check if Stu_name is empty : " + Stu_name.isEmpty )
    println( "Check if Stu_nums is empty : " + Stu_nums.isEmpty )
  }

}
