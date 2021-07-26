package basics

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 7.07.2021                  │ 
//   └────────────────────────────┘

fun main() {

    /**
     * Sonlu sayılı liste oluşturmaya yarar
     */

    /**
     * Küçükten büyüğe liste oluşturmak için .. operatorunu ya da rangeTo() operatorunu kullanabiliriz.
     */

    val numbers = 1..100
    val numbers2 = 1.rangeTo(100)

//    numbers.forEach {
//        println(it)
//    }
//    numbers2.forEach {
//        println(it)
//    }

    /**
     *  Charlardan oluşan listede yapabiliriz ama türkçe karakterleri içermez
     */

    val alphabet = 'A'..'Z'
//    alphabet.forEach {
//        println(it)
//    }

    /**
     * Büyükten küçüğe sıralamak için .. opartorunu kullanamayız! Böyle birşey yapmak istiyorsak
     * downTo() yu kullanabiliriz
     */

    val buyuktenKucuk = 100 downTo 1 //infix bu
    val buyuktenKucuk2 = 100 downTo (1)

//    buyuktenKucuk.forEach {
//        println(it)
//    }

    /**
     *  Until ile de range oluşturulabilir ama son değeri almaz
     */

    val untilRange = 1 until 100
    // infix bu :)
//    untilRange.forEach {
//        println(it)
//    }

    /**
     * step kullanarak dizinin ne kadar artacağını belirtebilirsin
     */

    val stepedNumber = 0..100 step 5
//    stepedNumber.forEach {
//        println(it)
//    }

    val reversedStepNumbers = 100 downTo 0 step 4
//    reversedStepNumbers.forEach {
//        println(it)
//    }

    /**
     *      CharRange, IntRange gibi primitive tiplerle de range tanimi yapilabilir.
     *      Bu durumda, first, last, step, count gibi ek bilgiler alinabilir.
     * **/
    val numberList: IntRange = 10 until 90
    println(numberList.first)
    println(numberList.last)
    println(numberList.step)


    when (10) {
        in numberList -> {
            println("10 sayısı numberList içerisinde yer alır")
        }
    }

    println(numberList.count())

    val numbers50thanBig = numberList.count { it > 50 }
    println(numbers50thanBig)

    val ortalama = numberList.average()
    val tersi = numberList.reversed()

    println("Numberlist ortalama: $ortalama")
    println("NumberList Tersi: $tersi")

}
