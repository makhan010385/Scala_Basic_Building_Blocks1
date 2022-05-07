object Scala_Yield {
  def main(args: Array[String]): Unit = {
    // Using yield with for
    var print = for( i <- 1 to 10) yield i
      for(j<-print)
    {
      // Printing result
      println(j)
    }
  }
}
