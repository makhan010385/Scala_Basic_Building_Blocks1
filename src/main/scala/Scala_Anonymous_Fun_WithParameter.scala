object Scala_Anonymous_Fun_WithParameter {
  def main(args: Array[String]): Unit = {
    // Creating anonymous functions
    // with multiple parameters Assign
    // anonymous functions to variables
//    var myfc1 = (str1:String, str2:String) => str1 + str2
    var myfc1 = (str1:Int, str2:Int) => str1 + str2
    // An anonymous function is created
    // using _ wildcard instead of
    // variable name because str1 and
    // str2 variable appear only once
    var myfc2 = (_:String) + (_:String)

    // Here, the variable invoke like a function call
    println(myfc1(1, 2))
    println(myfc2("MBA", "BBA"))
  }
}
