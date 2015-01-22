package demo

object Collections {
  import scala.annotation._

  @tailrec
  def contains[T](xs: Seq[T], cond: T => Boolean): Boolean =
    xs match {
      case Nil => false
      case head :: tail => 
        if(cond(head)) true
        else contains(tail, cond)
    }

  def take[T](xs: Seq[T], num: Int): Seq[T] = 
    if(xs.isEmpty || num<=0) Nil
    else xs.head +: take(xs.tail, num-1)

  def map[T, S](xs: Seq[T], f: T => S): Seq[S] =
    xs match {
      case Nil => Nil
      case head :: tail => f(head) +: map(tail, f)
    }

  def toList[T](xs: Seq[T]): List[T] =
    xs.foldRight(List.empty[T])((x, acc) => x :: acc)

  def reverse[T](xs: Seq[T]): Seq[T] =
    xs.foldLeft(Seq.empty[T])((acc, x) => x +: acc)

  def sum(xs: Seq[Int]): Int =
    xs.reduce(_+_)

  def maxf(xs: Seq[Int]): Int =
    xs.foldRight(Int.MinValue)((x, max) => if(x > max) x else max)

  def maxr(xs: Seq[Int]): Int = {
    def max(a: Int, b: Int) = if(a > b) a else b
    xs.reduce(max)
  }
}
