package practicas

fun main() {
    print("Introduzca el primer entero: ")
    val a : Int = (readLine()?: "0").toInt()

    print("Introduzca el segundo entero: ")
    val b : Int = (readLine()?: "0").toInt()

    val calculadora = Calculadora()

    println("suma $a + $b = ${calculadora.sumar(a, b)}")
    println("resta $a - $b = ${calculadora.restar(a, b)}")
    println("multiplica $a * $b = ${calculadora.multiplicar(a, b)}")
    try {
        val resultado : Double = calculadora.dividir (a, b)
        println("divide $a / $b = ${"%.2f".format(resultado)}")   // Se formatea el valor double a 2 decimales
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}