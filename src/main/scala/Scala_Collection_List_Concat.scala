object Scala_Collection_List_Concat {
  def main(args: Array[String]): Unit = {
    val Stu_name = "x" :: ("y" :: ("z" :: Nil))
    val Stu_Stream = "Mtech" :: ("Msc" :: Nil)
    // use two or more lists with ::: operator
    var all_info = Stu_name ::: Stu_Stream
    println( "Stu_name ::: Stu_Stream : " + all_info )
    // use two lists with Set.:::() method
    all_info = Stu_name.:::(Stu_Stream)
    println( "Stu_name.:::(Stu_Stream) : " + all_info )
    // pass two or more lists as arguments
    all_info = List.concat(Stu_name, Stu_Stream)
    println( "List.concat(Stu_name, Stu_Stream) : " + all_info  )
  }
}
