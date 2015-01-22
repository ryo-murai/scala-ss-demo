package demo

// http://ja.wikipedia.org/wiki/ボディマス指数
trait BMI {
  import Math.pow

  // BMI
  def bmi(p: Person): Double = bmi(p.height.toDouble, p.weight.toDouble)

  def bmi(h: Double, w: Double): Double = w / pow(h/100, 2)

  // return -1 if underweight
  // return 0 if standard weight
  // return 1 if overweight
  def assessWithRange(index: Double, stdRange: (Double, Double)): Int = stdRange match {
    case (min, max) =>
      if(index < min) -1
      else if(index >= max) 1
      else 0
  }
}

object JapaneseBMI extends BMI {
  val bmiStdRange = (18.5, 25.0)

  def assess = assessWithRange(_: Double, bmiStdRange)
}
