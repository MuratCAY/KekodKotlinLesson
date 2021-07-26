package basics.controlflow

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
     * When switch caselerin yerine gelmiştir
     * when(karşılaştırılacak ifade)
     * value -> {}
     * value -> {}
     * else -> {}
     * formatıyla kullanılır.
     * Yine {} arasına tek satır kod yazılacaksa bu durumda {} leri kullanmayabiliriz
     * "tr", "az" gibi aynı kodu çalıştıracak case ler varsa virgül kullanarak yapabiliriz
     * or kullanımıda vardır.
     */

    print("Ülkenin kodunu girin: ")
    val countryCode = readLine()!!
//    when(countryCode.lowercase(Locale.getDefault())){
//        "tr","az" -> println("Türk Vatandaşı")
//        "fr" -> println("Fransa Vatandaşı")
//        "ar" -> println("Arab Vatandaşı")
//        "ru" -> println("Rus Vatandaşı")
//        "uk" -> println("İngiliz Vatandaşı")
//    }

//    when (countryCode.toInt()) {
//        3.and(5) -> println("Türk Vatandaşı")
//        1 or 2 -> println("Amerikan Vatandaşı")
//    }


    /**
     *  Whenin yanına karşılaştırma ifadesi eklemeden, caselerin yanınada ekleyebiliriz
     *  Bunun artısı && || and or xor gibi ifadeleride kullanabilmemizi sağlar
     */

    when {
        countryCode.toLowerCase() == "tr" && countryCode.toLowerCase() == "az" -> println("Azeri Vatandaşı")
        countryCode.toLowerCase() == "fr" -> println("Fransa Vatandaşı")
        countryCode.toLowerCase() == "ar" -> println("Arab Vatandaşı")
        countryCode.toLowerCase() == "ru" -> println("Rusya Vatandaşı")
        countryCode.toLowerCase() == "uk" -> println("İngiliz Vatandaşı")
    }

    if (countryCode.toLowerCase() == "tr" || countryCode.toLowerCase() == "az") {
        println("Türk Vatandaşı")
    } else if (countryCode.toLowerCase() == "fr") {
        println("Fransız Vatandaşı")
    } else if (countryCode.toLowerCase() == "ar") {
        println("Arab Vatandaşı")
    } else if (countryCode.toLowerCase() == "ru") {
        println("Rusya Vatandaşı")
    } else if (countryCode.toLowerCase() == "uk") {
        println("İngiliz Vatandaşı")
    } else {
        println("Ülke kodunu doğru bir şekilde yazınız!")
    }

    /**
     *  Expression kullanımını if elsede olduğu gibi when lerde de kullanabiliriz.
     */

    var countryCode2: String = if (countryCode.toLowerCase() == "tr" && countryCode.toLowerCase() == "az") {
        println("Türki Vatandaşı")
        "90"
    } else if (countryCode.toLowerCase() == "fr") {
        println("Fransız")
        "80"
    } else if (countryCode.toLowerCase() == "ar") {
        println("Arab Vatandaşı")
        "70"
    } else if (countryCode.toLowerCase() == "ru") {
        println("Rus")
        "60"
    } else if (countryCode.toLowerCase() == "uk") {
        println("İngiliz")
        "50"
    } else {
        "30"
    }

    countryCode2 = when (countryCode.toLowerCase()) {
        "tr", "az" -> {
            println("TÜRK")
            "90"
        }
        "fr" -> {
            println("Frans")
            "80"
        }
        "ar" -> {
            println("Arab")
            "70"
        }
        "ru" -> {
            println("Rus")
            "60"
        }
        "uk" -> {
            println("İng")
            "50"
        }
        else -> {
            println("Doğru kod girin")
            "40"
        }
    }

    // Karşılaştırılacak değer değer yerine değişken de olabilirmiş. örnek ->
    val trCode = "tr"
    val arCode = "ar"
    val frCode = "fr"
    val ruCode = "ru"
    val ukCode = "uk"
    when (countryCode.toLowerCase()) {
        trCode, "az" -> println("Tc Vatandaşı")
        arCode -> println("Arab Vatandaşı")
        frCode -> println("Fransa Vatandaşı")
        ruCode -> println("Rus Vatandaşı")
        ukCode -> println("İngiliz Vatandaşı")
    }

    /**
     * is !is ile bir class ın referansı olunup olunmadığı kontrolu yapılabilir
     */

    val value: Long = 213646846456
    when (value) {
        is Long -> {
            println("Long bir değer")
        }
        !is Long -> {
            println("Long bir değer")
        }
    }

    /**
     * range lerin in !in şeklinde kontrolü yapılabilir
     */
    val number = 3
    when (number) {
        in 0..10 -> {
            println("Long Value")
        }
        in 11..20 -> {
            println("Long Value")
        }
        !in 21..30 -> {
            println("Long Value")
        }
    }

    // Tekrar Ettim.

}
