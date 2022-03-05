object Scala_Collections_Set_Mearge_Two_Set {
  def main(args: Array[String]): Unit = {
    val name = Set("kapil","somesh","rohit","mohit")
    val rollnumber = Set("101","102","103","104","105")
    val mergeSet = name ++ rollnumber            // Merging two sets
    println("Elements in games set: "+name.size)   // Return size of collection
    println("Elements in alphabet set: "+rollnumber.size)
    println("Elements in mergeSet: "+mergeSet.size)
    println(mergeSet)
  }
}
