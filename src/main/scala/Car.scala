class Car {
  // Class variables
  var make: String = "BMW"
  var model: String = "X7"
  var fuel: Int = 40

  // Class method
  def Display()
  {
    println("Make of the Car : " + make);
    println("Model of the Car : " + model);
    println("Fuel capacity of the Car : " + fuel);
  }
}
object Main_Car_calss
{

  // Main method
  def main(args: Array[String])
  {

    // Class object
    var obj = new Car();
    obj.Display();
  }
}