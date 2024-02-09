package scalaexcercise.basic

object OptionDemo {
  def main(args: Array[String]): Unit = {
    println(toIntAdvance("12a"))
    val tok = toIntAdvance("12")   // return will Some
    val val2 = tok.get.asInstanceOf[Int]+123   // cast some to Int
    println("final val.."+val2)
  }


  def toIntAdvance(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s))
    } catch {
      case e: Exception => None
    }
  }


}
