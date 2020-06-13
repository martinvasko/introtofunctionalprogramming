abstract class Product {
  val price: Int

  def charge(price: Int): Unit = {
    print("Charging " + price)
  }
}
