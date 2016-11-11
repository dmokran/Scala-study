def plainSum(x: Int, y: Int) = x + y
def curriedSum(x: Int)(y: Int) = x + y
def first(x: Int) = (y: Int) => x + y
def sum3(x: Int) = (y: Int) => (z: Int) => x + y + z
def twice(arg: Int, op: Int => Int) = op(op(arg))

plainSum(3, 5)
curriedSum(4)(5)
val onePlus = curriedSum(1)_
onePlus(9)
first(3)(4)
val f = first(4)
f(5)
val addOne = sum3(1)
val addFive = addOne(4)
val res = addFive(6)
twice(3, x => x * x)