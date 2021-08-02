package classes


// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 26.07.2021                 │ 
//   └────────────────────────────┘

open class BankAccount2(val balance: Long, val accountNumber: Long) {
    val branchCode: Long = 32564
}

interface Print {
    fun printBalance()
}

@JvmInline
value class BankAccount3(val balance: Int) : Print {
    init {
        print("Balance: $balance")
    }

    //    val accountNumber:Long = 132645645
    val accountNumber: Long
        get() {
            return 1231241421
        }

    //yukarıdaki accountNumber ile aşağıdaki accountNumber2() fonksiyonu ikide aynı şey@

    fun accountNumber2(): Long {
        return 131231241
    }

    override fun printBalance() {
        print("Interface Balance: $balance")
    }
}

/**
 * value class lar @JvmInline anotation olmadan henuz kullanılamıyorlar.
 *
 * value class lar şuan için sadece tek bir değişken kabul etmektedir. Birden fazla değişkene izin verilmiyor
 * ancak value class ların dökümantasyonunda inline class ların ileride birden fazla değişken olabilmesine
 * izin verileceği yazılıyor.
 *
 * inline class lar ile init bloğu kullanılabilir.
 *
 * inline class ların belirtilen constructor ları java kodunda private olarak bulunurlar. Bundan dolayı zaten istesek
 * de bu constructorlar la nesne oluşturamayız. Ama bunu yapabiliyor gibi görünmemizin sebebi, gerçekte o nesnenin
 * hiç yaratılmıyor oluşu sebebiyle. Bizim nesne oluştururken gördüğümüz şey aslında const. içindeki değişkenin
 * kendisi.
 *
 * Inline class lar içinde property tanımlamasına izin verir. Ancak property nin backng field ı olamaz.
 *
 * Inline  class lar herhangi bir interface i implement edebilirler.
 *
 * Inline class lar final alınamaz. Çünkü default olarak finaldırlar ve değiştirilemezlerdir. Open keyword' uyle
 * beraber kullanılamaz. final keyword ü vermekte redundant uyarısı verir.
 *
 * abstract keyword u ile de kullanılamaz.
 */

interface I

@JvmInline
value class Foo2(val i: Int) : I

fun asInline(f: Foo2) {}
fun <T> asGeneric(x: T) {}
fun asInterface(i: I) {}
fun asNullable(i: Foo2) {}

fun <T> id(x: T): T = x

fun main() {
    val balance2 = BankAccount2(25000, 17000)
    val balance3 = BankAccount3(25000)

    val f: Foo2 = Foo2(42) // f' in tipi int -> primitive -> unboxed

    asInline(f)    // unboxed: used as Foo2 itself
    asGeneric(f)   // boxed: used as generic type T
    asInterface(f) // boxed: used as type I
    asNullable(f)  // boxed: used as Foo2?, which is different from Foo2

    // below, 'f' first is boxed (while being passed to 'id') and then unboxed (when returned from 'id')
    // In the end, 'c' contains unboxed representation (just '42'), as 'f'
    val c = id(f)
}
