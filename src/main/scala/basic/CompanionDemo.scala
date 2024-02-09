package scalaexcercise.basic

object CompanionDemo {
  def main(args: Array[String]): Unit = {
    val rec1 = AreaOfRectangle.apply()
    val rec2 = AreaOfRectangle()
    println(rec1.area())
    println(rec2.area())
	  val pzz1 = Pizza("large",200)
  println(pzz1.size +" "+ pzz1.price)
  }
}
class AreaOfRectangle
{
  var length = 20;
  var height = 40;
  def area()
  {
    var ar = length * height;
    println("Height of the rectangle is:" + height);
    println("Length of the rectangle is:" + length);
    println("Area of the rectangle is :" + ar);
  }
}
object AreaOfRectangle {
  def apply(): AreaOfRectangle = new AreaOfRectangle()
}

object Demo {
  // nothing here
}
class Pizza (val size: String, val price: Int){
  def showPizza(): Unit = {
    println(Pizza.pizzasize)
  }
}
object Pizza {
  private val pizzasize = "large pizza"
  def apply(size: String, prince: Int) : Pizza = {
    new Pizza(size,prince)
  }
}