object Main {
  def main(args: Array[String]): Unit = {
    val greeter = new CustomizableGreeter("How are you, ", "?")
    greeter.greet("Scala developer")
  }
}

