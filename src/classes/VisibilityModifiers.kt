package classes

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 18.07.2021                 │ 
//   └────────────────────────────┘

fun main() {
    var sub1 = Subclass()

    println(sub1)

    val outher1 = Outer()
}

fun Baz() {

}

class Bar

private fun foo() {

}

private var bar: Int = 5

internal val baz = 6

open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4  // public by default
    var o = 2

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 5   // 'b' is protected
}

class Unrelated(val o: Outer) {

}
class C private constructor(a: Int) {  }



