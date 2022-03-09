object Scala_Collection_Set_Immutable extends  App{
 var names = scala.collection.immutable.SortedSet[String]()
 names += "somesh"
  names += "Kapil"
  names.foreach((name:String)=>println(s"name is=$name"))
}
