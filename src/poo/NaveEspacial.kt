package poo


// Clase básica
class NaveEspacial(var nombre: String,
                   val tamano: Int) {
    var velocidad: Int = 0

    fun volar() {
        velocidad = 100
    }

    fun estaVolando(): Boolean {
        return velocidad > 0
    }

    // Objeto companion reemplaza miembros estáticos
    companion object {
        fun nuevaNave(): NaveEspacial {
            return NaveEspacial("Halcon", 25)
        }
    }
}

// Uso de la clase
fun main() {
    val miNave = NaveEspacial("Enterprise", 150)
    miNave.volar()
    val volando = miNave.estaVolando()
    println("¿Está volando? $volando") // ¿Está volando? true

    // Usando el objeto companion
    val naveNueva = NaveEspacial.nuevaNave()
    println("Nueva nave: ${naveNueva.nombre}, tamaño: ${naveNueva.tamano}") // Nueva nave: Halcon, tamaño: 25
}