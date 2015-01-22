package demo

class Rational(n: Int, d: Int) {
  import scala.annotation._

  assert(d != 0)

  // http://ja.wikipedia.org/wiki/ユークリッドの互除法
  @tailrec
  private def gcd(x: Int, y: Int): Int =
    if(y == 0) x else gcd(y, x % y)
  
  private val g = gcd(n, d)
  val numor: Int = n/g
  val denom: Int = d/g

  def +(that: Rational) = 
    new Rational(numor * that.denom + that.numor * denom,
      denom * that.denom)

  override def toString: String = s"$numor / $denom"
}
