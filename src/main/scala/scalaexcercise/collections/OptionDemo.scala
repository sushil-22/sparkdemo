package scalaexcercise.collections

object OptionDemo {
  def main(args: Array[String]): Unit = {
    //The Option type itself is unimplemented but depends on two subtypes: Some and None.
    val option1: Option[Int] = Some(2)
    val option2: Option[String] = None
    println(option1 + "---"+ option2)

    println(Option(unsafe()))
    //In below two line output will same but in
    val chainres = Option(unsafe()).orElse(Option(backupmethod()))  //user will care about handling option
    val betterchainres = betterunsafe() orElse betterbackupmethod() //this code is clean and user will not care about handling option
    println("chain result.."+chainres)
    println("better chain result.."+betterchainres)
    println(toInt("mn12"))

    //Function on option
  }

  //unsafe api
  def unsafe(): String = null
  def backupmethod(): String = "valid value"
  //(Safe api) here api are design to return api so user will not care about handling option
  def betterunsafe(): Option[String] = None
  def betterbackupmethod(): Option[String] = Some("valid result")
  //example 2
  def toInt(in: String): Option[Int] = {
    try {
      Some(Integer.parseInt(in.trim))
    }
    catch {
      case e: NumberFormatException => None
    }
  }


}
