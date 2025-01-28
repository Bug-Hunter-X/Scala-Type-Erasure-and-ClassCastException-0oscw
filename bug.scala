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

    //This will cause error
    val myString: MyClass[String] = myInt.asInstanceOf[MyClass[String]]
    myString.printValue()
  }
}
```