val args = List("this", "is", "More", "Like", "it")
for (arg <- args) print(arg)
val str = Array.apply(21, 3)
str(0)
str.length
0.to(3)
str.apply(0)
str.update(1,5)
str(0)
()

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
tuples.foreach(println)

val inc = (x: Int) => x + alpha
inc(2)
inc.apply(4)

val someNumbers = List(12, 3, 7, 2, -5, -4, 9, 1)
someNumbers.filter(x => x > 2)
val f = (_: Int) + (_: Int)
f(3, 4)
someNumbers.foreach(println(_))
def sum(x: Int, y: Int, z: Int) = x + y + z
val sum1 = sum (1,_: Int,_: Int)
val sum2 = sum1(2, _: Int)
sum(1,2,3)
sum1(2,3)
sum2(3)
someNumbers.foreach(alpha += _)
alpha

def echo(args: String*) = for (arg <- args) println(arg)
echo("abc", "qwe", "def")
val arr = Array("qwe", "asd", "zxc")
echo(arr: _*)

def printMe(str1: String = "First param",
            str2: String = "Second param") = println(str1 + " " + str2)
printMe()
printMe("ta-daaaa")
printMe(str2 = "kaboom")

