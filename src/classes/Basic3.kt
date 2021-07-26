package classes

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 17.07.2021                 │ 
//   └────────────────────────────┘

fun main() {
    val rectangle = Rectangle("Shape")
    val fast = Fast("Shape1", "Blue")
    val circle = Circle("Shape2", "Red", 2)

    rectangle.drawShape()
    println(" ")
    fast.drawShape()
    println(" ")
    circle.drawShape()


}

open class Shape(val name: String) {
    var mColor: String = ""
    var mEdgeCount: Int = 0

    constructor(name: String, color: String) : this(name) {
        mColor = color
    }

    constructor(name: String, color: String, edgeCount: Int) : this(name) {
        mColor = color
        mEdgeCount = edgeCount
    }

    open fun drawShape() {
        println("Name: $name")
        println("Color: $mColor")
        println("EdgeCount: $mEdgeCount")

    }
}

class Rectangle(name: String) : Shape(name) {

    override fun drawShape() {
        super.drawShape()
        val rectangle = """
    *********
    *       *
    *       *
    *********
    """.trimIndent()
        println(rectangle)
    }

}

class Fast(name: String, color: String) : Shape(name, color) {
    override fun drawShape() {
        super.drawShape()
        val fast = """
            90    100                          90    100
       80  \           110                80              110
            \
   70        \             120        70                      120
              \
 60            \             130    60                          130
                O                                  O
 50                          140    50              \           140
                                                     \
  40                        150      40               \        150
               mph                                mph  \
     30                  160            30              \   160
   This is your code on the VAX       This is your code on the SGI   
            """.trimIndent()
        println(fast)
    }
}

class Circle(name: String, color: String, edgeCount: Int) : Shape(name, color, edgeCount) {

    override fun drawShape() {
        super.drawShape()
        val circle = """
         , - ~ ~ ~ - ,
     , '               ' ,
   ,                       ,
  ,                         ,
 ,                           ,
 ,                           ,
 ,                           ,
  ,                         ,
   ,                       ,
     ,                  , '
       ' - , _ _ _ ,  '
       """.trimIndent()
        println(circle)
    }

}


fun String.printEt() {
    println(this)
}

fun String.space() {
    println("\n")
}

