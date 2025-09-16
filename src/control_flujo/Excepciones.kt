package control_flujo

fun main() {
    print("Escribe el texto: ")
    val userInput = readLine()
    println("Cantidad de dígitos: ${countDigits2(userInput)}")

    println("5.2".toDoubleOrDefault(1.0))
    println("dos".toDoubleOrDefault(1.0))
}

fun countDigits1(userInput: String?): Int {
    if (userInput.isNullOrBlank())
        throw IllegalArgumentException("Entrada inválida, la palabra debe tener al menos un carácter")

    return userInput.count(Char::isDigit)
}

// Función con cuerpo de una sola expresión
fun countDigits2(userInput: String?): Int =
    if (userInput.isNullOrBlank())
        throw IllegalArgumentException("Entrada inválida, la palabra debe tener al menos un carácter")
    else
        userInput.count(Char::isDigit)

// Manejar Excepciones En Kotlin
fun String.toDoubleOrDefault(defaultValue: Double): Double {
    return try {
        toDouble()
    } catch(e: NumberFormatException)  {
        defaultValue
    }
}

// como función con cuerpo de expresión
fun String.toDoubleOrDefault2(defaultValue: Double) = try {
    toDouble()
} catch(e: NumberFormatException)  {
    defaultValue
}
