package scalaexcercise.FunctionalApproach
//https://stackoverflow.com/questions/9737352/what-is-the-apply-function-in-scala
object AnonymousFunction_1 {
  def main(args: Array[String]): Unit = {
    // assign an object representing the function to a variable  (important)
    // Treat functions as objects.
    val doubler1 = new Function[Int, Int] {override def apply(ele: Int): Int = ele * 2 }
    // Above syntax is OO way
    val doubler2 = (x: Int) => x * 2
    val doubler3: Int => Int = x => x * 5
    // (x: Int) => x * 2 this code is syntacic sugar for above piece of code which we removed
    // above code instansiate Function1 overwrite apply Function,
    // above funtn is systatic sugar for above code and called Lambda Function
    println("doubler in OO way.."+doubler2.apply(4))
    //Writing f.apply(args) every time you want to execute a function represented as an object is the Object-Oriented way

    val donothing: () => Int = () => 2*3+4
    // curly braces with lambda
    val stringtoInt = { (ele: String) => ele+" tom" }
    val increment1: Int=>Int =  _ + 1              // equivalent to (x: Int) => x + 1
    val increment2: (Int, Int) => Int =  _ + _     // equivalent to (x: Int,y: Int) => x + y

    val curriedfun= (x: Int) => (y: Int) => x + y

    println("doubler1.."+doubler1(2))
    println("doubler2.."+doubler2(2))
    println("doubler3.."+doubler3(2))
    println("tostring.."+doubler1.toString())
    println("tostring.."+doubler2.toString())
    println("donothing.."+donothing)     // this will call function itself
    println("donothing.."+donothing())   // this is actual call
    println("srting to Int.."+stringtoInt("tim"))
    println("increment1.."+increment1(33))
    println("increment2.."+increment2(33,33))
    println("curriedfun.."+curriedfun(3)(4))
    // define a function in scala (Anonymous Function Syntax)
      (x:Int) => x + 1
      // assign an object representing the function to a variable
      val f = (x:Int) => x + 1
      //Here, (x: Int) is the parameter of the function, and x * 1 is its body.
      //apply serves the purpose of closing the gap between Object-Oriented and Functional paradigms in Scala.
      // Every function in Scala can be represented as an object.
      // Every function also has an OO type: for instance, a function that takes an Int parameter and returns an Int will have OO type of Function1[Int,Int].
      //More example below
      val demo: (Int,Int) => Int = (x,y) => x*2+y
      val demo1: (Int,Int,Int,Int,Int,Int) => Int = (v1, v2, v3, v4, v5, v6) => v1+ v2+ v3+ v4+ v5+ v6

  }

}
