object Scala_Collection_Set_Operations {
  def main(args: Array[String]): Unit = {
    val name = Set("kapil","somesh","rohit","mohit")
    val rollnumber = Set("101","102","103","104","105","somesh")
    var setIntersection = name.intersect(rollnumber)
    println("Intersection by using intersect method: "+setIntersection)
    println("Intersection by using & operator: "+(name & rollnumber))
    var setUnion = name.union(rollnumber)
    println(setUnion)
  }
}
