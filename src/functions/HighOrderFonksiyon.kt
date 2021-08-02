package functions

import kotlin.math.abs

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 12.07.2021                 │ 
//   └────────────────────────────┘

fun main() {

    val highOrderFunction = { surname: String ->
        "surname: $surname"
    }


    val number1: Int = 3
    val number2: Int = 6

    val result = abs(number1,number2)
    println(result)

    val resultOfMultiCation = doMathOperation(number1,number2,::multiplyTwoNumber)
    println("Multiply Two Number: $resultOfMultiCation")

    val resultOfSum = doMathOperation(number1,number2,::sumTwoNumber)
    println("Sum Two Number: $resultOfSum")
}

fun abs(number1: Int, number2: Int): Any {
    return number1 - number2
}

fun multiplyTwoNumber(number1: Int, number2: Int) = number1 * number2
fun sumTwoNumber(number1: Int, number2: Int) = number1 + number2

//cross inline
fun doMathOperation(number1: Int, number2: Int, function: (Int, Int) -> Int) = function(number1, number2)

