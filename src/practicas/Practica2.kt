package practicas

fun main() {
    print("Introduce una cadena de texto: ")
    val cadena = readln()

    print("Introduce una posición: ")
    val posicion = readln().toInt()

    val longitud = cadena.length

    println("\n--- Resultados ---")

    // Verificar si la posición está dentro de los límites
    if (posicion < 0 || posicion >= longitud) {
        println("Error: La posición $posicion está fuera de los límites de la cadena.")
        println("La cadena solo tiene $longitud caracteres (posiciones 0 a ${longitud - 1}).")
    } else {
        // Mostrar el carácter en la posición solicitada
        val caracterActual = cadena[posicion]
        println("Carácter en la posición $posicion: '$caracterActual'")

        // Mostrar el carácter anterior si existe
        if (posicion > 0) {
            val caracterAnterior = cadena[posicion - 1]
            println("Carácter anterior: '$caracterAnterior'")
        } else {
            println("Carácter anterior: No existe (es la primera posición)")
        }

        // Mostrar el carácter siguiente si existe
        if (posicion < longitud - 1) {
            val caracterSiguiente = cadena[posicion + 1]
            println("Carácter siguiente: '$caracterSiguiente'")
        } else {
            println("Carácter siguiente: No existe (es la última posición)")
        }
    }
}