package basics

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 5.07.2021                  │ 
//   └────────────────────────────┘

fun main() {
    val name = "MuratÇay"
    for (char in name){
        println(char)
    }
    name.stringYazdir()
    println("\n*****************************************\n")

    val angryMurat = "Murat is Angry"
    val firstCharOfMurat = angryMurat[angryMurat.indices.first]
    val secondCharOfMurat = angryMurat[angryMurat.indices.last]

    println(firstCharOfMurat)
    println(secondCharOfMurat)



    /**
     *      Farkli tipteki bir degiskenin onune String bir degisken ya da ifade koyarak toplarsaniz, sonuc String olacaktir.
     *      Ancak String bir degisken ya da ifadenin sonuna, + operatoru ile, farkli tipte bir degisken eklerseniz, kod calismaz.
     * **/
    val numbersValue: String = "value" + (4 + 2 + 8)
//    val numbersValue2: String = (4 + 2 + 8) + "value" // Calismaz. Comment'i kaldir kontrol et istersen keko

    println("numbersValue $numbersValue")

    /**
     *      3 tane cift tirnak kullanarak Raw String olusturulabilir.
     *      Raw String'ler ide'ye nasil yaziliyorsa oyle kullanilir. Hizalamada bozulma olmaz.
     *      trimIndent() fonksiyonu ile bu Raw String'in kenar bosluklarini silebilirsiniz.
     *      Bu silme islemini yaparken tum satirlardaki en soldaki karakteri baz alarak silme islemini saglar.
     *      Alttaki ornek icin 3 satirdan da $ isaretinin solundaki bosluga kadarini siler.
     *      Raw Stringlerin icinde escape karakterler calismaz.
     * **/
    val rawPineTree = """
                *
     $         ***
              *****
    """.trimIndent()
    rawPineTree.stringYazdir()

    /**
     *      trimMargin(marginPrefix) ise verilen karakter ne ise, string satirlarindaki o karaktere kadar olan kismi siler.
     *      Yukaridan farkli olarak bu karakter tek bir satirda ise, sadece o satirin, o karaktere kadar olan kismi silinir.
     *      trimMargin() ise karaktere bakmadan tum satirlarin en solundaki degeri baz alip,
     *      tum satirlardan o degerin solundaki bosluk kadar bosluk siler.
     * **/

    println("*********************************")


    val rawPineTree2 = """
     $          *
     $         ***
     $        *****
    """.trimMargin("$")
    rawPineTree2.stringYazdir()

}
fun String.stringYazdir(){
    println(this)
}