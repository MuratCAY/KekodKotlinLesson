package basics.loop

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 10.07.2021                  │ 
//   └────────────────────────────┘

fun main() {
    /**
     * 3 Farklı şekilde for tanımlayabiliriz
     * value in list                şeklinde value değerlerini alabilirsiniz
     * index in list.indices        şeklinde index değerlerini alabilirsiniz
     * (index, value) in list.withIndex()  şeklinde index ve value değerlerini alabiliriz
     */
    for (value: Int in 1..10) {
        println("$value")
    }

    val countryCodeArray = arrayOf("tr", "az", "fr", "ar", "en")

    for (value in countryCodeArray) {
        println("$value")
    }

    for (index in countryCodeArray.indices) {
        println("\n$index. değeri ${countryCodeArray[index]}")
    }
    println(" ")

    for ((index, value) in countryCodeArray.withIndex()) {
        println("$index değeri $value")
    }

    /**
     * repeat(size) işlemi ile liste olmadan istediğiniz şeyi tekrarlayabilirsiniz
     */

    repeat(10) {
        println("Çok ders çalışacağım")
    }

    /**
     * return kullanarak ilgili şart sağlanırsa döngüden çıkabilirsiniz
     * continue kullanarak ilgili şart sağlanırsa, donguye o değeri atlayarak devam edebilirsiniz
     */

    for (value in 0..50) {
        if (value % 2 == 1) {
            continue
        }
        println("$value")
    }

    for (value2 in 0..50) {
        if (value2 % 2 == 1) {
            break
        }
        println(value2)
    }


    /**
     *  iç içe for donguleri kullanıyorsak bir üsteki for değilde daha üstteki for a dönmek için label kullanabiliriz
     *   bunun icin labelname@ ifadesini ilgili for'un onune yazip, return ya da continue yapacagimiz
     *      yere ise @labelname seklinde yazmamiz yeterlidir.
     */

    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue
            }
            print(" continue1:$value2 ")
        }
    }
    println("\n")

    returnLabel@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue@returnLabel
            }
            print(" continue2:$value2 ")
        }
    }
    println("\n")


    for (value in 1..50) {
        for (value2 in 1..10) {
            if (value2 == 5) {
                break
            }
            print(" Break1:$value2 ")
        }
    }
    println("\n")


    git@ for (value in 1..50) {
        for (value2 in 1..10) {
            if (value2 == 5) {
                break@git
            }
            print(" Break2:$value2 ")
        }
    }

}
