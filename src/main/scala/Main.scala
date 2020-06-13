object Main {
  def main(args: Array[String]): Unit = {
    val cc = new CreditCard("Martins Credit card")
    val cafe = new Cafe()
    cafe.buyCoffee(cc)
  }
}

