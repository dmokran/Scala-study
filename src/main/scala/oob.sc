abstract class Element {
  def contents: Array[String] //why "def" and not "val"???
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length

}

class ArrayElement(val contents: Array[String]) extends Element{
  def this() = this(Array())
}

val ae = new ArrayElement(Array("Hello", "World"))
val empty = new ArrayElement()
empty.contents.foreach(println)
ae.height
ae.width
ae.contents.foreach(println)
val e: Element = new ArrayElement(Array("Duh-hah"))

