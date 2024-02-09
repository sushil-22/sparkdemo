package scalaexcercise.Ops_Basic

object Trait_Inheritance extends App {

  class Animal {
    val creature = "wild"
    private def showname = {"my name is animal"}   // can not used in sub class
    protected def eat = println("I can eat anything")
    def canfly = "I can not fly"
  }
  class Cat extends Animal {

    def crunch = {
      eat
      println("I'm cat and eat .....")
    }
  }

  val c1= new Cat
  c1.crunch

  class Person(name: String, age: Int){
    def this(name: String) = this(name,0)
    def this(age: Int) = this("")
  }
  class Adult(name: String, age: Int, pancar: String) extends Person(name: String, age : Int)
  class Teen(teen_name: String, ssnno: Int) extends Person(teen_name: String)
  // here JVM will find constructor in superclass with one Argument

  class Dog extends Animal {
    override val creature: String = "Pet"
    override def eat = {
      super.eat   // super is used to called super class method
      println("I eat only pedgiri")
    }
  }
  class Cow(override val creature: String) extends Animal  // overriden in class constructor
  {
    override def eat = println("I eat only grass")
  }
  val d =new Dog
  println(d.creature)
  d.eat

  val c = new Cow("provide us milk")
  println(c.creature)

  // type sustitution which is called polymorphism
  val unknown_1 = new Dog
  val unknown_2 = new Cow("")
  unknown_1.eat
  unknown_2.eat
}
