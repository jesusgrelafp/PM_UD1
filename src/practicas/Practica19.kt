package practicas

class Novela(val titulo: String, val autor: String, val anioPublicacion: Int) {

    // Definimos manualmente los componentN()
    operator fun component1() = titulo
    operator fun component2() = autor
    operator fun component3() = anioPublicacion
}

fun main() {
    // Crear una lista de novelas
    val biblioteca = listOf(
        Novela("Don Quijote de la Mancha", "Miguel de Cervantes", 1605),
        Novela("El Señor de los Anillos", "J.R.R. Tolkien", 1954),
        Novela("Cien años de soledad", "Gabriel García Márquez", 1967)
    )

    // Paso 5 y 6: bucle con desestructuración completa
    for ((titulo, autor, anio) in biblioteca) {
        println("La novela $titulo del autor $autor fue publicada en el año $anio")
    }

    println("-----")

    // Paso 7: forEach con lambda, ignorando el autor
    biblioteca.forEach { (titulo, _, anio) ->
        println("La novela $titulo fue publicada en el año $anio")
    }
}
