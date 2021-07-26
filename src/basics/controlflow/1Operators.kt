package basics.controlflow

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 7.07.2021                  │ 
//   └────────────────────────────┘

fun main() {
    var numberOne = 10
    val numberTwo = 5

    println(numberOne)
    println("${numberOne++}")
    println("$numberOne")
    println("${++numberOne}")

    print("${numberOne + numberTwo} ")
    print(" ")
    println(numberOne.plus(numberTwo))

    print("${numberOne - numberTwo} ")
    print(" ")
    println(numberOne.minus(numberTwo))

    print("${numberOne * numberTwo} ")
    print(" ")
    println(numberOne.times(numberTwo))

    print("${numberOne / numberTwo}")
    print(" ")
    println(numberOne.div(numberTwo))

    print("${numberOne % numberTwo}")
    print(" ")
    println(numberOne.rem(numberTwo))

    println("----------------------------------------------------------------")
//    print("Not giriniz: ")
//    val grade = readLine()!!.toInt()
//    val notChar = if (grade == 100) {
//        println("AA")
//    } else if (100 > grade && grade > 85) {
//        println("BB")
//    } else if (85 > grade && grade > 60) {
//        println("CC")
//    } else if (60 > grade && grade > 50) {
//        println("DD")
//    } else if (50 > grade && grade >= 0) {
//        println("FF")
//    } else {
//        println("Bulunamadı")}


    print("Not giriniz: ")
    val grade = readLine()!!.toInt()
    val notChar = when (grade) {
        100 -> {
            println("AA")
        }
        in 85..99 -> {
            println("BB")
        }
        in 60..84 -> {
            println("CC")
        }
        in 50..59 -> {
            println("DD")
        }
        in 0..49 -> {
            println("FF")
        }
        else -> {
            println("Bulunamadı")
        }
    }


    /**
     *  compareTo() da karşılaştırma için kullanılır
     */

    println(grade.compareTo(100) > 0)
    println(grade > 100)
    // Bu ikisi aynı


    var a = 20
    val b = 5
    a += b
    println("a+=b :$a") //25
    a -= b
    println("a-=b :$a") //20
    a *= b
    println("a*=b :$a") //100
    a /= b
    println("a/=b :$a")//20
    a %= b
    println("a%=b :$a")//0

    /*
    	a+=b    a.plusAssign(b)
    	a-=b    a.minusAssign(b)
        a*=b    a.timesAssign(b)
        a/=b    a.divAssign(b)
        a%=b    a.remAssign(b)
     */

    println("*************************************************")

    var numbOne = 10
    var numbTwo = 5
    val flag = true
    println("+a :" + +numbOne)
    println("q-b :" + -numbTwo)
    println("++a :" + ++numbOne)
    println("a++ :" + numbOne++)
    println("a :$numbOne")
    println("--b :" + --numbTwo)
    println("!flag :" + !flag)

    /*
    	+a      a.unaryPlus()
    	-a      a.unaryMinus()
    	++a     a.inc()
        --a     a.dec()
    	!a      a.not()
     */

    println("------------------------------------------------------------")

    /**
     *
     *      === ifadesi isaret edilen referans tipleri karsilatirir.
     *      == ifadesi degeri karsilastirir.
     */

    //Tekrar Ettim !
}

