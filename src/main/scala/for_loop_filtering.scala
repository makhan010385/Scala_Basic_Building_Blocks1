object for_loop_filtering {
  def main(args: Array[String]): Unit = {
    for( a <- 1 to 10 if a%2==0 ){
      println(a);
    }
  }
}
