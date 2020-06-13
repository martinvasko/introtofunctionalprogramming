class CreditCard(name: String) {

  def charge(price: Int): Unit = {
    print("Charging " + name + " price " + price)
  }
}
