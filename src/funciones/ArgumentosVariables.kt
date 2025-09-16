package funciones

fun main( ) {
    println(maxLength("Juan", "Pedro", "Isabel"))
    println(maxLength())
    println(maxLength("Uno"))
    println(maxLength("Uno", "Dos"))
    println(maxLength("Uno", "Dos", "Tres"))

    // Operador Spread
    val words = arrayOf("Carro", "Manzana", "Bosque", "Avión")
    print("La palabra más larga tiene ${maxLength(*words)} caracteres")
}

// Ejemplo De Argumentos Variables En Kotlin
fun maxLength(vararg words: String): Int {
    var max = 0
    for (word in words) {
        if ( word.length > max) {
            max = word.length
        }
    }
    return max
}