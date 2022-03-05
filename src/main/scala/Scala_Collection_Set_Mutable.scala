object Scala_Collection_Set_Mutable
{
  def main(args: Array[String]): Unit = {
    val names = scala.collection.mutable.SortedSet[String]()
    names += "somesh"
    names += "Kapil"
    names.foreach((name:String)=>println(s"name is=$name"))
  }
}
