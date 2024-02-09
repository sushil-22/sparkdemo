package scalaexcercise.Ops_Basic

import scalaexcercise.Ops_Basic.GenericExample.InvariantList

object GenericExample extends App{
  class MyList[A] {  }
  object MyList {
    def empty[A]: Unit = new MyList[Int]
  }
  val emptylistofinteger = MyList.empty[Int]

  // Variance problem
  class Animal
  class Dog extends Animal
  class Cat extends Animal

  //COVARIANCE
  class CoviantList[+A]{}
  val animalList: CoviantList[Animal] = new CoviantList[Cat]
  // INVARIANCE
  class InvariantList[A] {}
  val invariantlist : InvariantList[Animal] = new InvariantList[Animal]
  //CONTRAVAIANCE
  class Trainer[-A] {}
  val trainer: Trainer[Cat] = new Trainer[Animal]

  class Car {}
  // BOUNDED TYPE
  class Cage[A <: Animal](a: Animal) {}
  val catCage = new Cage(new Cat)
  val dogCage = new Cage(new Dog)
  //val carCage = new Cage(new Car) // error here because car is not sub type of Animal

}
