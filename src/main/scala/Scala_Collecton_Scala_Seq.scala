//In the following example, we are creating Seq and accessing elements from Seq.
object Scala_Collecton_Scala_Seq {
  def main(args: Array[String]): Unit = {
    var seq:Seq[String] = Seq("kapil","somesh","rohit","mohit","xyz")
    seq.foreach((element:String) => print(element+" "))
    println("\nAccessing element by using index")
    println(seq(2))
  }
}
