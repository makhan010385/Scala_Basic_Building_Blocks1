class Scala_Thread_join  extends Thread {
  override def run(){
    for(i<- 0 to 5){
      println(i)
      Thread.sleep(500)
    }
  }
}
object Scala_Thread_join_obj{

  def main(args: Array[String]): Unit = {
    var t1 = new Scala_Thread_join()
    var t2 = new Scala_Thread_join()
    var t3 = new Scala_Thread_join()
    t1.start()
    t1.join()
    t2.start()
    t3.start()
  }
}
