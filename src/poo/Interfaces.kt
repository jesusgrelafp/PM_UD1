package poo

interface Interfaz {
    val p1: Int     // propiedad abstracta
    val p2: Boolean // propiedad regular con accesor
        get() = p1 > 0
    fun m1()        // metodo abstracto
    fun m2() {      // metodo regular
        println("Método implementado")
    }
}

class Ejemplo : Interfaz {
    override val p1: Int = 0
    override fun m1() {
        println("Sobreescribiendo método de Interfaz")
    }
}

interface Explosive {
    fun explode()
    fun warning() = println("Explosivo")
}
interface Incinerable {
    fun incinerate()
    fun warning() = println("Incinerable")
}
class Box : Explosive, Incinerable {
    override fun explode() = println("¡Kaboom!")
    override fun incinerate() = println("¡Boosh!")
    override fun warning() {
        super<Incinerable>.warning()
        super<Explosive>.warning()
    }
}



fun main() {
    val ejemplo = Ejemplo()
    ejemplo.m1()

    val box = Box()
    box.warning()
    box.explode()
    box.incinerate()
}