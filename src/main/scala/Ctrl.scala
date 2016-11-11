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
  def filesContaining(query: String, matcher: (String, String) => Boolean) = {
    for (file <- filesHere if file.getName.contains(query)) yield file
  }
  def filesRegex(query: String, matcher: (String, String) => Boolean) = {
    for (file <- filesHere if file.getName.matches(query)) yield file
  }
  def filesMatching(query: String, matcher: (String) => Boolean) = {
    for (file <- filesHere if matcher(file.getName)) yield file
  }
  def filesEndingNew(query: String) = {
    filesMatching(query, _.endsWith(query))
  }
  def filesContainingNew(query: String) = {
    filesMatching(query, _.contains(query))
  }
  def filesRegexNew(query: String) = {
    filesMatching(query, _.matches(query))
  }
  def main(args: Array[String]) = {
    pwd()
    for (file <- filesEnding(".sbt")) println(file.getName)
  }

}
