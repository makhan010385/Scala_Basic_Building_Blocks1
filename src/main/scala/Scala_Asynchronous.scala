//import scala.concurrent.ExecutionContext.Implicits.global
//import scala.concurrent.duration._
//import scala.concurrent.{Await, Future}
//lazy val t1 = Future[String] {
//  println("Task 1 running!")
//  Thread.sleep(10000)
//  println("Task 1 done!")
//  "result from task 1"
//}
//lazy val t2 = Future[String] {
//  println("Task 2 running...")
//  throw new RuntimeException("Task 2 fails")
//}
//
//lazy val t3 = Future[String] {
//  println("Task 3 running...")
//  Thread.sleep(5000)
//  println("Task 3 done!")
//  "result from task 3"
//}
//
//val futures = Future.sequence(Seq[Future[String]](t1, t2, t3))
//
//futures.onSuccess {
//  case value => println(s"**Drumroll** And the results are...: $value")
//}
//
//Await.ready(futures, 20 seconds)
//
//object Scala_Asynchronous {
//  def main(args: Array[String]): Unit = {
//
//  }
//}
