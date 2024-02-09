package scalaexcercise.FunctionalApproach
//https://www.scala-exercises.org/scala_tutorial/higher_order_functions
object HOF_1 {
  def main(args: Array[String]): Unit = {
    println("sum is "+sum(1,2,3))
    println("multiple is "+multiply(1,2,3))
    println("combine sum "+combine(12,12,11,(x,y)=> x+y))
    println("combine mul "+combine(12,12,11,(a,b)=> a * b))
    println("combine min func "+combine(11,12,14,(a,b) => if(a<b) a else b))
    //more war of writing
    println("combine sum1 "+combine(12,12,11,_+_))
    println("combine mul1 "+combine(12,12,11,_*_))  //anoher way of writing above, syntactic sugar

    println("curr ex..."+add_curr1(2)(2))
    val add_temp = add_curr1(2)
    println("curr ex..."+add_curr2(2)+"---"+add_temp)
    println("curr ex..."+add_temp(4))
    println("curr ex..."+add_curr3(4)(4)(4))
  }
  // 2. Function that returns a function as its result
  def nornmal_func(x: Int, y: Int): Int = x + y  /// this is normal function
  def add_curr4(x: Int)(y: Int): Int = x + y
  def add_curr1(x: Int): Int => Int = (y: Int) => x + y
  def add_curr2(x: Int): Int => Int =  y => x + y           //anoher way of writing above
  def add_curr3(x: Int): Int => Int=>Int = y => (z: Int) => x + y + z


  def sum(x:Double, y:Double, z:Double):Double = x+y+z
  def multiply(x:Double, y:Double, z:Double):Double = x*y*z
  def min(x:Double, y:Double, z:Double):Double = x min y min z
  //I would like to do all these 3 functions
  //In addition to these value arguments, I also need the function I am going to use to combine them.
  // Let’s call it f. Just like others, we have to specify the type here as well and this function takes two doubles and gives us back a double.
  //Function that takes another function as an argument
  def combine(x:Double, y:Double, z:Double, f:(Double,Double)=> Double): Double =  f(f(x,y),z)    //  it is a higher-order function because it takes one of its arguments

  val sum1: (Int, Int) => Int = (x, y) => x + y
  val curr: Int => (Int => Int) = x => y => x + y

  def mathfunc(name: String): (Int, Int) => Int = (x,y) => {
    name match {
      case "add" => x+y
      case "div" => x/y
      case "mul" => x*y
    }
  }


}

