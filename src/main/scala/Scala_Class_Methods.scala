class Scala_Class_Methods {

  def myGetAreaMd(rad:Double):Double=
  {
     val PI =3.14
    var squre = PI* rad* rad
    return squre
  }

}
  object  Scala_Class_Methods_obj
  {

    def main(args: Array[String]): Unit = {
      val m1= new Scala_Class_Methods()
     var e=m1.myGetAreaMd(2.2)
      print(e)
    }
  }

