class Scala_Thread_Priority extends Thread {
  override def run() {
    for (i <- 0 to 5) {
      println(this.getName())
      println(this.getPriority())
      Thread.sleep(500)
    }

  }
}
object  Scala_Thread_Priority_obj
{
  def main(args: Array[String]): Unit = {
    var t1 = new Scala_Thread_Priority()
    var t2 = new Scala_Thread_Priority()
    t1.setName("First Thread")
    t2.setName("Second Thread")
    t1.setPriority(Thread.MIN_PRIORITY)
    t2.setPriority(Thread.MAX_PRIORITY)
    t1.start()
    t2.start()
  }
}