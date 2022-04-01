object Scala_Collections_Set_Mearge_Two_Set {
  def main(args: Array[String]): Unit = {
//    val name = Set("kapil","somesh","rohit","mohit")
    val a = Set(1,2,4)
    val b = Set(3,6,7)
//    val rollnumber = Set("101","102","103","104","105")
//    val mergeSet = name + rollnumber
    val c = a ++ b  // Merging two sets
   println("Element inthe $a: ")   // Return size of collection
    println("Element inthe b: "+b.size)
   println("Elements in c: "+c.size)
    println(c)
  }
}
