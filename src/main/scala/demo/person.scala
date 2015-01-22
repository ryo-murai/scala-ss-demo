package demo

case class Person(name: String, age: Int, height: Int, weight: Int)

object Persons {
  import scala.util.Random

  val r = new Random

  def apply(num: Int): List[Person] = 
    if(num<=0) Nil
    else randomPerson :: apply(num-1)

  private def randomPerson = 
    Person(randomName(r.nextInt(17)+3), r.nextInt(100), r.nextInt(150)+50, r.nextInt(97)+3)

  private def randomName(len: Int): String = r.alphanumeric.take(len).mkString
}
