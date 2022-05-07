class Scala_This_Constructor_Calling {
  def this(name:String, age:Int){
    this()
    println(name+" "+age)
  }
}
object Main_this_Calling{
  def main(args: Array[String]): Unit = {
    var s = new Scala_This_Constructor_Calling("Rama",100)
  }
}