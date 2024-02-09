package scalaexcercise.basic

object Expression {
  def main(args: Array[String]): Unit = {
    val x: Int = 42
    val acond = true
    val a1 = if (acond) 3 else 5
    println("val of a1.."+a1)
    println(if (acond) 3 else 5)
    println(x = 3)
    val ccodeblock1 = {
      val x =2
       val z = x +1
      if(z > 4) "hi" else "bye"    //final out of block will be the output of last line(String)
    }
    println(ccodeblock1)
    val acodeblock2 = {
      2 < 3                        //final out of block will be the output of last line(Boolean)
    }
    println("acodeblock2:"+acodeblock2)
    val acodeblock3 = {
      if(22 > 4) "hi" else "bye"
      34                           //final out of block will be the output of last line(Int)
    }
    println("acodeblock3:"+acodeblock3)
  }

}
