import scala.collection.immutable._
object Scala_Collection_ListSet {
  def main(args: Array[String]): Unit = {
    var Mtech_Stu_Name = ListSet("kapil","somesh","rohit","mohit","xyz")
    Mtech_Stu_Name.foreach((element:String) => println(element+" "))
  }
}
