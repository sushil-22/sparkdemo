package scalaexcercise.collections

object TupleDemo {

  def main(args: Array[String]): Unit = {
    // Maps are immutable
    val atuple = (123, "sushil", "kumar", 31, 12.2)
    val tupl2 = ((123, "sushil", "kumar", 31, 12.2),
      (345, "sushil", "kumar", 31, 12.2),
      (786, "sushil", "kumar", 31, 12.2))
    println(tupl2)
    println(tupl2._2)
  }
  }
