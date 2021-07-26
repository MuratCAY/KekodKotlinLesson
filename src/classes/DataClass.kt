package classes

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 22.07.2021                 │ 
//   └────────────────────────────┘

fun main() {
    val newsOne: NewsData = NewsData(
        "Eğitim öğretim yılı başladı",
        "Eğitim öğretim yılı yeni bir şekilde başladı.",
        true,
        arrayListOf()
    )
    val newsTwo: News = News(
        "Eğitim öğretim yılı başladı",
        "Eğitim öğretim yılı yeni bir şekilde başladı.",
        true,
        arrayListOf()
    )

//    newsOne.equals()
    newsOne.toString()
    newsOne.hashCode()
    val newsThree = newsOne.copy(description = "Farklı değer")
//    newsOne.copy()
    newsOne.component1()

    //    newsTwo.equals()
    newsTwo.toString()
    newsTwo.hashCode()
//    newsTwo.copy()
// newsTwo.component1()

    println("Data Class toString: $newsOne")
    println("Class toString: $newsTwo")

    val pair = Pair("Gökhan", "Öztürk").second
    val triple = Triple("Murat", "Çay", 21).third

    val (title, description, hasMediaContent, mediaList) = newsOne
}

/**
 * Data class lar en az bir parametre almak zorunda
 * Parametreler mutlaka val yada var alma zorunda
 *
 * open, abstract, sealded, inner class yapılamıyor
 * Tüm data class ları final olduğu için final modifier ı redundant uyarısı verir.
 *
 * Data class ı oluştuduğumuzda arka planda equals, hashCode, toString, copy, componentN fonksiyonları default
 * olarak oluşturulurlar.
 *
 * Yukarıda ki fonksiyonlardan biri override edilirse, oto generate edilen hali yazılmaz.
 *
 * Yukarıdaki fonksiyonlar sadece primary const. içerisindeki değişkenlerle çalışır.
 *
 * componentN gibi classlar  sebebiyle Destructuring declarations olarak data class lar set edebiliyorlar.
 *
 * Pair, Triple ozelleştirilmiş generic data class lar mevcut
 *
 * toString gibi fonksiyonlarda primary const. değişkenleri kullanıldığı için val yada var yazılmak zorunda.
 *
 *
 */
data class NewsData(
    val title: String,
    val description: String,
    val hasMediaContent: Boolean,
    val mediaList: ArrayList<Any>
) {
    val relatedNewsList: List<NewsData> = arrayListOf()
}

class News(
    val title: String = "title",
    val description: String,
    val hasMediaContent: Boolean,
    val mediaList: ArrayList<Any>
) {
    override fun toString(): String {
        return "News (title= " + this.title + ", description= " + this.description + ", hasMediaContent= " +
                this.hasMediaContent + ", mediaList= " + this.mediaList + ")"
    }

    fun copy(): News {
        return News(title, description, hasMediaContent, mediaList)
    }
}


class Media