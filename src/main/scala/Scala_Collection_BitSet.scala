import scala.collection.immutable._

object Scala_Collection_BitSet {
  def main(args: Array[String]): Unit = {
    var Mtech_Searial_number = BitSet(4,1,0,9,8)
    var Mtech_Searial_number1=Mtech_Searial_number+10+20
    Mtech_Searial_number1.foreach((element:Int) => println(s"element are = $element"))
    var Mtech_Searial_number2=Mtech_Searial_number1-20
    Mtech_Searial_number2.foreach((element:Int) => println(s"element are = $element"))
  }
}
