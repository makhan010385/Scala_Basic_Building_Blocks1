class Scala_try_through {
  def validate(age:Int)={
    if(age<18)
      throw new ArithmeticException("You are not eligible")
    else println("You are eligible")
  }
}
object  Scala_try_through_obj
{

  def main(args: Array[String]): Unit = {
    var e = new Scala_try_through()
    e.validate(20)

  }
}
