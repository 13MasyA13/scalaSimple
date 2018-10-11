package ua.holyk

object Test{
  val a: Int = 10
  // a = 100 won't working cause val -> immutable (var -> like in java [without data types])
  var b = "ABC"
  b = "CBA"

  // define a function witch takes 2 values and function as parameters
  def math(x: Double, y: Double, f:(Double, Double) => Double): Double = f(x, y)

  def forTemplate(): Unit = {
    for(a <- 10 to 20){ // 20 is included
      for(b <- 0 until 20){ // 20 isn't included
        println("a = " + a + " , " + "b = " + b)
      }
    }
  } // 'yield' if need to return something

  // Analogue of 'switch-case'
  def switchCaseLikeInJava(a: Int): Unit = {
    a match {
      case 1 => println("a = " + a)
      case 2 => println("a = " + a)
      case 3 => println("a = " + a)
    }
  }

  // Example of currying function
  def currFunk1(x: Int, y: Int) = x + y
  def currFunk2(x: Int) = (y: Int) => x + y
  def currFunk3(x: Int) (y: Int) = x + y

  def main(args: Array[String]): Unit = {
    val a = math(10.5, 35.9, (x,y) => x + y - 0.4)
    println(a)

    println("Example of \'for\' ")

    // Example of 'for'
    forTemplate()

    println("Example of anonymous function")

    // Example of anonymous function
    val f = (a: Int, b: Int, c: Int) => println(a + b + c)
    f(15,30,45)

    println("Example of Partially Applied Function")

    // Example of Partially Applied Function ['_' is place where we can place an another argument]
    val f1 = f(15, 30, _: Int)
    f1(20)

    println("Example of Closure Function")

    // Example of Closure function [it's when function depends of variable that outside the function]
    var freeVar = 20
    val closureFunc = (x: Int) => x + freeVar
    println(closureFunc(30))

    println("Example of Currying function")

    // Example of Currying function

    // First example
    println(currFunk1(20, 30))

    // Second example
    val cf2 = currFunk2(20)
    println(cf2(30))

    // Third example
    println(currFunk3(30)(20))
  }
}
