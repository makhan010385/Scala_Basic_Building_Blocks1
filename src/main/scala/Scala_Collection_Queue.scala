
import scala.collection.immutable._
object Scala_Collection_Queue {
  def main(args: Array[String]): Unit = {
    var queue = Queue(1,5,6,2,3,9,5,2,5)
    var queue2:Queue[Int] = Queue(1,5,6,2,3,9,5,2,5)
    println(queue)
    println(queue2)
  }
}
