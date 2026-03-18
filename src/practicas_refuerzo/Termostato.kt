package practicas_refuerzo

class Termostato {

    companion object {
        const val MIN_TEMP = 10.0
        const val MAX_TEMP = 30.0
    }

    var temperatura: Double = MIN_TEMP
        set(value) {
            field = when {
                value < MIN_TEMP -> MIN_TEMP
                value > MAX_TEMP -> MAX_TEMP
                else -> value
            }
        }

    val estado: String
        get() = when {
            temperatura <  18.0 -> "Frío"
            temperatura <= 24.0 -> "Confort"
            else                -> "Calor"
        }

    // Constructor secundario: pasa por el setter → temperatura siempre validada
    constructor(temperaturaInicial: Double) {
        this.temperatura = temperaturaInicial
    }

    // Constructor principal implícito (sin parámetros)
    constructor()
}

fun main() {
    // Constructor secundario con temperatura por debajo del mínimo
    val t1 = Termostato(-5.0)

    // Constructor principal + asignación por encima del máximo
    val t2 = Termostato()
    t2.temperatura = 50.0

    // Constructor secundario en zona de confort
    val t3 = Termostato(21.0)

    println("Termostato 1 → Temperatura: ${t1.temperatura}°C | Estado: ${t1.estado}")
    println("Termostato 2 → Temperatura: ${t2.temperatura}°C | Estado: ${t2.estado}")
    println("Termostato 3 → Temperatura: ${t3.temperatura}°C | Estado: ${t3.estado}")
}

// Salida esperada:
// Termostato 1 → Temperatura: 10.0°C | Estado: Frío
// Termostato 2 → Temperatura: 30.0°C | Estado: Calor
// Termostato 3 → Temperatura: 21.0°C | Estado: Confort