package basics

fun main() {

    /**
     *     Byte değer aralığı -128 ile 127 arasındaymış ve Byte bellekte 8 bitlik alan tutuyormuş.
     *     Short ise bellekte 16bit tutyor ve değer aralığı -32 768 ile 32 767 arasında.
     *     Int 32 bit yer tutar ve değer aralığı  -2,147,483,648 (-2^31) ile 2,147,483,647 (2^31 - 1) arasında
     *     Long ise 64 bitlik yer tutar  -9,223,372,036,854,775,808 (-2^63) ile 9,223,372,036,854,775,807 (2^63 - 1) arasında
     */

    /**
     *      Type    |   Size (bits) |   Significant bits    |   Exponent bits   |   Decimal digits
     *      --------------------------------------------------------------------------------------
     *      Float   |       32      |           24          |       8           |       6-7
     *      Double  |       64      |           53          |       11          |       15-16
     */

    /**
     * tip çıkarımı demek = type infrence
     */

    val minByteValue: Byte = Byte.MIN_VALUE
    println("Byte en küçük değeri: $minByteValue")
    val maxByteValue: Byte = Byte.MAX_VALUE
    println("Byte en büyük değeri: $maxByteValue")

    val shortMinValue: Short = Short.MIN_VALUE
    println("Short 'un en küçük değeri: $shortMinValue")
    val shortMaxValue: Short = Short.MAX_VALUE
    println("Short 'un en büyük değeri: $shortMaxValue")

    val intMinValue: Int = Int.MIN_VALUE
    println("Int 'in en küçük değeri: $intMinValue")
    val intMaxValue: Int = Int.MAX_VALUE
    println("Int 'in  en büyük değeri: $intMaxValue")

    val longMinValue: Long = Long.MIN_VALUE
    println("Long 'un en küçük değeri: $longMinValue")
    val longMaxValue: Long = Long.MAX_VALUE
    println("Long 'un en büyük değeri: $longMaxValue")

    /**
     * Long da değikenin sonuna L konulabilir
     * Float da ise F ve f kullanılabilir
     */
    val longNumber = 1586L
    val floatNumber1 = 19.90F
    val floatNumber2 = 13f
    val doubleNumber = 3.14
    val doubleNumber2 = 3.14e10
    val decimalNumber = 1907
//    val octalNumber = 0197    // Calismaz. Comment'i kaldir kontrol et istersen keko
    val hexadecimalNumber = 0x759
    val binaryNumber = 0b01000011


    /**
     *      Boxed   : Degiskenin obje referansi olarak tutulmasidir.
     *      UnBoxed : Degiskenin primitive olarak tutulmasidir.
     *     ===  operatoru degiskenlerin referansını karsilastirirken kullanilir.
     *     ==   operatoru degiskenlerin degerini karsilastirirken kullanilir.
     */

    /**
     *      Backend'ten donen Double ve Float degiskenleri kullanirken dikkatli olmaniz gerekiyor.
     *      Eger backend'ten donen deger uzerinde "." isaretine gore bir split isi yapacaksaniz basiniz agriyabilir.
     *      Cunku backend'ten donen Double ve Float degiskenleri her zaman "." ile ayrismiyor olabilir.
     *      Database dilinin farkli olmasina gore (turkce-ingilizce gibi) "." yerine "," ile de ayrisiyor olabilir.
     */

    // Tekrar Ettim.

    carp(5)

    6 extIntPrint 7
    5.extPrint(6)
    val number: Int = 32




}


infix fun Int.extIntPrint(number: Int) {
    println(this * number)
}

fun carp(sayi: Int): Int {
    return 3 * sayi
}

fun Int.extPrint(sayi: Int) {
    println(this * sayi)
}




