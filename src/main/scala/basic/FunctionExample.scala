package scalaexcercise.basic

object FunctionExample {

  def main(args: Array[String]): Unit = {
    println(test1("sushil",123))
    println(aReapeatedFunction("hello",3))
    println(aBigFunction(10))
    println("is Prime : "+checPrime(6))
  }

  def test1(a: String, b: Int) : String = {
    a + " " + b
  }
  def aReapeatedFunction(str: String, cnt: Int) : String = {
    if (cnt == 1)
      return str;
    str + aReapeatedFunction(str, cnt -1 )
  }

  def aBigFunction(n: Int) : Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b
    // return type of inner function can used as return type of outer function
    aSmallFunction(n, n-1)
  }

  def checPrime(num : Int) : Boolean = {  // need to correct this
    def checkUntill(t : Int): Boolean = {
      println("value of t: "+t)
      if (t == 1) true
      else num % t != 0 && checPrime(t-1)
    }
    checkUntill(num)
  }
  def test(x: Int) = x +2

}
