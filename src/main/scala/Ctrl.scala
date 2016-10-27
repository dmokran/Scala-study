import java.io.File

/**
  * Created by xdanmok on 2016-10-27.
  */
object Ctrl {
  def pwd() = println(System.getProperty("user.dir"))
  private def filesHere = new File(".").listFiles()
  def filesEnding(query: String) = {
    for (file <- filesHere if file.getName.endsWith(query)) yield file
  }
  def main(args: Array[String]) = {
    pwd()
    for (file <- filesEnding(".sbt")) println(file.getName)
  }

}
