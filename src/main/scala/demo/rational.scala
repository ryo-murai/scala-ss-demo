package demo

class Rational(n: Int, d: Int) {
  import scala.annotation._

  assert(d != 0)

  // http://ja.wikipedia.org/wiki/ユークリッドの互除法
  @tailrec
  private def gcd(x: Int, y: Int): Int =
    if(y == 0) x else gcd(y, x % y)
  
  private val g = gcd(n, d)
  // numorator
  val numor: Int = n/g

  // denominator
  val denom: Int = d/g

  def +(that: Rational) = 
    new Rational(numor * that.denom + that.numor * denom,
      denom * that.denom)

  def -(that: Rational) =
    new Rational(numor * that.denom - that.numor * denom,
      denom * that.denom)

  def *(that: Rational) =
    new Rational(numor * that.numor, denom * that.denom)

  def /(that: Rational) =
    new Rational(numor * that.denom, denom * that.numor)

  override def toString: String = s"$numor / $denom"
}
