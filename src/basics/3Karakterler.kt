package basics

// Code with ❤️
//┌────────────────────────────┐
//│ Created by Murat ÇAY       │
//│ MuratTheBestOf@gmail.com   │
//│ ────────────────────────── │ 
//│ 5.07.2021                  │ 
//└────────────────────────────┘

fun main() {

    /**
     * Number değer olan bir char değişkeni inte çevrilirken gerçek sayı değerini almaz
     * alacağı değer ASCII tablosounda kkarşılık gelen değer olur
     */

    val charNumber : Char = '6'
    val convertedCharNumber = charNumber.code
    println("charNumber : $charNumber")
    println("convertedCharNumber : $convertedCharNumber")
    val totalNumber = charNumber.code + convertedCharNumber
    println("totalNumber : $totalNumber")

    /**
     *      Kacis(Escape) karakterlerini de tanimlamak icin kullanilabilir.
     * **/

    val escapeCharT: Char = '\t' // tab birakmak icin.
    val escapeCharN: Char = '\n' // alt satir icin.
    val escapeCharB: Char = '\b' // backspace icin
    val escapeCharR: Char = '\r' // satir basi
    val escapeChar1: Char = '\'' // ' ozel karakterini kullanmak icin.
    val escapeChar2: Char = '\"' // " ozel karakterini kullanmak icin
    val escapeCharSlash: Char = '\\' // \ ozel karakterini kullanmak icin
    val escapeCharDolar: Char = '\$' // $ ozel karakterini kullanmak icin

    val escape = "escapeCharT $escapeCharT, escapeCharN $escapeCharN, escapeCharB $escapeCharB, escapeCharR $escapeCharR, escapeChar1 $escapeChar1, escapeChar2 $escapeChar2, escapeCharSplash $escapeCharSlash, escapeCharDolar $escapeCharDolar"
    println(escape)

    /**
     *      Unicode karakterlerini de tanimlamak icin kullanilabilir.
     * **/
    val uniCode = '\uFF00'

    println("uniCode $uniCode")


    //Tekrar Edildi!
}
