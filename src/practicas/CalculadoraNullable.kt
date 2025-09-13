package practicas
class CalculadoraNullable {

    // Suma
    fun sumar(a: Int?, b: Int?): Int {
        return (a ?: 0) + (b ?: 0)
    }

    // Resta
    fun restar(a: Int?, b: Int?): Int {
        return (a ?: 0) - (b ?: 0)
    }

    // Multiplicación
    fun multiplicar(a: Int?, b: Int?): Int {
        return (a ?: 0) * (b ?: 0)
    }

    // División
    fun dividir(a: Int?, b: Int?): Int {
        val divisor = b ?: 0
        if (divisor == 0) throw IllegalArgumentException("No se puede dividir por cero o null")
        return (a ?: 0) / divisor
    }
}