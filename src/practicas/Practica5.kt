package practicas
fun main() {

    print("Introduzca el primer entero: ")
    val a : Int? = readLine()?.toIntOrNull()

    print("Introduzca el segundo entero: ")
    val b : Int? = readLine()?.toIntOrNull()

    val calculadora = CalculadoraNullable()

    println("suma = ${calculadora.sumar(a, b)}")
    println("resta = ${calculadora.restar(a, b)}")
    println("multiplica = ${calculadora.multiplicar(a, b)}")
    try {
        println("divide = ${calculadora.dividir(a, b)}")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}