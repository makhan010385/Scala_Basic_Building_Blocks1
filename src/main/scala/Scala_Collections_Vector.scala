//Scala Vector
//  Vector is a general-purpose, immutable data structure. It provides random access of elements. It is good for large collection of elements.
//
//It extends an abstract class AbstractSeq and IndexedSeq trait.



object Scala_Collections_Vector {
  def main(args: Array[String]): Unit = {
//    val name = Set("kapil","somesh","rohit","mohit")
//    val rollnumber = Set("101","102","103","104","105")


    var name:Vector[String] = Vector("kapil","somesh","rohit","mohit") //Or
    var rollnumber = Vector(101,102,103,104,105)
    var vector3 = Vector.empty
    println(name)
    println(rollnumber)
    println(vector3)
  }
}
