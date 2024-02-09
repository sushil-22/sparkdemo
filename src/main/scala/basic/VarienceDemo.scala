package scalaexcercise.basic

object VarienceDemo {
  def main(args: Array[String]): Unit = {
    val lily: List[Lily] = List(Lily("White Lily"),Lily("Jersey Lily"))
    val carnations: List[Rose] = List(Rose("White carnations"),Rose("Pink carnations"))
    FlowerName(carnations)
  }
  def FlowerName(flowers: List[Flower]): Unit = {
    flowers.foreach(flower => println(flower))
  }
}

abstract class Flower {
  def name: String
}
case class Lily(name: String) extends Flower
case class Rose(name: String) extends Flower
