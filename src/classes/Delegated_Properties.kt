package classes

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 1.08.2021                 │ 
//   └────────────────────────────┘

fun main() {
//    val cardDetailFragment = CardDetailFragment()
//    cardDetailFragment.printUserInfo()
    val balanceChanged = object :BalanceChanged{
        override fun onBalanceChange(changedBalance: Long) {
            
        }
    }
}

interface BalanceChanged {
    fun onBalanceChange(changedBalance: Long)
}

class BankAccount(
    val balanceChanged: BalanceChanged
) {
    var balance: Long = 1_000_000
        set(value) {
            field = value
            if (value <= 100) {
                balanceChanged.onBalanceChange(value)
            }
        }
}


data class User5(val name: String = "Murat", val surname: String = "Çay")

class CardDetailFragment {
    val user: User5 by lazy(LazyThreadSafetyMode.PUBLICATION) {
        println("User5 Init")
        User5()
    }
    lateinit var user2: User5
    lateinit var userType: String
    fun printUserInfo() {
        println("name: ${user.name} surname: ${user.surname}")

        if (this::user2.isInitialized) {
            user2 = User5()
        }
        println("name: ${user.name} surname: ${user.surname}")
    }

    init {
        userType = "Premium"
    }
}
