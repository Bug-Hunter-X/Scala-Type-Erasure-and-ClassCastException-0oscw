```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass[Int](10)
    myInt.printValue()

    //Safe solution: avoid unsafe casting
    val myString = new MyClass[String]("Hello")
    myString.printValue()
  }
}
```