class Scala_Thread_Using_Runnable_Interface extends Runnable {
  override def run(){
    println("Thread is running...")
  }
}
object Scala_Thread_Using_Runnable_Interface_obj {
  def main(args:Array[String]) {
    var e = new Scala_Thread_Using_Runnable_Interface()
    var t = new Thread(e)
    t.start()
  }
  }
