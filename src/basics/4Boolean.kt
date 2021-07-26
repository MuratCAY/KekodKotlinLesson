package basics

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 5.07.2021                  │ 
//   └────────────────────────────┘

fun main() {

    val isStudent: Boolean = true
    val isTeacher: Boolean = false

//  val isStudent2: Boolean = 1 değildir yani 1 i eşitleyemeyiz
//  val isTeacher2: Boolean = 0 değildir yani 1 i eşitleyemeyiz

    /**
     * &&, || , and , or , xor gibi opetorler ile beraber kullanılabilir
     */

    if (isStudent && isTeacher) {
    }
    if (isStudent || isTeacher) {
    }
    if (isStudent and isTeacher) {
    }
    if (isStudent or isTeacher) {
    }
    if (isStudent.or(isTeacher)) {
        println("Doğru")
    }else{
        println("Değil")
    }

    /**
     * Boolean değerin  == true ile kontrol etmeye gerek yok. Süslü parantezler otomatikmen kontrol ediyor.
     * Aşağıdaki gibi yani
     */
    if (isStudent == true){
    }
    if (isStudent){
    }

    /**
     * aynı şekilde false durumunuda kontrol etmek için == false a gerek yok
     * boolean değerin başına ! koyarak tersini olumsuzunu alabiliriz
     */

    if (!isStudent == true){
    }
    if (isStudent.not()){
    }

    // Tekrar Edildi !


}
