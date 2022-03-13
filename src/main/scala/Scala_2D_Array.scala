object Scala_2D_Array {
  def main(args: Array[String]): Unit = {
    var arr = Array(Array(1,2,3,4,5), Array(6,7,8,9,10))
    for(i<- 0 to 1){               // Traversing elements using loop
      for(j<- 0 to 4){
        print("     "+arr(i)(j))
      }
      println()
    }
  }
}
