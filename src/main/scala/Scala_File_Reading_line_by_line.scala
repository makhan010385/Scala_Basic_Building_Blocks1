import scala.io.Source
object Scala_File_Reading_line_by_line {
  def main(args: Array[String]): Unit = {
    val filename = "C:\\Users\\Makhan\\IdeaProjects\\Mtech2.txt"

    //file reading - creating object name by passing
    //filename i.e. file object
    val filereader = Source.fromFile(filename)
    //printing characters
    for(line <-filereader.getLines())
        {
      println(line)
    }
    //closing
    filereader.close()
  }
}
