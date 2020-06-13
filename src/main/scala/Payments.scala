class Payments {
  def charge(cc: CreditCard, price: Int): Unit = {
    print("Charging " + cc.name + " with " + price)
  }
}
