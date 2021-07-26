package Deneme

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 24.07.2021                 │ 
//   └────────────────────────────┘

private var coinFlips = 0
private var headsWins = 0
private var tailsWins = 0
fun main() {
    print("Flip the how many coin times? ")
    val numberOfTimes = readLine()!!.toInt()
    for (i in 0 until numberOfTimes) {
        val random = (1..2).random()
        ++coinFlips
        if (random == 1) ++headsWins
        else ++tailsWins

        println("Coin flipped: $coinFlips")
    }
    println("""
        Total flips: $coinFlips
        ---
        Heads won: $headsWins times
        Tails won: $tailsWins times
    """.trimIndent())
}
