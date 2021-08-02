package classes

/*
Code with ❤️
┌────────────────────────────┐
│ Created by Murat ÇAY       │
│ ────────────────────────── │
│ MuratTheBestOf@gmail.com   │
│ ────────────────────────── │
│ 30.07.2021                 │
└────────────────────────────┘
*/

fun main() {
    HomeFragment.newInstance()
    HomeFragment.TAG

    val homeFragment = HomeFragment.newInstance()
    homeFragment.color = "Blue"
    val homeFragment2 = HomeFragment.newInstance()
    homeFragment2.color = "Yellow"
    val homeFragment3 = HomeFragment.newInstance()
    homeFragment3.color = "Cyan"
    val homeFragment4 = HomeFragment.newInstance()
    homeFragment4.color = "Black"
    val homeFragment5 = HomeFragment.newInstance()
    homeFragment5.color = "Magenta"

    println("homeFragment color: ${homeFragment.color}")
    println("homeFragment2 color: ${homeFragment2.color}")
    println("homeFragment3 color: ${homeFragment3.color}")
    println("homeFragment4 color: ${homeFragment4.color}")
    println("homeFragment5 color: ${homeFragment5.color}")
}

interface HomeFragmentPresenter {
    fun navigate()
}

class HomeFragment {
    var color = "Red"

    companion object : HomeFragmentPresenter, BankAccount2(214, 6041) {
        const val TAG: String = "HomeFragment"
        var homeFragment: HomeFragment? = null

        fun newInstance(): HomeFragment {
            homeFragment = HomeFragment()
            return homeFragment as HomeFragment
        }

        override fun navigate() {
            TODO("Not yet implemented")
        }
    }


//    fun newInstance(param: String): HomeFragment {
//        val args = Bundle()
//        param.putString("Key",param)
//        val fragment = HomeFragment()
//        fragment.arguments = args
//        return fragment
//    }
}
