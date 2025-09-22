package practicas

// Definimos la clase Usuario
data class Usuario(val username: String, val email: String)

// Clase que gestiona el registro de usuarios con una lista
class GestorUsuarios {

    // Usamos una MutableList para almacenar usuarios
    private val usuarios: MutableList<Usuario> = mutableListOf()

    // Función para agregar un usuario evitando duplicados por email
    fun agregarUsuario(usuario: Usuario): Boolean {
        // Verificamos si ya existe un usuario con el mismo email
        if (usuarios.any { it.email == usuario.email }) {
            println("No se pudo agregar: el email '${usuario.email}' ya está registrado.")
            return false
        }
        usuarios.add(usuario)
        println("Usuario '${usuario.username}' agregado correctamente.")
        return true
    }

    // Función para mostrar todos los usuarios
    fun mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            println("No hay usuarios registrados.")
        } else {
            println("Lista de usuarios registrados:")
            usuarios.forEach { println(" - ${it.username} (${it.email})") }
        }
    }

    // Función para buscar un usuario por email
    fun buscarUsuarioPorEmail(email: String): Usuario? {
        val usuario = usuarios.find { it.email == email }
        return if (usuario != null) {
            println("Usuario encontrado: ${usuario.username} (${usuario.email})")
            usuario
        } else {
            println("No se encontró ningún usuario con el email '$email'.")
            null
        }
    }
}

// Ejemplo de uso
fun main() {
    val gestor = GestorUsuarios()

    val u1 = Usuario("juan123", "juan@mail.com")
    val u2 = Usuario("ana89", "ana@mail.com")
    val u3 = Usuario("pepe77", "juan@mail.com") // mismo email que u1

    gestor.agregarUsuario(u1)
    gestor.agregarUsuario(u2)
    gestor.agregarUsuario(u3) // rechazado por duplicado

    gestor.mostrarUsuarios()

    gestor.buscarUsuarioPorEmail("ana@mail.com")
    gestor.buscarUsuarioPorEmail("noexiste@mail.com")
}
