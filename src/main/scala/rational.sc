class Rational(n: Int, d: Int) {
  private val g = gcd(n.abs, d.abs)
  val num: Int = n/g
  val denom: Int = d/g
  require(this.denom != 0, "Denominator can't be zero!")
  def this(n: Int) = this(n, 1)
  override def toString(): String = num + "/" + denom
  def +(that: Rational): Rational =
    new Rational(num * that.denom + denom * that.num, denom * that.denom)
  def +(that: Int): Rational = this + new Rational(that, 1)
  def *(that: Rational): Rational =
    new Rational(num * that.num, denom * that.denom)
  def *(that: Int): Rational = this * new Rational(that, 1)
  def lessThan(that: Rational): Boolean = num * that.denom < denom * that.num
  def max(that: Rational): Rational = if (this.lessThan(that)) that else this
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}
val oneHalf = new Rational(1, 2)
val twoThirds = new Rational(2, 3)
val mOneHalf = new Rational(-1, 2)
val mTwoThirds = new Rational(2, -3)
oneHalf + twoThirds
oneHalf lessThan twoThirds
twoThirds max oneHalf
val five = new Rational(5)
five + oneHalf
oneHalf + mTwoThirds
val x = new Rational(3, 4)
val y = new Rational(4, 5)
val z = new Rational(6, 7)
val w = new Rational(3, 4)
implicit def intToRational(x: Int): Rational = new Rational(x, 1)
x + y * z
x + 1
y * 2
1 * z
x == w


