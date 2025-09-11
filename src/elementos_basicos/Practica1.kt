package elementos_basicos

fun main() {
    print("Introduce tu nombre: ")
    val nombre = readLine()         	// Variable de tipo String

    print("Introduce tu edad actual: ")
    val edadInput = readLine() ?: "0"   // Leemos la edad como String
    val edad = edadInput.toInt()        // Convertimos la edad a Int

    val edadFutura = edad + 5           // Calculamos la edad futura
    println("Hola, $nombre. Dentro de 5 años tendrás $edadFutura años.")
}
