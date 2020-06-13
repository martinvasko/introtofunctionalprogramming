class Cafe {
  def buyCoffee(cc: CreditCard) = {
    val cup = new Coffee()
    cc.charge(cup.price)
    cup
  }
}
