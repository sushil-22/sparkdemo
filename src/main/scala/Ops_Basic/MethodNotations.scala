package scalaexcercise.Ops_Basic

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String){  // we can not access name untill and unless we are not making it  as val or var
    def likeMovie(movie: String): Boolean = {
      movie == favoriteMovie
    }
    def speakingwith(person: Person): Unit ={
      println(this.name+"---"+person.name)
      println(s"${this.name} is speaking with ${person.name}")
    }
    // example of infix notation
    def +(person: Person): Unit ={
      println(s"${this.name} is hangingout with ${person.name}")
    }
    // example for prefix notation
    def unary_! : String = s"$name is saying hi..."

    // example of postfix anotation
    def isPersson : Boolean = true

    //example of apply
    def apply() : String = s"hi my name is ${this.name} and my favorite movie is $favoriteMovie"
  }
  val marry = new Person("Marry","Gadar")
  val tom = new Person("Tom","war")

  //  ***********infix notation***********
  println("***********infix notation***********")
  println(marry.likeMovie("Gadar"))
  println(marry likeMovie "Gadar")  // this is infix notation = operator notation
  // method with single parameter can be called using infix notation
  // infix notation is also called syntactic sugar for method with only one parameter
  marry.speakingwith(tom)
  marry speakingwith tom
  println(marry + tom)
  marry + tom

  println(1. + (2))  // ALL OPERATORS ARE METHOD

  //  ***********prefix notation***********
  val x = -1   // unary operator are mehtod
  val y = 1.unary_-
  println(x +" ... "+y)
  // unary_prefix only work with +, _ !, ~
  println(!marry)
  println(tom.unary_!)

  //  ***********postfix notation***********
  //postfix anotation is only available to method without parameter
  println(marry.isPersson)
  println(tom isPersson)

  // ***********apply notation***********
  println("-----apply notation-------")
  println(marry.apply())
  println(marry())
}
