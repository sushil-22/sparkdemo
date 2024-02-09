package scalaexcercise.FunctionalApproach

object FunctionalApproach extends App {
  val p1 = new Person("sushil", 22)
  println("way 1.." + p1.apply2())
  println("way 2.." + p1.apply("tim tom")) //apply method will call
  println("way 3.." + p1("tim tom"))       // apply method will call
  val bmw   = new Car[String,String]{override def myName(str: String): String = s"Car name is $str"}
  println(bmw.myName("bmw"))

  val doubler =  new Myfunc[Int, Int] {override def apply(ele: Int): Int =  ele * 2 }
  val doubler2 = new Function1[Int, Int] {override def apply(x: Int): Int = x * 2 }        //A function of 1 parameter
  println("Im doubler method.."+doubler(2)) // here doubles act like a function
  println("Im doubler method.."+doubler.apply(2))
  println("Im doubler method.."+doubler2(2))

  val adder = new MyAdder[Int, Int, Int, Int] { override def apply(ele1: Int, ele2: Int, ele3: Int): Int = ele1 + ele2 + ele3 }
  println(adder(3, 4, 5))
  //Below type is defined befor = . example (String, String) => String
  val concater: (String, String) => String = new Function2[String, String, String] {
    override def apply(str1: String, str2: String): String =  str1 + str2
  }
  println(concater("tom", "tim"))

  //Below type is defined befor = . String => Int this is function
  val strint2IntConverrter: String => Int = new Function1[String, Int] {
    override def apply(ele: String): Int = ele.toInt
  }
  println(strint2IntConverrter("33"))       //way 1
  println(strint2IntConverrter("33") + 7)   //way 2

  val superadd: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }
  val superadd1= (x: Int) => (y: Int) => x + y // this line is syntactic sugar for above superadd function
  val superadd2: Int => (Int => Int) = x => y => x + y   // this is eqivalent to above line

  val adder1 = superadd(6)
  println(adder1)            // this line will return Funtion1
  println(adder1(6))
  println(superadd(10)(10))
  println(superadd1(10)(20))
  println(superadd2(10)(200))

  //println(p1.greet("sam"))
  println("=====================")

}

trait Myfunc[A,B]{
  def apply(ele1: A): B
}
trait MyAdder[A,B,C,D]{
  def apply(ele1: A, ele2: B, ele3: C): D
}
trait Car[A,R]{
  def myName(str: A): R
}
class Person(val name: String, age: Int) {
  def apply2(): String = s"my name is ${this.name} and I'm not apply method"
  def apply(str: String): String = s"welcome $str my name is ${this.name} and I'm apply method"
  def greet(name: String): String = s"hello $name and ${this.name} and full name is ${this.name+" kumar"} and age is ${this.age}"
}


//The type A => B is the type of a function that takes an argument of type A and returns a result of type B.
//So, Int => Int is the type of functions that map integers to integers.
