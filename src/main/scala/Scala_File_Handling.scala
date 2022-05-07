
// File handling program
import java.io.File
import java.io.PrintWriter
object Scala_File_Handling {
  // Main method
  def main(args:Array[String])
  {
    // Creating a file
    val file_Object = new File("C:\\Users\\Makhan\\IdeaProjects\\abc1.txt" )

    // Passing reference of file to the printwriter
    val print_Writer = new PrintWriter(file_Object)

    // Writing to the file
    print_Writer.write("Hello, This is  Mtech Sudents")
     print("Saved Successfully")
    // Closing printwriter
    print_Writer.close()
  }

}
