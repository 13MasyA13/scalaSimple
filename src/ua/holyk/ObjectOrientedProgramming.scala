package ua.holyk

// val getter setter
// var getter ------
class User(val name: String, val age: Int){

  // Default constructor
  def this(){
    this("Max", 37)
  }

  def this(name: String){
    this(name, 21)
  }
}

// 'println("Constant number is initialized.")' execute only one time but operations with number are allowed
class LazyValueClass{
  lazy val number = { println("Constant number is initialized."); 99 }
}

object ObjectOrientedProgramming {

  def main(args: Array[String]): Unit = {
    val user1 = new User("Mike", 3)
    val user2 = new User()
    val user3 = new User("Tom")
    println("User_1 has a name " + user1.name + " and his age is " + user1.age)
    println("User_2 has a name " + user2.name + " and his age is " + user2.age)
    println("User_3 has a name " + user3.name + " and his age is " + user3.age)

    val lazyObj = new LazyValueClass()
    println("Before Accessing 'number' constant:")
    println(lazyObj.number + 1)
    println(lazyObj.number + 1)
    println(lazyObj.number + 1)

    // Inheritance, Abstract classes and Traits (Interfaces in Java) the same like in Java
  }
}


// Like an interface in Java
trait Template{
  def funk1(a: Int, b: Boolean): Boolean
}

class Realize extends Template{
  // Overriding function from parent's class
  override def funk1(a: Int, b: Boolean): Boolean = {
    val b: Boolean = false
    if(a < 0){
      // without or with 'return'
      b
    } else{
      !b
    }
  }
}
