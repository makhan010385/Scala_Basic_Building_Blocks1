class Scala_ComapanionClass {
  def hello(){
    println("Hello, this is Companion Class.")
  }
}
object CompanoinObject{
  def main(args:Array[String]){
    new Scala_ComapanionClass().hello()
    println("And this is Companion Object.")
  }
}