package scalaexcercise.collections

object MapDemo {
  def main(args: Array[String]): Unit = {
    // A collection of key-value pairs where each key is unique. It can be mutable or immutable.
    // Maps provide efficient lookup and modification operations.

    val map1 = Map("tom"->22,"sam"->33,"mick"->36)
    println(s"${map1.values}")
    val amap: Map[String,Int] = Map()
    println(amap)
    //withDefaultValue is used to give default value if key is not present
    val phnbok = Map((123,"tim"), 345->"tom").withDefaultValue(-1)
    println(phnbok)
    println(phnbok.contains(123))
    val pair1 = 343 -> "herry"
    val pair2 = 345 -> "sam"
    val pair3 = (341,"joe")
    val phnbok_1 = phnbok + pair1 + pair2 + pair3
    println("new phone book.."+phnbok_1)

    //function on pair
    val phnbok_2 =  phnbok_1.map(pair => pair._1 -> pair._2)
    println(phnbok_2)

  }

}
