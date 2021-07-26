package classes

import kotlin.reflect.jvm.internal.impl.incremental.components.Position

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 18.07.2021                  │ 
//   └────────────────────────────┘
/**
 * Interface lerin Abstract classlardan en büyük farkı state tutamıyor olmaları.
 */
interface MyInterface {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"


    fun bar()
    fun foo() {
        // optional body
        print(prop)
    }
}

/**
 * Bir sınıf abstract ise interface i implement ettikten sonra bu interface in
 * fonksiyonlarını override etmek zorunda kalmıyor.
 *
 * Bir interface içerisinde fonksiyonlardan body si olanlar override edilmek zorunda değildir
 * Body si olmayan tüm fonksiyonlar ise class a implement edildiğinde override edilmek zorunda
 *
 * Property(field) de interfacelere tanımlanabilir
 * Propertylerden değer ataması yapılmamış olanlar zorunlu olarak ta override edilebilir
 * eğer property initial değeri aldıysa, override etme zorunluluğu kalkar.
 *
 * Interface içerisinde tanımlı ve override edilme zorunluluğu olan propertyler(field)
 * primary constructor içerisinde de override edilebilir
 *
 * Body si olan (override edilme zorunluluğu olmayan) bir interface fonksiyonu override edilirse,
 * override edildiği yerde body si içerisinden super i çağırılabilir(çağırmak zorunda değilsiniz.
 */
class Child(override val prop: Int = 29) : MyInterface {

    override fun bar() {}

    // override edilmesi zorunlu değildi.
    override val propertyWithImplementation: String
        get() = super.propertyWithImplementation

}

/**
 * interfacelere tanımlanan propertylerde(field) initial değer alma zorunluluğu yoktur. yani
 * val name: String bu satırda = diyip " " birşeyler yazmamız gerekiyordu.
 */
interface Named {
    val fullName: String
}

interface Person : Named {
    val firstName: String
    val lastName: String

    override val fullName: String
        get() = "$firstName $lastName"
}

/**
 * Eğer implement edilen interface, başka bir interface i implement ediyorsa
 * ve bu interface in üyeleri child interface de override edilmiş ise ,
 * Child interface i implement eden class da override edilme zorunluluğu kalkar
 */
data class Employee(
    override val firstName: String,
    override val lastName: String,
    override val fullName: String, // zorunlu değil
    val position: Position,
) : Person


interface A {
    fun foo() {
        print("A")
    }

    fun bar()
}

interface B {
    fun foo() {
        print("B")
    }

    fun bar() {
        print("Bar")
    }
}

class M : A {
    override fun bar() {
        print("Bar")
    }
}

/**
 * Birden fazla interface bir class a tatanımlanabilir
 * Birden fazla interface bir class a tanımlanırken aralarına virgül koyulur
 *
 *  : işaretinden sonra eklenen yapıların hangilerinin class(inheritance) hangilerinin interface (implementation)
 *  olduğunu karıştırmamak için bu yapıların sonuna bakmanız lazım. Sonunda () parantezlerini görüyorsanız
 *  : ' dan sonra gelen yapı class(inheritance)dır, miras alma işlemi yapılıyordur. () yoksa interface(implementation)
 *  dır, implementation işlemi yapılıyordur.
 */

open class E() {}

/**
 * 2 farklı interface in aynı fonksiyonları olması durumuda, bu fonksiyonların override edilmesi sırasında aynı
 * fonksiyonu 2 kere yazarak override edemeyiz
 */
class D : E(), A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        //  super<A>.bar() A interface inin bar fonksiyonunun body si yok. Dolayısıyla super ile erişilemez
        super<B>.bar() // <B> arayüzü yazmak zorunda kalmıyorsunuz. Buna reduntant uyarısı verilir.
    }
}



