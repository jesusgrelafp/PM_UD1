package practicas

class Contador {

    companion object {
        // Miembros "estáticos" aquí
        var contador: Int = 0
        fun imprimirValor() {
            println("Valor actual del contador: $contador")
        }
    }

    fun aumentarContador() {
        contador++   // accedemos a la propiedad del companion
    }
}

fun main() {
    // Incrementar 4 veces desde la clase (companion)
    Contador.contador++
    Contador.contador++
    Contador.contador++
    Contador.contador++
    Contador.imprimirValor()   // Debería mostrar 4

    // Crear instancia y aumentar contador una vez más
    val instancia = Contador()
    instancia.aumentarContador()
    Contador.imprimirValor()   // Debería mostrar 5
}
