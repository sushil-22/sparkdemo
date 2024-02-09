package scalaexcercise.collections

object RangeDemo {
  def main(args: Array[String]): Unit = {
    //Range
    val range1: Seq[Int] = 1 to 5
    val range2: Seq[Int] = 1 until 5
    range2.foreach(println)
    (1 to 5).foreach(x => print("do something here.."))  //add anything here which you want to do five times


  }

}
