class InvalidAgeException(s:String) extends Exception(s){}
class Scala_Custom_Exception {
  @throws(classOf[InvalidAgeException])
  def validate(age:Int){
    if(age<18){
      throw new InvalidAgeException("Not eligible")
    }else{
      println("You are eligible")
    }
  }
}

object MainObjects{
  def main(args:Array[String]){
    var e = new Scala_Custom_Exception()
    try{
      e.validate(5)
    }catch{
      case e : Exception => println("Exception Occured : "+e)
    }
  }
}
