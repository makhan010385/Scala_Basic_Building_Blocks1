// Set is used to store unique elements in the set.
// It does not maintain any order for storing elements. You can apply various operations on them.
// It is defined in the Scala.collection.immutable package.
object Scala_Collections_Set {
  def main(args: Array[String]): Unit = {
    val set1 = Set()                            // An empty set
    val games = Set("Cricket","Football","Hocky","Golf","Golf")    // Creating a set with elements
    println(set1)
    println(games)
    println(games.head)             // Returns first element present in the set
    println(games.tail)         // Returns all elements except first element.
    println(games.isEmpty)          // Returns either true or false
  }
}
