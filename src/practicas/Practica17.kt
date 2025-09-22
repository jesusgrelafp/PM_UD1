package practicas

data class Usuario2(val nombre: String, val edad: Int, val email: String)

fun main() {
    // Crear una instancia de Usuario
    val usuario = Usuario2("Ana", 25, "ana@example.com")

    // Desestructuración: solo nombre y edad, ignorando email
    val (nombre, edad, _) = usuario

    // Imprimir mensaje
    println("Usuario: $nombre tiene $edad años")
}