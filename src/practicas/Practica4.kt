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
        println("divide $a / $b = ${calculadora.dividir(a, b)}")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}