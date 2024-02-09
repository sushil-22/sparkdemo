package scalaexcercise.basic

object TraitDemo2 extends App {
  val c1 = new Cat
  val d1 = new Dog("tom")
  println(c1.speak())
  println(c1.startTail())
  println(c1.stopTail())
  println(c1.startRunning())
  println(c1.stopRunning())
}
trait Speaker {
  def speak(): String   //abstract
}
trait TailWagger extends Speaker {
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit = println("tail is stopped")
}
trait Runner extends Speaker{
  def startRunning(): Unit = println("I'm running")
  def stopRunning(): Unit = println("Stopped running")

}
class Dog(name: String) extends Speaker with TailWagger with Runner {
  def speak(): String = "Woof!"
}

class Cat extends Speaker with Runner with TailWagger {
  def speak(): String = "Meow"
  override def startRunning(): Unit = println("Yeah ... I don't run")
  override def stopRunning(): Unit = println("No need to stop")
}

