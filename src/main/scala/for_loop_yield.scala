object for_loop_yield {
  def main(args: Array[String]): Unit = {
    var result = for( a <- 1 to 10) yield a
    for(i<-result){
      println(i)
    }
  }
}
