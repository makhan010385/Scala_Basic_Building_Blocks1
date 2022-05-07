class Scala_This {
  var id:Int = 1000
  var name: String = "Lokesh"
//  def this(id:Int, name:String)
//  {
//  this()
//  this.id = id
//  this.name = name
//  }
  def show()
  {
    println(id+" "+name)
  }
}
object this_main
{

  def main(args: Array[String]): Unit = {
    var t1 = new Scala_This()
    t1.show()

  }
}