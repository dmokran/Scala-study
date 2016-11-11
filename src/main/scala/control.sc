println(System.getProperty("user.dir"))
import Ctrl._

for (f <- filesEnding("dll")) println(f.getName)
for (f <- filesContainingNew("ab")) println(f.getName)
for (f <- filesRegexNew("^a.*")) println(f.getName)

def containsNeg(nums: List[Int]): Boolean = nums.exists(_ < 0)
def containsOdd(nums: List[Int]): Boolean = nums.exists(_ % 2 == 1)
val a = List(1, -3, 4, -5, 2)
val b = List(4, 2)
containsNeg(a)
containsNeg(b)
containsOdd(a)
containsOdd(b)

val assertEnable = false
def myAssert(p: () => Boolean) = {
  if (assertEnable && !p()) throw new AssertionError()
}
def myAssertByName(p: => Boolean) = {
  if (assertEnable && !p) throw new AssertionError()
}
def myAssertBool(p: Boolean) = {
  if (assertEnable && !p) throw new AssertionError()
}
myAssert(() => 5/0 == 1)
myAssertByName(5/0 == 3)
myAssertBool(5/0 == 2)
