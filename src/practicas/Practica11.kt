package practicas

class Coche(val marca: String, val modelo: String) {

    var velocidad: Int = 0
        private set

    // Constructor secundario
    constructor(marca: String, modelo: String, velocidadInicial: Int) : this(marca, modelo) {
        if (velocidadInicial >= 0) {
            velocidad = velocidadInicial
        }
    }

    fun acelerar(cantidad: Int) {
        if (cantidad > 0) {
            velocidad += cantidad
        }
    }

    fun frenar(cantidad: Int) {
        velocidad -= cantidad
        if (velocidad < 0) {  // comprueba si el valor es menor que 0
            velocidad = 0     // Si es así lo establece a 0
        }
    }
}


fun main() {
    val coche1 = Coche("Toyota", "Corolla")
    val coche2 = Coche("Ford", "Focus", 50)
    val coche3 = Coche("Seat", "Ibiza", 20)

    coche1.acelerar(30)
    coche2.frenar(20)
    coche3.acelerar(20)
    coche3.frenar(60)

    println("Coche1 -> ${coche1.marca} ${coche1.modelo}, velocidad: ${coche1.velocidad}")
    println("Coche2 -> ${coche2.marca} ${coche2.modelo}, velocidad: ${coche2.velocidad}")
    println("Coche3 -> ${coche3.marca} ${coche3.modelo}, velocidad: ${coche3.velocidad}")
}
