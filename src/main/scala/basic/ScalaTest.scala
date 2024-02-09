package scalaexcercise.basic

object ScalaTest {
  def main(args: Array[String]): Unit = {
    var set1 = Set(0)
    var set2: Set[Int] = Set()
    val arr = Array(10, 20, 60, 30, 20, 40, 30, 60, 70, 80)
    for(i <-0 to arr.length-1){
      if(set1.contains(arr(i))) set2+=arr(i) else set1+=arr(i)
    }
    println(set1)
    println(set2)
  }

}