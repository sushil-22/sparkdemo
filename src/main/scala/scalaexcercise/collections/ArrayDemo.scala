package scalaexcercise.collections

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    //Array: A fixed-length, mutable collection of elements with a zero-based index.
    val mixarray = Array(1,2,3,4.4,"tom",true)
    val arr = Array(1,2,3,4)
    val arr2 = arr :+ 6
    arr2(2) = 11     //array are mutable
    val sortedatrr = arr2.sortWith((a,b)=> a>b)
    sortedatrr.foreach(x=> print(s"$x, "))
    print("\n")
    // Implicit conversion of array to Seq
    val seqarr: Seq[Int] = arr
    val seqlist: Seq[Int] = List(1,2,3,4)
    println("seqarr "+seqarr)
    println("seqlist "+seqlist)

  }
}
