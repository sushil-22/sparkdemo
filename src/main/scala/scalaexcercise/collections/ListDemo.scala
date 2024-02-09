package scalaexcercise.collections

object ListDemo {
  def main(args: Array[String]): Unit = {
    //List
    // List are ordered collection, allow duplicate, immutable by default, access by index
    var list1= List("amit", "sumit", "vinit", "ajit", "kavit", "lalit", "lalit", "vinit", "vinit")
    var g = list1.groupBy(x => x).mapValues(_.size)
    println(g)
    val alist = List(1,2,3,3,4)
    val blist = List(22,33,44)
    println(alist(1))
    alist.sortWith( (a,b) => a<b) // sorting logic
    val finallist1 = alist ++ blist
    val list2 = 4 +: alist
    println(s"head is ${alist.head} tail is ${alist.tail} and is empty ${alist.isEmpty}")                   //exception here
    println(s"first ele: ${alist(0)}")      // access element
    val apple3 = List.fill(3)("apple")                   //curried function here
    println("apple3.."+apple3)
    println(apple3.mkString("#"))

    var myset: Set[Int] = Set()
    var mylist: List[Int] = List()
    var myarr: Array[Int] = Array(1)

    myset += 6
    myset += 7

    mylist = mylist :+ 4
    mylist = mylist :+ 5

    myarr = myarr :+ 5

    println(s"set is $myset")
    println(s"list is $mylist")
    println(s"arr is $myarr")
  }

}
