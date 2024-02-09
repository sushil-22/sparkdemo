package scalaexcercise.basic
class Person
object AbsentValueDemo {

  def main(args: Array[String]): Unit = {
    //null example
    val astr: String = null
    // null has no field no methos
    //val a1 = astr.length  -- null pointer excption
    // Null is type of null reference, Null is replacement of reference type
    val thenullref: Null = null
    val myNullref : Null = null
    //val x1:Long = Null
    //val x:Int = thenullref  // -----> error
    val nostring:String = thenullref
    val noperson: Person = null
    val nolist: List[Int] = thenullref
    println("nostring "+nostring)
    println(noperson)
    println(tryNull(thenullref))

    //Nil
    // Nil is singleton object unlike Null it has field and method, it is used to attribute List
    val emptylist:List[Int] = Nil
    println("is list empty.."+emptylist.isEmpty)

    //None
    // None is subtype of Option , None is used to process a meaning full absent value
    //None is regular value it has method and vlaues
    val absentInt: Option[Int] = None
    val presentInt: Option[Int] = Some(34)
    println("absentInt "+absentInt)
    println("presentInt "+presentInt)
    println("absentInt size "+absentInt.size)
    println("presentInt size "+presentInt.size)
    //Unit
    // Unit is similar to void
    def dosomething1(): Unit = {println("Im not returning anything...")}
    def dosomething2() : Unit = ()
    println("unit func "+dosomething1())
    println("unit func "+dosomething2())

     //Nothing : Nothing is similar to Null, Null can apply for any reference type
    //Nothing is no value at all, Nothing is replacement of any type



  }

  def tryNull(ele: Null): Unit = println("worked")


}
