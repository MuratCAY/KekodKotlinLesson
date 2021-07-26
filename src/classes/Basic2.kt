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
    val car = Car(4)
    val car1 = Car(2, "Mavi")
    val car2: Car = Car("Mini Cooper")
    val car3 = Car("Mini Cooper", "Demir")
}

class Car(wheelCount: Int, color: String = "Red") {
    private val mWheelCount: Int
    private val mColor = color

    init {
        mWheelCount = wheelCount
        "primary constructor created".printLog()
        "WheelCount : $mWheelCount, color: $mColor".printLog()
    }

    constructor(name: String) : this(4) {
        "1. secondary constructor created".printLog()
    }

    constructor(name: String, madeOf: String) : this(5, "Sari") {
        "2. secondary constructor created".printLog()
    }


}

fun String.printLog() {
    println(this)
    println("--------------------------------")
}