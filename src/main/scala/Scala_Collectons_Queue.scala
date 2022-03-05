import scala.collection.immutable._
object Scala_Collectons_Queue {
  def main(args: Array[String]): Unit = {
    var queue = Queue("kapil","somesh","rohit","mohit")
    print("Queue Elements: ")
    queue.foreach((element:String)=>print(element+" "))
    var firstElement = queue.front
    print("\nFirst element in the queue: "+ firstElement)
    var enqueueQueue = queue.enqueue("XYZ")
    print("\nElement added in the queue: ")
    enqueueQueue.foreach((element:String)=>print(element+" "))
    var dequeueQueue = queue.dequeue
    print("\nElement deleted from this queue: "+ dequeueQueue)
  }
}
