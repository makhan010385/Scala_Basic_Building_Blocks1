object Scala_Collection_Maps {
  def main(args: Array[String]): Unit = {
//    var name:Vector[String] = Vector("kapil","somesh","rohit","mohit") //Or
//    var rollnumber = Vector(101,102,103,104,105)
    var name =Map((1,"Kapil"),(2,"Somesh"))
// another way
    var name2 = Map(3->"somesh",4->"Ball")
    var newMap = name2+(5->"XYZ")                  // Adding a new element to map
    var removeElement = newMap-4             //  // Removing an element from map
    println(name)
    println(name2)
    println(newMap)
    println(removeElement)
  }
}
