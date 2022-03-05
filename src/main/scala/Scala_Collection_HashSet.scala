import scala.collection.immutable.HashSet
object Scala_Collection_HashSet {
  def main(args: Array[String]): Unit = {
    var Mtech_Stu_Name = HashSet("kapil","somesh","rohit","mohit","xyz")
      Mtech_Stu_Name.foreach((name:String)=>println(name+" "))

//    Mtech_Stu_Name.foreach((element:String) => println(element+" "))
  }

}
