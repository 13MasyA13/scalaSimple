package ua.holyk

object ArraysAndDataStructures {

  // Array example
  def arrays(): Array[Int] = {
    val array = new Array[Int](10)
    array(0) = 40
    array(1) = 20

    for(x <- 2 until(10)){
      array(x) = 50
    }

    return array
  }

  // Example of List
  def myList(): Unit ={
    val myList: List[Int] = List(10, 30, 100, 50, 45)

    println(myList)
    // '::' ISN'T INSERT values in list
    println(0 :: myList)
    // Nil is an empty list by default
    println(0 :: 50 :: 300 :: Nil)
    // Also List have default methods like max(), reverse(), tail(), etc..
  }

  // Set is the same as in Java

  // Example of Map
  def myMap() = {
    val myMap: Map[String, Int] = Map("one" -> 1, "two" -> 2, "three" -> 3) // etc..
    println(myMap)
  }

  // Example of Tuple
  def myTuple(): Unit = {
    val myTuple = (10, "H", .069, true)
    println(myTuple._1) // prints first element
    println(myTuple._3) // prints third element [and etc..]

    val myTuple2 = (100, (30, 0))
    println(myTuple2._2) // prints (30,0)
  }

  // Example of Scala Options [Some or None]
  def scalaOptions() = {
    val myList: List[Int] = List(10, 70, 45, 30)
    println(myList.find(_ == 10))
    println(myList.find(_ > 1000))
  }

  def main(args: Array[String]): Unit = {
    println("Array example")
    val arr = arrays()
    for(x <- 0 to arr.length - 1){
      print(arr(x) + " , ")
    }

    println()
    println("Example of List")
    myList()

    println("Example of Map")
    myMap()

    println("Example of Tuples")
    myTuple()

    println("Example of Options [Some or None]")
    scalaOptions()
  }
}
