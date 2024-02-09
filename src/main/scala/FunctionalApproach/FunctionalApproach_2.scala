package scalaexcercise.FunctionalApproach

object FunctionalApproach_2 {
  def main(args: Array[String]): Unit = {
    val ob1 = new Mymethod[Int,Int] {override def apply(v1: Int): Int =  v1 + 2}

    val ob2 = new Function1[Int,Int] { override def apply(v1: Int): Int = v1 + 2 }

    val ob3 = (v1: Int) => v1 + 2
    // Above three are differerent ways to so same task
    println(s"ob1 is ${ob1(5)}")
    println(s"ob2 is ${ob2(5)}")
    println(s"ob3 is ${ob3(5)}")
  }
}
trait Mymethod[A,B]{
  def apply(ele: A): B
}
