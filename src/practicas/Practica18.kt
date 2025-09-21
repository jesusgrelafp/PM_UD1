package practicas

class Libro(val titulo: String, val autor: String, val anioPublicacion: Int) {

    // Definimos manualmente los componentN()
    operator fun component1() = titulo
    operator fun component2() = autor
    operator fun component3() = anioPublicacion
}

fun main() {
    // Crear una instancia de Libro
    val libro = Libro("Cien años de soledad", "Gabriel García Márquez", 1967)

    // Desestructuración en variables
    val (titulo, autor, anio) = libro

    // Mostrar mensaje
    println("El libro $titulo del autor $autor fue publicado en el año $anio")
}
