package poo

import java.util.UUID

// Constructor primario
class Weapon(val attack: Int, val speed: Double)

// Con bloque de inicialización
class Weapon2(attack: Int, speed: Double) {
    val attack: Int
    val speed: Double

    init {
        this.attack = attack
        this.speed = speed
    }
}

// Constructor secundario
// Problema: se usa un generación de ID innecesaria al hacer la llamada a :this(name)
class Contact (var name: String) {
    var id: String

    init {
        id = UUID.randomUUID().toString()
    }

    constructor(id: String, name: String) :this(name) {
        this.id = id
    }

    // Sobreescribimos la función toString para poder imprimir de forma legible el contacto
    override fun toString(): String {
        return "Contacto: $name (ID: $id)"
    }

}
// Con dos constructores secundarios
// Evitamos el "issue" de obtener un UUID que no usaremos

class Contact2 {
    var id: String
    var name: String

    constructor(name: String) {
        this.name = name
        id = UUID.randomUUID().toString()
    }

    constructor(id: String, name: String){
        this.id = id
        this.name = name
    }

    // Definición de la función en linea con asignación, sin bloque de código
    override fun toString() = "Contacto: $name (ID: $id)"

}

fun main() {
    val weapon1 = Weapon(3,0.5)
    println("Arma 1 --> ataque: ${weapon1.attack}, velocidad: ${weapon1.speed} ")

    println("Creando contacto...")
    val contacto1_1 = Contact("Juan")
    val contacto1_2 = Contact("123e4567", "Ana")
    println(contacto1_1)
    println(contacto1_2)

    println("Creando contacto...")
    val contacto2_1 = Contact2("Juan")
    val contacto2_2 = Contact("123e4567", "Ana")
    println(contacto2_1)
    println(contacto2_2)

}

open class A {
    public var m1 = 10
    internal var m2 = "Propiedad interna"

    private fun m3() = println("Método privado")

    protected open fun m4() = m1 + 10
}


class B : A() {
    // m1 es visible pero no se puede sobrescribir

    // m2 es visible pero no se puede sobrescribir

    // m3 no es visible

    // m4 es visible y se puede sobrescribir
    public override fun m4() = m1 + 100
}
