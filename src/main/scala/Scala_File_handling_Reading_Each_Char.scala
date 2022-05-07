import scala.io.Source
object Scala_File_handling_Reading_Each_Char {
  def main(args: Array[String]): Unit = {
    val filename = "C:\\Users\\Makhan\\IdeaProjects\\Mtech2.txt"
    val fileSource = Source.fromFile(filename)
    while(fileSource.hasNext){
      println(fileSource.next)
    }
    fileSource.close()
  }
}
