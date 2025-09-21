package poo

// Herencia con constructor por defecto. Necesario añadir ()
open class Ancestro
class Descendiente: Ancestro()

// Herencia con constructor primario
open class Ancestro1(val propiedad:Boolean)
class Descendiente1(propiedad: Boolean) : Ancestro1(propiedad)

// Herencia con constructor secundario
open class Weapon3(val damage: Int, val speed: Double)
class Bow : Weapon3 {
    constructor(damage: Int, speed: Double) : super(damage, speed)
}

open class Character(val name: String) {
    open fun die() = println("Morir")
}
class Mage (name: String) : Character(name) {
    override fun die() = println("Mago muriendo")
}

open class BaseItem(val name: String) {
    open var quantity = 1;
}
class PopularItem(name: String) : BaseItem(name) {
    override var quantity = 6;
}


fun main () {
    // Ejemplos métodos por defecto de clase Any de la que hereda la clase Ejemplo
    val ejemplo1 = Ejemplo()
    val ejemplo2 = Ejemplo()

    println(ejemplo1.toString())
    println(ejemplo1.equals(ejemplo2))
    println(ejemplo1.hashCode())

    // Instanciar un objeto Mage
    val jaina = Mage("Jaina")
    jaina.die()

    // Instanciar BaseItem
    // Añadir item regular de orden
    val notebook = BaseItem("Cuaderno")
    // Añadir item popular
    val pencil = PopularItem("Lapicero")
    // Mostrar factura
    println("${notebook.name} x ${notebook.quantity}")
    println("${pencil.name} x ${pencil.quantity}")

}