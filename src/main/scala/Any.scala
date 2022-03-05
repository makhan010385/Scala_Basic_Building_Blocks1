object Any extends App {
  val list: List[AnyVal] = List(
//    "a string"
    732,  // an integer
    'c',  // a character
    true, // a boolean value

  )

  list.foreach(element => println(element))
}
