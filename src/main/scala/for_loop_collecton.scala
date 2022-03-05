object for_loop_collecton {
  def main(args: Array[String]): Unit = {
    var list = List(1,2,3,4,5,6,7,8,9)          // Creating a list
    for( i <- list if(i%2==0)){                         // Iterating the list
      println(i)
    }
  }
}
