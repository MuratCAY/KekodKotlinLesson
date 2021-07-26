package basics

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 7.07.2021                  │ 
//   └────────────────────────────┘

fun main() {
    /**
     *  bir değişkene null atamak için tipine ? eklemeliyiz
     *  eğer bir değişkene tip vermeden null verilirse, IDE tip çıkarımı yapar ve Nothing? değerini verir
     *  çünkü hangi tipe karşılık geldiğini bilemez
     */

    val name: String? = null
    val number = null

    var number1: Int? = null
    var number2: Int? = null


    var result: Int? = 0
    result!!.plus(52)
    result?.plus(90)

    /**
     *  Biz eğer null değişkeni kullanacak isek !! ya da ?. ile kullanmamız gerekicek.
     *  !! işaretini debug modda kullanmak kotlin null pointer exception hatası almamızı sağlar ve bu sayede hatamızı
     *  daha rahat görebiliriz ama canlıda !! kullanmamalıyız uygulama crash olur. Onun yerine ?. kullanmalıyız
     */

    print("Birinci Değeri girin: ")
    number1 = readLine()!!.toInt()
    print("İkinci Değeri girin: ")
    number2 = readLine()!!.toInt()

    // yukarida readline()'nin null olamayacagini !! isaretleriyle soyledigimiz icin alt satirda tekrar nullable kontrolu
    // yapmamiza gerek kalmiyor. (smart cast ozelligi)

    result = number1 + number2
    println("Toplam: $result")


    // nullable kontrolunu boyle yapiyorsaniz halen keko bir yazilimcisinizdir.
    if (number1 != null && number2 != null) {
        result = number1 + number2
    }


    //Tekrar Edildi !
}
