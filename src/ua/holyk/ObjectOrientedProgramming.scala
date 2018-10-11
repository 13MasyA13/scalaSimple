package ua.holyk

object ObjectOrientedProgramming {

  def main(args: Array[String]): Unit = {

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
