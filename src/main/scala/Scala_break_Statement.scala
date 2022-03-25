import scala.util.control.Breaks._
object Scala_break_Statement
{
  def main(args: Array[String]): Unit =
  {
    breakable
    {                                 // Breakable method to avoid exception
      for(i<-1 to 10 by 2)
      {
        if(i==7)
          break                           // Break used here
        else
          println(i)
      }
    }
  }
}
