import java.io._
object Scala_File_Writing_and_Reading {
  def main(args: Array[String]): Unit = {
    val file = new File("C:\\Users\\Makhan\\IdeaProjects\\Mtech2.txt" )

    //creating object of the PrintWrite
    //by passing the reference to the file
    val pw = new PrintWriter(file)

    //writing text to the file
    pw.write("Welcome to School of Data science\n")
    pw.write("writing text to the file\n")

    //closing the PrintWriter
    pw.close()
    println("PrintWriter saved and closed...")

  }
}
