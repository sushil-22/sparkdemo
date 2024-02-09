package scalaexcercise.basic

import java.io.FileNotFoundException

object TryCatchdemo {
  def main(args: Array[String]): Unit ={
    println("hi,,")
    trydemo(2)
  }

  def trydemo(num: Int) : Unit = {
    try {
      val myarr: Array[Int] = Array(12,22,33,55)
      //val res = num/0
      print(myarr(11))
    }
    catch {
      case x: IndexOutOfBoundsException => None
      case x: FileNotFoundException => println("no file")
      //case x: ArithmeticException => println("no format excp")
      case x: Exception => println("exception caused")
    }
    finally {
      println("this is finally block..")
    }
  }

}
