object Array_ID_New {
  def main(args: Array[String]): Unit = {
    var arr = new Array[Int](5)
    arr(0)=15
    arr(1)=25
    arr(2)=35
    arr(3)=45
    arr(4)=55

    for(a<-arr)
    {
      println(a)
    }
  }
}
