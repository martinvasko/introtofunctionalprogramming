case class Charge(cc: CreditCard, price: Int) {
  def combine(other: Charge): Charge = {
    if (cc == other.cc) {
      Charge(cc, price + other.price)
    } else {
      throw new Exception("Can't combine charges to different cards")
    }
  }
}
