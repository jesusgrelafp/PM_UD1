package practicas

fun main() {
    val calculadora = CalculadoraCuerpoExpresion()

    print("Introduzca su nombre: ")
    val usuario : String? = readLine()
    println(calculadora.saludar(nombre = usuario))

    print("Introduzca el primer entero: ")
    val a : Int? = readLine()?.toIntOrNull()

    print("Introduzca el segundo entero: ")
    val b : Int? = readLine()?.toIntOrNull()

    println("suma = ${calculadora.sumar(a, b)}")
    println("resta = ${calculadora.restar(a, b)}")
    println("multiplica = ${calculadora.multiplicar(a, b)}")
    try {
        println("divide = ${calculadora.dividir(a, b)}")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}