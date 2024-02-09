package scalaexcercise.Ops_Basic
//https://alvinalexander.com/scala/how-to-control-visibility-constructor-fields-scala-val-var-private/

object OOPBasic {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("Tom", 22)  // In every instansiation whole code block of class will executed
    val p2 = new Person("mick", 34)
    //p1.greet("Daniel")
    //p1.greet()
    println(p1.age)
    p1.age=266
    println(p1.age)
    //println(p2.city)
    // println(p.name)   compiler will give error here
    //val author1 = new Author("Tom",2010)
    //val nov1 = new Novel  ("Story1",2020,author1)
  }
}
class Author (firstname: String, DOB: Int){
  def fullname(): String = firstname  + DOB
}
class Novel(novel_name: String, yearofrelease: Int, val auth: Author){}

class Counter(count: Int){
  def inc = new Counter(count + 1)
}
class Person(name: String, var age: Int)   // Constructor
{
  println("In side the class")
  val city = "gorakhpur"
  println("Im here")

  def greet(myname: String): Unit =
    println(s"${this.name} says hi! to $myname") // here ${this.name} and $name both are different
// here method overloading (method with same same but different signature)
def greet(): Unit =
  println(s"${this.name} says hi! to $name") // here ${this.name} and $name both are same
}

