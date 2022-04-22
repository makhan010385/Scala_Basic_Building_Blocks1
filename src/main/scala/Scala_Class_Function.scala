 object Scala_Class_Function {
  def main(args: Array[String]): Unit = {
    val myGetAreaFn= (rad:Double) =>
    {
      val PI =3.14
      PI * rad*rad
    }
   println(myGetAreaFn(2.2))

  }
}
