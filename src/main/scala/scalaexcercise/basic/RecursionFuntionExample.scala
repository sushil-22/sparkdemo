package scalaexcercise.basic
//https://www.pixelstech.net/article/1474689232-Traditional-recursion-vs-Tail-recursion

object RecursionFuntionExample {
  def main(args: Array[String]): Unit = {
    //println(simpleFactorial(5))
    //println(myfact(5,1))
    //println(recursionFunction(5,1))
   // println(concatString("hello",3,""))
    val arr = Array(64, 34, 25, 12, 22, 11, 90)
    println(sumArry(arr, arr.length))
    //val result = bubbleSort(arr, arr.length)
    //println(result.mkString(" ")) // prints "11 12 22 25 34 64 90"
    //printevenodd(1,0)
    //println(checkprime(17))
    //println(findMaxArray(arr,0,0))
    //println((1 to 100).map(x=> checkprime(x)))  // check prime number 1 to 100 Functional approach
    //for( i <- 1 to 10) yield {println(fibonacci(i))}
    //println(reverseString("hello",0,""))
    val lst1 = List(8, 5, 3, 2, 1, 1)
    val lst2 = List()
    println(revlist(lst1, lst1.length, lst2))

  }
  def simpleFactorial(num: Int): Int = {
    if(num < 1) {
      println("entered in base condition")
      return 1
    }
    else {
      println("Facorial of "+num)
      val result = num * simpleFactorial(num -1)
      println(s"stack call - factorial of: $num is $result")
      result
    }
  }
  def recursionFunction(n : Int,res: Int): BigInt = {
   if(n == 1 )
      res
    else
     recursionFunction(n-1, n * res)
  }

  def concatString(str: String, n: Int,res: String): String = {
    if(n <= 0) {
      println("base cond..")
      res
    }
    else {
      println("computing logic..")
      concatString(str, n-1, str +  res)
     }
  }

  def sumArry(arr: Array[Int], n: Int): Int = {
    if(n == 0) 0
    else arr(n-1) + sumArry(arr, n-1)
  }
  def bubbleSort(arr: Array[Int], n: Int): Array[Int] = {
    if (n == 1) arr
    else {
      for (i <- 0 until n - 1) {
        if (arr(i) > arr(i + 1)) {
          val temp = arr(i)
          arr(i) = arr(i + 1)
          arr(i + 1) = temp
        }
      }
      bubbleSort(arr, n - 1)
    }
  }

  def printevenodd(num: Int, i: Int): Int = {
    if(i==10) return 1
    else if (num % 2 == 0){
      println("even no.."+num)
      printevenodd(num+1,i+1)
    }
    else {
      println("odd no.."+num)
      printevenodd(num+1, i+1)
    }
  }

  def checkprime(num: Int, i: Int =2): Boolean = {
    if(i > num/i) true
    else if(num % i == 0) false
    else checkprime(num, i+1)
  }

  def myfact(num: Int, res: Int): Int = {
    if (num == 1){
      println(s"enter in base cond. and val of res is $res")
      1
    }
    else{
      println(s"value of num is $num and res is $res" )
      myfact(num - 1, res * num)
    }
  }
  // find maximum element in Array
  def findMaxArray(arr: Array[Int], index: Int, max: Int): Int = {
    if(index >= arr.length)
      max
    else{
      val currmax = if(arr(index)> max) arr(index) else max
      findMaxArray(arr, index+1, currmax)
    }
  }
  def reverseString(str: String, i: Int = 0, res: String): String= {
    if(i >= str.length())
      res
    else reverseString(str, i+1 ,res.concat(str.charAt(str.length()-i-1).toString()) )
  }

  def fibonacci(n: Int): Int = if (n == 1 || n == 2) 1  else  fibonacci(n - 1) + fibonacci(n - 2)

  def revlist(lst: List[Int],len:Int, res: List[Int]): List[Int] = {
    if (len == 0)
      res
    else
      revlist(lst, len - 1, res :+ lst(len - 1))
  }
  def anagramCheck(): Unit = {
    val s1 = "elevenplustwo"
    val s2 = "twelveplusone"
    val sortedstr1 = s1.toLowerCase().sortWith((c1,c2) => c1<c2)
    val sortedstr2 = s2.toLowerCase().sortWith((c1,c2) => c1<c2)
    println(sortedstr1==sortedstr2)
  }
}
