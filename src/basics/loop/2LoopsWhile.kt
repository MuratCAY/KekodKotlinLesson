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
     * for + if else nin bir durumlu hali gibi while durumu. 1 Şart var ise while ile yapabiliriz
     */

    var number = 0
    while (number < 5) {
        print("${number++} , ")
    }

    while (number < 5) {
        print("$number , ")
        number++
    }

    println("")

    for (value in 0..1000) {
        if (value < 5) {
            print("$value , ")
        } else {
            return
        }
    }




}
