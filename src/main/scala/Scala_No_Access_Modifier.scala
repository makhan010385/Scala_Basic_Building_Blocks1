class Scala_No_Access_Modifier {
   var a:Int = 10
  def show(){
    println(" a = "+a)
  }
}
object MainObject5{
  def main(args:Array[String]){
    var a = new Scala_No_Access_Modifier()

    a.show()
  }
}
