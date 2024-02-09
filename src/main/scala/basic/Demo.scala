package scalaexcercise.basic

object Demo {
  def main(args: Array[String]): Unit = {
        println(hof("add")(2,2))
  }

  def hof(s:String): (Int,Int) => Int = (x,y) => {
    s match {
      case "add" => x + y
      case "mul" => x * y
    }
  }
}
