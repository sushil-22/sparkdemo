package scalaexcercise.Ops_Basic

object ObjectExample extends App {
  object Person { // type + its only instance
    val eyes = 2
    val legs = 2
    def canfly: Boolean = false
    def apply(mother: Person, father: Person): Person = new Person("bobiee")
  }
  class Person(name: String) {
    // instance level functionality
  }
  val p1 = Person
  val p2 = Person
  println( p1 == p2)
  println(p1.eyes+" .. "+p2.eyes)  // same output because here Person is singletom of type Person

  val p3 = new Person("marry")
  val p4 = new Person("tom")

  println(p3 == p4)  // false because p3 andp4 are different objects

  // below is example of singleton pattern
  val bobiee1 = Person.apply(p3, p4)
  // or equivalent
  val bobiee2 = Person(p4, p4)   //actually apply method here
  println( bobiee1 == bobiee2)




}
