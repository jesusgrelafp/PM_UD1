package practicas.map

class Inventario {
    private val productos = mutableMapOf<String, Producto>()

    fun agregarProducto(id: String, producto: Producto) {
        if (id !in productos) {
            productos[id] = producto
            println("Producto agregado: $id -> $producto")
        } else {
            println("Ya existe un producto con id $id")
        }
    }

    fun actualizarPrecio(id: String, nuevoPrecio: Double) {
        val producto = productos[id]
        if (producto != null) {
            producto.precio = nuevoPrecio
            println("Precio actualizado para $id: $nuevoPrecio")
        } else {
            println("No se encontró el producto con id $id")
        }
    }

    fun eliminarProducto(id: String) {
        if (productos.remove(id) != null) {
            println("Producto $id eliminado")
        } else {
            println("No se encontró el producto con id $id")
        }
    }

    fun mostrarProductos() {
        if (productos.isEmpty()) {
            println("Inventario vacío")
        } else {
            println("Inventario:")
            productos.forEach { (id, producto) ->
                println(" - ID: $id | Nombre: ${producto.nombre} | Precio: ${producto.precio} €")
            }
        }
    }

    fun buscarProductoPorId(id: String): Producto? {
        return productos[id]
    }
}
