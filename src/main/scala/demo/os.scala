package demo

sealed trait OperatingSystem {def version: String}

case class Windows(version: String) extends OperatingSystem
case class MacOSX(version: String) extends OperatingSystem
case class Linux(distribution: String, version: String) extends OperatingSystem


object OS {
  def oslabel(os: OperatingSystem): String = os match {
    case Linux(distri, ver) => s"$distri $ver"
    case _ => os.getClass.getSimpleName + " " + os.version
  }
  
  def oslist: Seq[OperatingSystem] = List(Windows("8"), MacOSX("10"), Linux("CentOS", "7"))
}
