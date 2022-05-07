class Scala_Thread_Multitasking extends  Thread {
  override def run() {
    for (i <- 0 to 5) {
      println(i)
      Thread.sleep(500)
    }
  }

  def task() {
    for (i <- 0 to 5) {
      println(i)
      Thread.sleep(200)
    }
  }
}
object  Scala_Thread_Multitasking_obj{

  def main(args: Array[String]): Unit = {
    var t1 = new Scala_Thread_Multitasking()
    t1.start()
    t1.task()
  }
}
