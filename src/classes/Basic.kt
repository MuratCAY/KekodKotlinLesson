package classes

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 13.07.2021                 │ 
//   └────────────────────────────┘
fun main() {
    var sandalye1 = Sandalye()
    sandalye1.bacakSayisi = 4
    sandalye1.model = "Model 1"

    println(sandalye1.bacakSayisi)
    println(sandalye1.model)

    val address: String? = null
    val amount:Double? = 10.0
    val list : List<String?>? = listOf(null,null)
    list?.size
}

class Sandalye {
    var bacakSayisi: Int = 0
    var model: String = ""
}
