import scala.io.StdIn._
object Scala_how_to_take_input {
  def main(args: Array[String]): Unit = {
    print("Enter a number: a and b ")
    val a= readInt()
    var length = readFloat(),readChar(),readBoolean(),readDouble(),readChar()
    val b= readInt()
    println("The value of a & b is=: "+ a,b)
  }
}
