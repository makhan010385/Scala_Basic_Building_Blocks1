object Scala_Exception_demo {
  def main(args: Array[String]): Unit = {
    def failingFn(i: Int): Int = {
      val y: Int = throw new Exception("fail!")
      try
      {
        val x = 42 + 5
        x + y
      }
      catch { case e: Exception => 43 }
    }
    val a=failingFn(1)
    print(a)
  }
}
