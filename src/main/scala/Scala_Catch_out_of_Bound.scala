//object Scala_Catch_out_of_Bound {
//  def main(args: Array[String]): Unit = {
//    val oomee = new Nothing
//    oomee.createArray(1000 * 1000 * 1000)
//  }
//}
//
//  def createArray(size: Int): Unit = {
//    try {
//      val myArray = new Array[Integer](size)
//      catch
//      {
//        case oome: OutOfMemoryError =>
//          //Log the info
//          System.err.println("Array size too large")
//          System.err.println("Max JVM memory: " + Runtime.getRuntime.maxMemory)
//      }
//    }
//
//}
