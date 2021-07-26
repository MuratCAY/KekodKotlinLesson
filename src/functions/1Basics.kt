package functions

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 11.07.2021                  │ 
//   └────────────────────────────┘

fun main() {
    /**
     * Geri dönüş değeri verilmeyen fonksiyonlar Unit tipini geri döndürür
     * Fonksiyon çağırılırken ismi ve parametreleri kullanılır
     * Eğer bir geri dönüşü varsa bir değişkene atanabilir
     */

    val result = takeSquare2(3)
    println(result)

    //Bir class ın fonksiyonu nu çağırırken ise nokta işaretini kullanırız.
    val powDeneme = Math.pow(2.0, 3.0)
    println(powDeneme)

    /**
     * Default değeri olan parametrelere sahip bir fonksiyon çağırılırken, default değere atama yapmak şart değildir
     * Default değerlere default olarak değer atarsan sırası değişir
     * Ide ye hangi parametreye değer olarak atadığımızı söylemek için Named Argumentleri kullanmamız gerekir
     */
    reformatMessage2("Message", true, 24, "az")
    reformatMessage2(message = "Message", size = 54, lang = "tr")
    reformatMessage2("Message", false, 45)
    reformatMessage2("Message", size = 7)

    getUserInfoBen("Murat","Çay","2078","İstanbul","Sultangazi",key = 3)

}

fun takeSquare2(number: Int): Int {
    return 2 * number
}

/**
 * = ile default değer verebiliriz buna (Default Argument) denir
 * default değer ataması yapmak function overload işlemi yapmamızı sağlar ve tekrar tekrar aynı fonksiyonun farklı
 * varyasyonlarını yazmak zorunda kalmayız
 */
fun reformatMessage2(message: String, isUpperCase: Boolean = false, size: Int, lang: String = "tr") {
    println("Message: $message isUpperCase: $isUpperCase size: $size lang: $lang")
}

/**
 * Çok uzun sayıda parametremiz var ise "variable number of arguments" = vararg kullanabiliriz
 * Vararg ile bir fonksiyon tek bir parametre alıyor gibi gözükürken kendisine çok miktarda değişken atanabilir
 * Bu değişkenlere arraylere erişebilir gibi erişebiliriz. [index] ya da .get(index) şeklinde
 * vararg tek ya da son parametre olarak yazılırsa, Jvm'e hazırlanırken Java'da ki "String..." gibi aynı kod derlenir
 * Ancak vararg param birden fazla derlenirken ortada yada başta yer alırsa, Jvm e hazırlanırken, Array e dönüştürülür
 * Bu da performans farkı oluşturur
 */

fun getUserInfoBen(vararg userInfo:String, key:Int){
    userInfo[3]
    userInfo.get(3)
    userInfo.forEach {
        println(it)
    }
}
fun getUserInfoBen2(vararg userInfo: String){
    userInfo[3]
    userInfo.get(3)
}
fun getUserInfoBen3(vararg userInfo: Any){
    userInfo[3]
    userInfo.get(3)
}
/**
 *      Ayni fonksiyon icersinde birden fazla vararg tanimi yapilmasina izin verilmez.
 *      Calismaz. Comment'i kaldir kontrol et istersen keko
 * **/
//fun getUserInfo(vararg userInfo: String, vararg userInfo2: String) {
//    userInfo[3]
//}


