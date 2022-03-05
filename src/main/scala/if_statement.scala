object if_statement extends  App {
  val a=5
  val b=6
  val c=9

//  if(a>=b && a>=c)
//    {
//      print("a is garter")
//    }
//  else if(b>c)
//    {
//
//      print("b is grater")
//    }
//  else
//    {
//      print("c is grater")
//
//    }
 val minValue = if (a > b && a> c) a else if(b> c) b else c
  print(minValue)
}
