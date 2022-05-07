class Scala_Thread_Sleep extends Thread {
  override def run(){
    for(i<- 0 to 5){
      println(i)
     Thread.sleep(500)
    }
  }

}
object Scala_Thread_Sleep_obj{

  def main(args: Array[String]): Unit = {
    var t1 = new Scala_Thread_Sleep()
    var t2 = new Scala_Thread_Sleep()
    t1.start()
   t2.start()
  }
}

