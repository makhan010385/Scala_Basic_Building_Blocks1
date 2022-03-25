import scala.util.control.Breaks.{break, breakable}
import scala.util.control.BreakControl
object Scala_Break {
  def main(args: Array[String]): Unit = {
    for(i<- 1 to 10 )
      {
        breakable{
        if(i == 2)
          {
            break

          }
        else
          {
            print(i)
          }
        }
      }

  }
}
