object Scala_Collection_List_Immutable {
  def main(args: Array[String]): Unit = {
    val  Stu_name: List[String] = List("Somesh", "Ruchika","Kapil", "Kshama")
    val Language = List("Scala", "Rail", "ADA", "GO","PHP", "Ruby")

    // Display the value of mylist1
    println("Student name:")
    println(Stu_name)

    // Display the value of mylist2 using for loop
    println("\n Languages:")
    for(mylist<-Language)
    {
      println(mylist)
    }
  }
}
