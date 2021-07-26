package classes

import kotlin.math.ln

// Code with ❤️
//   ┌────────────────────────────┐
//   │ Created by Murat ÇAY       │
//   │ ────────────────────────── │
//   │ MuratTheBestOf@gmail.com   │
//   │ ────────────────────────── │ 
//   │ 21.07.2021                 │ 
//   └────────────────────────────┘

fun main() {

}

interface HomeService {
    fun motoCarrier()
//    fun sellCoffee(): McCoffee
}

/**
 * final ve opne modifier ları kullanmak yanlış ve anlamsızdır.
 * abstract olarak yazılmış class a yeni eklenen tüm abstract yapılar, tüm child classlar da override edilmek zorunda.
 *
 * eğer abstract classınıza eklemek istediğiniz opsiyonel yapılar varsa, bunları child class ların tamamında override
 * etmek zorunda olmayalım diye, open keywordu ile tanımlayabiliriz.
 *
 * abstract bir class, abstract bir class ı miras alırsa, abstract yapıları override etmek zorunda değildir.
 *
 * abstract fun. ın body si olmaz, property lerinde default değeri olmaz.
 *
 * abstract class lar aynı zamanda instance ı oluşturulamayan class lar. Bu sebeble singleton gibi pattern ler için
 * de kullanabiliyorlar.
 */


abstract class McDonalds {
    abstract val fridge: Fridge
    abstract val superVisior: SuperVisor
    abstract val employeeOne: Employee
    abstract val employeeTwo: Employee
    abstract val employeeThree: Employee
    abstract val menuList: List<McHamburger>

    abstract fun clean(clock: Int)

    //opsiyonel
    open val policeOfficer: PoliceOffice = TODO()
}


abstract class McDonaldsExpress : McDonalds() {
    abstract fun sellCoffee(): McCoffee
    override fun clean(clock: Int) {
        println("Clean time: $clock")
    }
}


class McDonaldsSultangazi : McDonalds(), HomeService {

    override val fridge: Fridge
        get() = TODO("Not yet implemented")

    override val superVisior: SuperVisor
        get() = TODO("Not yet implemented")

    override val employeeOne: Employee
        get() = TODO("Not yet implemented")

    override val employeeTwo: Employee
        get() = TODO("Not yet implemented")

    override val employeeThree: Employee
        get() = TODO("Not yet implemented")

    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clean: Int) {
        TODO("Not yet implemented")
    }

    override fun motoCarrier() {
        TODO("Not yet implemented")
    }
}

class McDonaldsGaziOsmanpasa : McDonalds() {
    override val fridge: Fridge
        get() = TODO("Not yet implemented")

    override val superVisior: SuperVisor
        get() = TODO("Not yet implemented")

    override val employeeOne: Employee
        get() = TODO("Not yet implemented")

    override val employeeTwo: Employee
        get() = TODO("Not yet implemented")

    override val employeeThree: Employee
        get() = TODO("Not yet implemented")

    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clean: Int) {
        TODO("Not yet implemented")
    }

    override val policeOfficer: PoliceOffice
        get() = PoliceOffice()
}

class McDonaldsSultangaziExpress : McDonaldsExpress() {
    override fun sellCoffee(): McCoffee {
        TODO("Not yet implemented")
    }

    override val fridge: Fridge
        get() = TODO("Not yet implemented")

    override val superVisior: SuperVisor
        get() = TODO("Not yet implemented")

    override val employeeOne: Employee
        get() = TODO("Not yet implemented")

    override val employeeTwo: Employee
        get() = TODO("Not yet implemented")

    override val employeeThree: Employee
        get() = TODO("Not yet implemented")

    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        super.clean(clock)
        println("Clean flor: 1")
    }
}


class Fridge
class SuperVisor
class McHamburger
class PoliceOffice
class McCoffee



