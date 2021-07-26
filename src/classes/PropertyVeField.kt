package classes

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 19.07.2021                 │ 
//   └────────────────────────────┘

fun main() {
    val u1 = User(1, "Murat", 20)
    u1.name = "Ali"
    println(u1.name)

    val u2 = User(-2, "Eda", 22)
    println(u2.name)
    u2.age = -18
    println(u2.age)


}

class User(_id: Int, _name: String, _age: Int) {

    var id: Int = _id

    var name: String = _name
        get() {
            return field.uppercase().plus(4)
        }

    var age: Int = _age
        set(value) {
            field = if (value > 18) {
                value
            } else {
                throw IllegalArgumentException("0 yaşından küçüktür")
            }
        }
}