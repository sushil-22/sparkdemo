package scalaexcercise.basic

object ClousureDemo {

  def add(a: Int): Int => Int = {
      val b = 10
      val c = (x: Int) => x + a + b
      c
  }
  def hellow1()  = println("Im fun1....")
  def hellow2  = println("Im fun2....")

  def main(args: Array[String]): Unit = {
    //println(add(5)(3))
    println(hellow1)
    println(hellow1())
    println(hellow2)
  }

}
