package classes

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 28.07.2021                 │ 
//   └────────────────────────────┘

fun main() {
    println(fullName)
    fullName.onPrint()
}

interface Print2 {
    fun onPrint()
}

open class User2 {
    open fun getUserFullName() {}
}

val fullName: Print2 = object : Print2, User2() {
    val name = "Murat"
    val surname = "Çay"

    override fun onPrint() {
        println("$name $surname")
    }

    override fun getUserFullName() {
        super.getUserFullName()
    }

    override fun toString(): String {
        return "full name: $name $surname"
    }
}