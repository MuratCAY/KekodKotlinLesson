package basics

fun main() {
    /**
     * 2 tür tip dönüşümü varmış bunlar -> Implicit ve Explicit
     * Implicit ortulu, belirgin olmayan tip dönüşümü
     * Explicit ise tam tersi açık belirgin olan
     *
     *        Kotlinde Implicit tip dönüşümü yokmuş !
     */

    /**
     *      Tip donusumu icin kullanabileceginiz fonksiyonlar;
     *      toByte(), toShort(), toInt(), toLong(), toDouble(), toFloat(), toChar(), toString(),
     *      toUByte(), toUShort(), toUInt(), toULong(), toDuration(), toBigDecimal(), toBigInteger()
     * **/

    /**
     *      1-Numbers.kt dosyasinin icerisindeki degisken tiplerinin deger araliklarini inceleyiniz.
     *      Deger araligi kucuk olan tipler buyuk olan tiplere, sorunsuz, acik olarak(explicit) donusturulebilir.
     * **/
    val okulNo: Byte = 126.toByte()
    okulNo.extYazdir()

    val cevrilenDeger: Short = okulNo.toShort()
    println("cevrilen değer: $cevrilenDeger ")

    /**
     * tip dönüşümlerinde dikkatli olunmalı. Örneğin Long bir değeri int e dönüştüreceksek ve o değer inti aşıyorsa
     * hatalı sonuç alıcaksındır
     */
    val longBirDeger = 12354678921
    val donusturInte: Int = longBirDeger.toInt()
    println(donusturInte)
    // Hatalı çalıştı

    /**
     *      Kotlin'in sagladigi yukaridaki tip donusumlerinin yaninda, String to Number donusumler icin
     *      Java'dan asina oldugumuz tip donusumlerini de kullanabiliriz.
     *      Bunun icin ilgili tiplerin Java versionlarini kullanmalisiniz.
     *
     *      java.lang.Byte.parseByte(), java.lang.Short.parseShort(), java.lang.Int.parseInt(),
     *      java.lang.Long.parseLong(), java.lang.Double.parseDouble(), java.lang.Float.parseFloat(),
     *      java.lang.Byte.parseUByte(), java.lang.Short.parseUShort(), java.lang.Int.parseUInt(),
     *      java.lang.Long.parseULong(), java.lang.Double.parseUDouble(), java.lang.Float.parseUFloat()
     *  **/


    val byte: String = "3"
    val intValue = Integer.parseInt(byte)
    println("Değer ne: $intValue")


    val carp2Ext: Int = 12
    carp2Ext.carp2(3)

}

fun Int.carp2(sayi: Int) {
    println(this * sayi)
}

fun Byte.extYazdir() {
    println(this)
}
