package scalaexcercise.Ops_Basic

object CaseClassExample extends App {
  case class Person(name: String, age: Int)

  // CCs promote all class parameter to field
  val jimmy = Person("jimmy",34)
  println(jimmy.name+"  "+jimmy.age)

  // Sensible to toString
  println(jimmy)   //  toString automaticaaly implemted

  //equals and hashcode implemented out of the box
  val jimmy2 = Person("jimmy",34)
  println(jimmy == jimmy2)

  // case class have handy copy method
  val jimmy3 = jimmy.copy()
  val jimmy4 = jimmy.copy(age = 33)
  println(jimmy4)

  // case class have companion object automatically
  val maary = Person

  // case class are serializable
  // case class are used in pattern matching

}
