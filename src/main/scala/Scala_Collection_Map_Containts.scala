object Scala_Collection_Map_Containts {
  def main(args: Array[String]): Unit = {
    val mapIm = Map("Ajay" -> 30,"Bhavesh" -> 20,"Charlie" -> 50)

    // the key check in the Map
    val ajay = if(mapIm.contains("Ajay"))
      mapIm("Ajay") else 0

    val john = if(mapIm.contains("John"))
      mapIm("John") else 0

    println("Ajay:" + ajay)
    println("John:" + john)
  }
}
