package scalaexcercise.basic

object StringOperation {
  def main(args: Array[String]): Unit = {
     val str: String = "Scala is best language"
    println(str.charAt(3))
    println(str.substring(0,5))
    println(str.split(" ").toList)
    println(str.length)

    val numstring = "34"
    val num1 = numstring.toInt
    println('a' +: numstring :+ 'z')

    val name = "David"
    val age = 22
    val spped = 2.2f
    // s-interpolation
    val greet1 = s"hello my name is $name and my age is $age"  // here $ and s are used to inject values
    val greet2 = s"hello my name is ${name + " sam"} and my age will ${age + 1} after one year"  // here expression are injected
    // f-interpolation
    val greet3 = f"hello my name is $name%s and my age is ${age + 1}  and I can run at speed of $spped%2.2f m/s"  // here expression are injected

    println(greet1)
    println(greet2)
    println(greet3)
    // raw-interpolation
    println(raw"this is a \n new line")  // \n will escape
    val escape = "this is a \n new line"
    println(raw"$escape")   // injected variable do got escape
  }

}
