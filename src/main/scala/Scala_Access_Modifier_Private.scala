class Scala_Access_Modifier_Private {
  private var a: Int = 10

  def show() {
    println(a)
  }
}
object  MainObject1{
  def main(args:Array[String]){
    var p = new Scala_Access_Modifier_Private()
//   p.a = 12  //variable a in class Scala_Access_Modifier_Private cannot be accessed in Scala_Access_Modifier_Private
    p.show()
  }
}