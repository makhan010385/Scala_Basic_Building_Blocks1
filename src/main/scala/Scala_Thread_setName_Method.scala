class Scala_Thread_setName_Method  extends Thread{
  override def run(){
    for(i<- 0 to 5){
      println(this.getName()+" - "+i)
      Thread.sleep(500)
    }
  }
}
object  Scala_Thread_setName_Method_obj{

  def main(args: Array[String]): Unit = {
    var t1 = new Scala_Thread_setName_Method()
    var t2 = new Scala_Thread_setName_Method()
    var t3 = new Scala_Thread_setName_Method()
    t1.setName("First Thread")
    t2.setName("Second Thread")
    t1.start()
    t2.start()
  }
}
