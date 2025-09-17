package practicas
class Calculadora {
    // Suma
    fun sumar(a: Int, b: Int): Int {
        return a + b
    }

    // Resta
    fun restar(a: Int, b: Int): Int {
        return a - b
    }

    // Multiplicación
    fun multiplicar(a: Int, b: Int): Int {
        return a * b
    }

    // División
    fun dividir(a: Int, b: Int): Double {
        if (b == 0) throw IllegalArgumentException("No se puede dividir por cero")
        return a.toDouble() / b.toDouble()
    }
}