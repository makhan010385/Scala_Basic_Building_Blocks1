import scala.collection.immutable.SortedSet
object Scala_Collections_Sorted_Set {
  def main(args: Array[String]): Unit = {
//    val name = Set("kapil","somesh","rohit","mohit")
    var name: SortedSet[String] = SortedSet("kapil","somesh","rohit","mohit")
    name.foreach((element:String)=> println(element))
  }
}
