class Data_Science {
  var Name: String = "Mtech"

}
class mtech extends Data_Science
{

  var Roll_No: Int = 130
  // Method// Method

  def details()
  {
    println("Stream name: " +Name);
    println("Roll number of student: " +Roll_No);
  }
}

object Main_Inheritance
{

  // Driver code
  def main(args: Array[String])
  {

    // Creating object of derived class
    val ob = new mtech();
    ob.details();
  }
}