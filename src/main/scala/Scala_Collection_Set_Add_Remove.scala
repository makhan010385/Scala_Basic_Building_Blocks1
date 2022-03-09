object Scala_Collection_Set_Add_Remove {
  def main(args: Array[String]): Unit = {
    var Mtech_Stu_Name=Set("mk","jk","tk","np")
//    Mtech_Stu_Name.foreach((name:String)=>println(name))
    Mtech_Stu_Name -= "ruchika"
    Mtech_Stu_Name.foreach((name:String)=>println(name))

  }
}
