object for_loop_yield {
  def main(args: Array[String]): Unit = {
//    val result = Array(1,2,4,6,9)
 var result = for( a <- 1 to 10 if a> 5) yield a
//    print(result)
    for(i<- result)
    {
      println(i)
    }
  }
}
