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
 * Sınırlı kümede, gruplanabilir, class lar yazmayı sağlar.
 * Bu class lar arka planda static olarak tutulmazlar. Enumaration lardan en büyük farkı budur.
 * Enum lar verileri gruplarken, sealed class lar class ları gruplar.
 *
 * Sealed class lar abstract class lardır aynı zamanda. Abstract oldukları için open olmazlar.
 * Sealed class lar Abstract class oldukları için final olamazlar. Anlamsal olarak zaten saçmadır.
 *
 * Sealed class ların nesnesi oluşturulamaz. Constructor ları private ve protected olarak bulunur.
 *
 * Sealed class ları miras alan subclass lar final oldukları için miras alınamazlar. SDK ler için önemlidir.
 *
 * Sealed class ın subclasslarının(alt classlar) neler olduğu compiletime da bilinmektedir. Bundan dolayı when ve
 * if te else case lerein yazımına ihtiyaç duymazlar.
 *
 * Sealed class ları extend alan subclass lar eskiden aynı dosya üzerinde bulunma zorunluluğu vardı.
 * Bu zorunluluk esnetilerek aynı package içerisinde olmaya kadar genişletildi. Ancak aynı package dışına çıkıp, bir
 * sub class a sealed class ı miras olarak vermek isterseniz buna izin verilmeyecek. Özellikle sdk yazarken
 * bu konu önemli.
 *
 * Sealed class ların içine object tanımlamalarıda yapabiliriz
 * sealed class ların içine sadec object tanımlamaları yapıyorsanız, bu kullanımın enumarationdan teknik olarak hiçbir
 * farkı yoktur.
 */

sealed class Response
class Succes : Response()
class Error : Response()

fun handle(response: Response) {
    when (response) {
        is Succes -> {
            // response dan gelen bilgilerin ui yini döndürür.
        }
        is Error -> {
            // pop-up ile kullanıcıya bilgi ver.
        }
    }
}

// bu yanlıştır. Enum kullanmamız gerek
sealed class PaymentOption {
    object Cash
    object Card
    object Transfer
}

enum class PaymentOption2 {
    Cash, Card, Transfer
}

fun main() {
//    val response = Response()
    val succes = Succes()
    val error = Error()
}
