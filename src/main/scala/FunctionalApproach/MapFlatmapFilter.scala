package scalaexcercise.FunctionalApproach

object MapFlatmapFilter {
  def main(args: Array[String]): Unit = {
    val mylist = List(2,3,4,5,6)
    val name = List("tim","tom","mick")

    println(mylist.map(x => x+1))
    println(mylist.map(_+1))
    println(name.map(x => x.toUpperCase))

    println(name.flatMap(_.toUpperCase()))
    println(name.flatMap(x => x.toUpperCase()))
    val topair = (x: Int) => List(x,1)
    println("topair list "+mylist.flatMap(topair))

    println(mylist.filter(x => x%2 == 0))

    val numlist =  List(6,7)
    val charlist = List('a','b')
    val colors = List("black","white")

    //Integrating
    val comboftwo = numlist.flatMap(n => charlist.map(c => "" + n + c))
    val combofthree = numlist.flatMap(num => charlist.flatMap(ch => colors.map(col => ""+num+"-"+ch+"-"+col)))
    println("combination is "+comboftwo)
    println("combofthree is "+combofthree)

    //for-comprehension (above code is tricky so to make it simple below forcombination is used)
    val forcombination = for {
      n <- numlist if n % 2 == 0
      c <- charlist
      color <- colors
    } yield "" + n + c
    println("for comprehension "+forcombination)

    //foreach example
    numlist.foreach(println)
    //equivalent of foreach
    for {
      n <- numlist
    }println(n)
  }

}
