abstract class Bike {
def run()


}
class Hero extends Bike{
def run(): Unit =
  {
    print("Best Performance")
  }
  def runhello(): Unit =
  {
    println("not implemnetd ")
  }

}
object Main_abstract{
  def main(args: Array[String]): Unit = {
    var h = new Hero()
     h.run()
    h.runhello()
  }
}
