import java.io.File
println(System.getProperty("user.dir"))
object Ctrl {
  def pwd() = println(System.getProperty("user.dir"))
  private def filesHere = new File(".").listFiles()
  def filesEnding(query: String) = {
    for (file <- filesHere if file.getName.endsWith(query)) yield file
  }
  def main(args: Array[String]) = {
    pwd()
    for (file <- filesEnding(args(0))) println(file.getName)
  }

}

Ctrl.main(Array("dll"))






