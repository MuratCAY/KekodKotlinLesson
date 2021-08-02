package classes

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 26.07.2021                 │ 
//   └────────────────────────────┘

/**
 * Nested class'lar outer class'ın üye property' lerine ya da fonksiyonlarına erişemezler.
 * Nested class lar static olarak saklanırlar.Bundan dolayıda outer class ı üzerinden Nested class a erişmek
 * istemeniz durumunda Outer.NestedClass() şeklinde erişebilirsiniz
 *
 * Inner class lar static olarak tutulmazlar. Bundan dolayı erişim yapmak istediğimizde Outer().InnerClass()
 * şeklinde outer class ' ı da instance' ını oluşturmamız gerekmektedir. Bundan dolayı inner class outer class ın
 * tüm elemanlarına erişebilir. private olsa dahi
 *
 * Inner class ' ın içerisine yeni bir nested class eklenmektedir ama yeni bir inner class ekleyebilirsiniz
 *
 * Nested class ın içerisine ise bir nested ya da inner fark etmeksizin class ekleyebilirsiniz.
 */

fun main() {
    Outer1.NestedClass().printName()
    Outer2().NestedClass2().printName2()
}

interface OuterInterface {
    class DenemeA
    interface NestedInterface
}

class Outer1 {
    private val name = "Murat"
    val surName = "Çay"

    fun getage() = 21

    class NestedClass {
        fun printName() {
            //name
            //surname
            //getage()
        }
    }
}

class Outer2 {
    private val name2 = "Murat"
    val surName2 = "Çay"

    fun getage2() = 21

    inner class NestedClass2 {
        fun printName2() {
            name2
            surName2
            getage2()
        }
    }
}


















