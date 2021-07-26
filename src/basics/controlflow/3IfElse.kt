package basics.controlflow

import java.io.IOException

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 8.07.2021                  │ 
//   └────────────────────────────┘

fun main() {
    /**
     *  If else case lerinin 2 kullanımı vardır. State ve Expression olarak.
     *  State kullanımı if else kullanarak şartlı durumlarımızı kodlamaktır
     *  Expression kullanımı ise bir value nun eşitliğine if else yazmak
     *  Expression da if else caselerin son satırı value olarak tanımlanır
     */

    println("Öğrenci misin?")
    val answer = readLine()
    if (answer!!.contains("Evet", ignoreCase = true)) {
        println("Öğrencisiniz.")
    } else {
        println("Öğrenci değilsiniz")
    }
    println("**************************************")


    //Expression kullanımı. {} içerisinde ki son satır, değer olarak değişkene atanır.
    val result: String = if (answer == "Evet") {
        "Öğrenci"
    } else {
        "Öğrenci Değil"
    }
    println(result)
    println("**************************************")

    /**
     *      Kotlin'de if else'lerin Expression kullanimindan oturu ternary operatoru yoktur.
     *      Ternary yerine asagidaki gibi kullanim yapabilirsiniz.
     * **/
    val isStudent = false
    val isStudent2 = if (isStudent) {
        "true"
    } else {
        "false"
    }
//    String name2 = isStudent ? "true" : "false" ternary operator


    print("Notunuzu giriniz: ")
    val grade = readLine()!!.toDouble()
    if (grade <= 100 && grade >= 85) {
        println("AA")
    } else if (grade < 85 && grade >= 70) {
        println("BB")
    } else if (grade < 70 && grade >= 55) {
        println("CC")
    } else if (grade < 55 && grade >= 40) {
        println("DD")
    } else {
        println("Sen okulu bırak bence :)")
    }

//    true && true = true
//    true && false = false
//    false && true = false
//    false && false = false
//
//    true || true = true
//    true ||false = true
//    false || true = true
//    false ||false = false

    /**
     * 2 farklı number değişkeni  karşılaştırırken equals fonksiyonu once tiplerini karşılaştırdığı için eğer
     * tipler uyuşmuyorsa hata verecektir
     */
//    if(10 == 10L){    // Calismaz. Comment'i kaldir kontrol et istersen keko

    /**
     *      Birden fazla sartli durumunuz varsa bunlarin her birini, asagidaki gibi, ayri ayri if seklinde yazmak
     *      if else seklinde yazmaktan daha kotu performans almaniza yol acar. Zira if else durumlarinda dogru case
     *      bulunursa, diger case'ler kontrol edilmez. Ancak asagidaki durumda dogru case bulunsa bile tum case'ler
     *      kontrol edilir.
     * **/
    if (grade <= 100) {
    }
    if (grade >= 85) {
    }
    if (grade <= 84) {
    }
    if (grade >= 70) {
    }
    if (grade <= 69) {
    }
    if (grade >= 55) {
    }


    /**
     * Bazi durumlarda if else yazmaktansa, if case'ini yazip return ya da throw gibi kodun devam etmesini bozacak
     * ifadelerle kodu sonlandirabilirsiniz. Kod calisirken bu if case'ine girmezse devam eden kod blogu calisir ki
     * bu da pratikte else case'i demek olur. Bu sekilde yazim kodu biraz daha temiz gosterecektir.
     * **/
    if (isStudent) {
        println("Student")
    } else {
        otherMethod()
    }

    if (isStudent) {
        println("Student")
        throw IOException()
//        return
    }

    otherMethod()
}

private fun otherMethod() {

}