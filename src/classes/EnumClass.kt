package classes

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 24.07.2021                 │ 
//   └────────────────────────────┘

/**
 * Kullanım amacı aynı veri kümelerinin gruplanabilir olmasını sağlar
 * Opsiyonlarının tamamının neler olduğunu rahatça görebilmemizi sağlar
 *
 * abstract, open, inner, sealed olamazlar
 * yapısı gereği zaten final dırlar. final keyword u kullanmak redundant uyarısı verir
 *
 * özünde class oldukları için, constructor kullanabilirler ve bu constructor içerisinde veri tutabilirler
 *
 * Enum class ların nesnesi oluşturulamaz
 *
 * java karşılığında bu enum sabitleri static final class lar şeklinde tutulurlar. Bu sayede, kullanırken bu sabitlerin
 * nesnesini oluşturmak zorunda kalmayız
 *
 * Her enum sabiti final name:String ve final ordinal: Int değişkenlere default olarak sahiptir.
 *  name ifadesi, enum ın kendisinin string halini verir.
 *  ordinal ifadesi, enum' daki sabitin index ini verir ve 0 dan başlar
 *  bu değişkenler final oldukları için, enum sabitleri içerisinde override edilemezler.
 *
 *  enum class lar herhangi bir class ı miras alamazlar
 *  enum class lar herhangi bir interface i implement edebilirler
 *
 *  enum class lar abstract property ler ya da abstract func. lar alabilirler. Bunları aldıklarında tüm sabitler
 *  bu abstract yapıları override etmek zorundadır.
 *
 *  bir open function da yazılabilir open olmasından dolayı override etme zorunluluğu yoktur. Ancak open
 *  olarak belirtilen func. un body si olmak zorundadır.
 */

interface TeamsFunctionality {
    fun practice()
}

enum class Teams(val starCount: Int) : TeamsFunctionality {
    Galatasaray(4) {
        override fun practice() {
            TODO("Not yet implemented")
        }
    },
    Fenerbahçe(3) {
        override fun practice() {
            TODO("Not yet implemented")
        }
    },
    Beşiktaş(3) {
        override fun practice() {
            TODO("Not yet implemented")
        }
    },
    Trabzonspor(1) {  //Sabitler
        override fun practice() {
            TODO("Not yet implemented")
        }
    }
}

enum class DaysOfWeek(val dayNumber: Int) {
    Pazartesi(1) {
        override fun toString(): String {
            return "PAZARTESİ"
        }
    },
    Salı(2) {
        override fun toString(): String {
            return "SALI"
        }
    },
    Çarşamba(3) {
        override fun toString(): String {
            return "ÇARŞAMBA"
        }
    },
    Perşembe(4) {
        override fun toString(): String {
            return "PERŞEMBE"
        }
    },
    Cuma(5) {
        override fun toString(): String {
            return "CUMA"
        }
    },
    Cumartesi(6) {
        override fun toString(): String {
            return "CUMARTESİ"
        }
    },
    Pazar(7) {
        override fun toString(): String {
            return "PAZAR"
        }
    }
}

enum class Sex {
    Male {
        override val typeCount: Int
            get() = TODO("Not yet implemented")

        override fun isOptional() {
            TODO("Not yet implemented")
        }
    },
    Female {
        override val typeCount: Int
            get() = TODO("Not yet implemented")

        override fun isOptional() {
            TODO("Not yet implemented")
        }
    },
    Other {
        override val typeCount: Int
            get() = TODO("Not yet implemented")

        override fun isOptional() {
            TODO("Not yet implemented")
        }
    };

    abstract val typeCount: Int
    abstract fun isOptional()
    open fun log() {}
}

fun main() {
    val gs = "Galatasaray"
    val bjk = "Beşiktaş"
    val fb = "Fenerbahçe"
    val ts = "Trabzonspor"
// Bunu yapmak yerine yukarıdaqki gibi enum class oluşturmalısın

//    val pzrts = "Pazartesi"
//    val sal = "Salı"
//    val carsmb = "Çarşamba"
//    Bunun gibi olanlarıda enum class larla yapabilirsin

    println("4 takımdan birini yazınız : ")
    val team: String = readLine()!!
    val starCount = when {
        team == fb -> {
            3
        }
        team == gs -> {
            4
        }
        team == bjk -> {
            3
        }
        team == ts -> {
            1
        }
        else -> {
            -1
        }
    }

    val starCount2 = when (team) {
        Teams.Fenerbahçe.toString() -> {
            Teams.Fenerbahçe.starCount
        }
        Teams.Galatasaray.toString() -> {
            Teams.Galatasaray.starCount
        }
        Teams.Beşiktaş.toString() -> {
            Teams.Beşiktaş.starCount
        }
        Teams.Trabzonspor.toString() -> {
            Teams.Trabzonspor.starCount
        }
        else -> {
            -1
        }
    }

    println(DaysOfWeek.Çarşamba.toString())
    println(DaysOfWeek.Çarşamba.name)
    println(DaysOfWeek.Çarşamba.ordinal)
    println(DaysOfWeek.Çarşamba.dayNumber)

}