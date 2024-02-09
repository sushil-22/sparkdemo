package scalaexcercise.basic

object DefaultArgs {
  def main(args: Array[String]): Unit = {
      println(factorial(5,1))
      println(factorial(5))   // we have set the default value of acc in method signature with 1
      greeting(age = 23, name = "mom mom")
      greeting(name = "mick mick", age=34)
      greeting("sam sam", 45)
      //greeting(34) compiler will give error here because it try to put the 34 in name
      // if your leading parameter are set to default value then you need to pass argument by name
  }

  def factorial(n: Int, acc: Int=1): Int = {    // default value is set to 1
    if(n <=1 ) acc
    else factorial(n-1, n * acc)
    /*
    for n = 5
    factorial(5-1, 5 * 1)
    factorial(4-1, 4 * 5 * 1)
    factorial(3-1, 3 * 4 * 5 * 1)
    factorial(2-1, 2 * 4 * 5 * 1)
    factorial(1-1, 1 * 2 * 4 * 5 * 1)
    */
  }
  def greeting(name: String="Tom Tom", age: Int,country: String = "India") : Unit =
    println(s"hello $name your age is $age and you live in $country")
}
