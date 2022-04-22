import scala.collection.mutable.ListBuffer
object Scala_Collection_List_Immutable1 {
  def main(args: Array[String]): Unit = {
    var fruits = new ListBuffer[String]()

    // add one element at a time to the ListBuffer
    fruits += "Apple"
    fruits += "Banana"
    fruits += "Orange"

    // add multiple elements
    fruits += ("Strawberry", "Kiwi", "Pineapple")

    // remove one element
    fruits -= "Apple"

    // remove multiple elements
    fruits -= ("Banana", "Orange")

    // remove multiple elements specified by another sequence
    fruits --= Seq("Kiwi", "Pineapple")

    // convert the ListBuffer to a List when you need to
    val fruitsList = fruits.toList
    print(fruitsList)
  }
}
