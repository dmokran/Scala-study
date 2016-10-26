val args = List("this", "is", "More", "Like", "it")
for (arg <- args) print(arg)
val str = Array.apply(21, 3)
str(0)
str.length
0.to(3)
str.apply(0)
str.update(1,5)
str(0)

val bc = List.apply('b', 'c')
val a = List('a')
bc.::('a')

args.sortBy(s => s.charAt(0))
val triplet = Tuple3(2, 4, 6)
triplet._3

var jetSet = Set.apply("abc", "def")
jetSet.+=("qwe")
jetSet.contains("def")
jetSet

var tmap = Map.apply(1.->('a'), (2, 'b'))
tmap.apply(2)
tmap(1)
tmap += (3 -> 'c')
println(tmap)
4.->('d')
println("ab \n cd \n")
()
def greet() { println("Hi")}
greet() == ()

var alpha = 3
(alpha = 4) != ()

val filesHere = new java.io.File(".").listFiles()
for (file <- filesHere if file.getName.endsWith(".dll")
                      if file.getName.startsWith("d")) println(file)
val tuples = for {i <- 1 to 3
     j <- 4 to 6
     z = i+j}
  yield (i, j, z)
//  println("i =" + i + " j = " + j + " z = " + z)
tuples.foreach(println)


