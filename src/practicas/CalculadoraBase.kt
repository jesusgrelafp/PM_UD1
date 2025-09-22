package practicas
import kotlin.math.sqrt
import kotlin.math.pow

open class CalculadoraBase (val a: Double, val b: Double) {
    fun sumar() = a+b
    fun restar() = a-b
    fun multiplicar() = a*b
    fun dividir() = if (b == 0.0) throw IllegalArgumentException("No se puede dividir por cero o null")
                    else a / b
}

class CalculadoraCientifica(a: Double, b: Double) : CalculadoraBase(a,b) {
    fun cuadrado() = a.pow(2)  // base.pow(exponente)
    fun raizCuadrada() = sqrt(this.a)
}