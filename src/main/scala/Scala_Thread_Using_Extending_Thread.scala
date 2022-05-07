class Scala_Thread_Using_Extending_Thread extends Thread {
  override def run() {
    println("Thread is running...");
  }
}
object MainObject_thread{
  def main(args:Array[String]){
    var t = new Scala_Thread_Using_Extending_Thread()
    t.start()
  }
}