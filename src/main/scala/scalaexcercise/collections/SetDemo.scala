package scalaexcercise.collections

object SetDemo {
  //Set: unordered collection that does not allow duplicates. It can be mutable or immutable. Sets provide efficient membership tests and operations like `intersect`, `union`, `diff`, etc.
  def main(args: Array[String]): Unit = {
    val set1: Set[Int] = Set(1,2,3,1)  // no duplicates
    val mylist = List(1,3,4,5,67,8,9)
    var myset = Set("G", "Geek", "for")
    myset += "Geeks"
    println(myset)

    val num1 = Set(5,6,9,20,30,45)
    val num2 = Set(50,60,9,20,35,55)
    println("Union.."+num1.union(num2))
    println("intersection.."+num1.intersect(num2))
  }
}
