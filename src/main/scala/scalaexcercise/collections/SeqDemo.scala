package scalaexcercise.collections

object SeqDemo {
  def main(args: Array[String]): Unit = {
    //Seq
    val myseq = Seq(4,6,1,8,3)
    val data2 = Seq(
      ("Chandler",33,11,55),
      ("tom",55,67,12),
      ("Phoebe",91,99,11),
      ("Rachael",65,11,77),
      ("Joey",55,98,45),
      ("Ross",45,90,45)
    )
    data2.foreach(x => println(x))
    println(myseq)
    println(myseq.reverse)
    println(myseq(2))
    println(myseq ++ Seq(8,9))
    println(myseq.sorted)
  }

}
