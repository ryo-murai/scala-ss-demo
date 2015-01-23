package demo

package demo.mutable {
  class Point(xc: Int, yc: Int) {
    var x: Int = xc
    var y: Int = yc
    def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
    }
    override def toString(): String = "(" + x + ", " + y + ")";
  }
}

case class Point(x: Int, y: Int) {
  def move(dx: Int, dy: Int) = 
    Point(x + dx, y + dy)
}
