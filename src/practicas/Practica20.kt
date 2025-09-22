package practicas
// Definimos la clase Producto
data class Producto(val nombre: String, val codigo: String)

// Clase que gestiona el inventario usando un MutableSet
class Inventario {

    private val productos: MutableSet<Producto> = mutableSetOf()

    // Función para agregar un producto evitando duplicados exactos
    // (coincidiendo código y nombre del producto)
    fun agregarProducto(producto: Producto) {
        val agregado = productos.add(producto)
        if (agregado) {
            println("Producto '${producto.nombre}' agregado correctamente.")
        } else {
            println("Producto '${producto.nombre}' ya existe en el inventario.")
        }
    }

    // Función para mostrar todos los productos
    fun mostrarProductos() {
        if (productos.isEmpty()) {
            println("El inventario está vacío.")
        } else {
            println("Inventario de productos:")
            for ( (nombre, codigo) in productos) {
                println(" - $nombre ($codigo)")
            }
        }
    }
}

// Función main para probar la práctica
fun main() {
    val inventario = Inventario()

    val p1 = Producto("Teclado", "P001")
    val p2 = Producto("Ratón", "P002")
    val p3 = Producto("Teclado", "P001") // Duplicado

    inventario.agregarProducto(p1) //agregado
    inventario.agregarProducto(p2) //agregado
    inventario.agregarProducto(p3) //ya existe

    inventario.mostrarProductos()
}
