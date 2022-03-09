import scala.collection.immutable._
object Scala_Collection_Queue_Methods {
  def main(args: Array[String]): Unit = {
    var queue = Queue(1,5,6,2,3,9,5,2,5)
    print("Queue Elements: ")
    queue.foreach((element:Int)=>print(element+" "))
    var firstElement = queue.front
    print("\nFirst element in the queue: "+ firstElement)
    var enqueueQueue = queue.enqueue(100)
    print("\nElement added in the queue: ")
    enqueueQueue.foreach((element:Int)=>print(element+" "))
    var dequeueQueue = queue.dequeue
    print("\nElement deleted from this queue: "+ dequeueQueue)
  }
}
