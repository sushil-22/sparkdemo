package scalaexcercise.FunctionalApproach

object FunctionalApproach_1 {
  def main(args: Array[String]): Unit = {
    val doubler1 = new Function[Int, Int] {override def apply(ele: Int): Int = ele * 2 }
    val doubler2: ((Int) => Int) = new Function[Int, Int] {override def apply(ele: Int): Int = ele * 2 }
    val adder1 = new Function2[Int, Int, Int] { override def apply(x: Int,y: Int): Int = x + y }
    val adder2: ((Int, Int) => Int) = new Function2[Int, Int, Int] { override def apply(x: Int,y: Int): Int = x + y }
    val adder3: Function2[Int,Int,Int] = (x,y) => x + y
    val adder4: ((Int,Int) => Int) = (x,y) => x + y
    // more example below
    val max1 = (x: Int, y: Int) => if (x < y) y else x
    val max2 = new Function2[Int,Int,Int] { override def apply(x: Int, y: Int):Int = if(x<y) y else x }

    // Function values are treated as objects in Scala.
    //The function type A => B is just an abbreviation for the class scala.Function1[A, B], which is defined as follows.
      /* package scala
         trait Function1[A, B] {
         def apply(x: A): B
      }*/
    //So functions are objects with apply methods.
    //scalac -Vprint:typer compiler command to print out the compiler’s typer phase

    println("doubler1.."+doubler1(2))
    println("doubler1.."+doubler2(2))
    println("adder1.."+adder1(4,4))
    println("adder2.."+adder2(5,6))
    println("adder3.."+adder3(7,7))
    println("adder4.."+adder4(6,6))
    println("adder4.."+adder4.apply(6,9))  // object oriented way of writing
    println("max1.."+max1(4,5))
    println("max2.."+max2(4,5))

  }

}
