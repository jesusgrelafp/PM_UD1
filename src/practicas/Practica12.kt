package practicas

class CocheTuneado(marca: String, modelo: String) {

    var marca: String = marca
        get() = field.uppercase()

    var modelo: String = modelo
        get() = field.uppercase()

    var velocidad: Int = 0
        set(value) {
            field = if (value >= 0) value else 0
        }

    // Constructor secundario
    constructor(marca: String, modelo: String, velocidadInicial: Int) : this(marca, modelo) {
        this.velocidad = velocidadInicial   // usa setter → nunca será negativa
    }

    fun acelerar(cantidad: Int) {
        if (cantidad > 0) {
            velocidad += cantidad
        }
    }

    fun frenar(cantidad: Int) {
        if (cantidad > 0) {
            velocidad -= cantidad
            /* Esta parte no sería necesaria porque ya se hace mediante el setter

            if (velocidad < 0) {
                velocidad = 0
            }

            */
        }
    }

}

fun main() {
    val coche1 = CocheTuneado("Toyota", "Corolla")
    val coche2 = CocheTuneado("Ford", "Focus", 50)
    val coche3 = CocheTuneado("Seat", "Ibiza", 20)

    coche1.acelerar(30)
    coche2.frenar(20)
    coche3.acelerar(20)
    coche3.frenar(60)

    println("CocheTuneado1 -> ${coche1.marca} ${coche1.modelo}, velocidad: ${coche1.velocidad}")
    println("CocheTuneado2 -> ${coche2.marca} ${coche2.modelo}, velocidad: ${coche2.velocidad}")
    println("CocheTuneado3 -> ${coche3.marca} ${coche3.modelo}, velocidad: ${coche3.velocidad}")
}
