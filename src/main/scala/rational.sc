class Rational(n: Int, d: Int) {
  private val g = gcd(n, d)
  val num: Int = n
  val denom: Int = d
  require(this.denom != 0, "Denominator can't be zero!")
  def this(n: Int) = this(n, 1)
  override def toString(): String = num + "/" + denom
  def add(that: Rational): Rational =
    new Rational(num * that.denom + denom * that.num, denom * that.denom)
  def lessThan(that: Rational): Boolean = num * that.denom < denom * that.num
  def max(that: Rational): Rational = if (this.lessThan(that)) that else this
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}
val oneHalf = new Rational(1, 2)
val twoThirds = new Rational(2, 3)
val oneHalf = new Rational(1, 2)
val twoThirds = new Rational(2, 3)
oneHalf add twoThirds
oneHalf lessThan twoThirds
twoThirds max oneHalf
val five = new Rational(5)
five add oneHalf


