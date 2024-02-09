package scalaexcercise.basic

object CallByValue_CallByName {
  def main(args: Array[String]): Unit = {
    //println(callByName(System.nanoTime()))   // expression is paased as it is without computing its value
    //println(callByValue(System.nanoTime()))  // Its value is passed as it is (value of expression is calculated and passed as it is)
    //infinite()
    //printfirst(2,infinite())  // here expression infinite() will pass as it is, if we will calcutale its value will be infinite
    println(foo(System.nanoTime()))
    //println(foo(bar))

  }
  def callByName(x: => Long): Unit = {   // this systax is used to take expressionas it is
    println("Call by name:"+x)
    println("Call by name:"+x)
  }

  def callByValue(x: Long): Unit = {
    println("Call by value:"+x)
    println("Call by value:"+x)
  }

  def infinite(): Int = 1 + infinite()
  def printfirst(x: Int, y: => Int): Unit = println(x)
  // parameter y is not used so infinite() is not evaluated

  def foo(x: => Long): Unit = {
    println("Start of method"); println(x); println(x); println("End of method")
  }
  def bar: Int = {
    println("Evaluating!"); 42
  }

}
