package practicas

class CalculadoraCuerpoExpresion {


    fun sumar(a: Int?, b: Int?): Int = (a ?: 0) + (b ?: 0)
    fun restar(a: Int?, b: Int?): Int = (a ?: 0) - (b ?: 0)
    fun multiplicar(a: Int?, b: Int?): Int = (a ?: 0) * (b ?: 0)
    fun dividir(a: Int?, b: Int?): Double =
        if (b == null || b == 0) throw IllegalArgumentException("No se puede dividir por cero o null")
        else (a ?: 0).toDouble() / b.toDouble()

    fun saludar(nombre: String?, tratamiento: String? = "Sra.") : String = "Buenos días $tratamiento ${nombre?:""}"
}