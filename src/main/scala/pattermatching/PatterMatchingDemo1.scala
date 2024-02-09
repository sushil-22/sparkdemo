package scalaexcercise.pattermatching

import scala.util.Random
trait Person
case class Student(name: String, age: Int) extends Person
case class Teacher(name: String,sub: String) extends Person
case class Truck(wheel: Int)

object PatterMatchingDemo1 {
  def main(args: Array[String]): Unit = {
    val random = new Random()
    val x = random.nextInt(10)
    val des = x match {
      case 1 => "one"
      case 2 => "second"
      case _ => "something else"   // _ is wildchard
    }
    println(s"val of x: $x == $des")
    // here retun type of expr is String or Any
    val stud1 = Student("bob",19)
    val stud2 = Student("same",22)
    val tech = Teacher("mick","maths")
    val truck = Truck(12)

    //here pattern atching decompse the object into its constituents
    println(findPerson(tech))
    /*
    1. cases are match in order
    2. what if no case match? Match error
    3. wildcard is necessary
    4. type of pattern matching expresssion: unified type of all the types in the expression
    */
  }
  def findPerson(per: Person): String = {
    per match {
      case Student(name, age) if age > 20  => s"Im $name and $age year old and I can drive"
      case Student(name, age) if age < 20  => s"Im $name and age is $age and I can't drive"
      case Teacher(name, sub) => s"Im Teacher: my name is $name and I tech $sub"
      case _ => "I don't know"
    }
  }

}
