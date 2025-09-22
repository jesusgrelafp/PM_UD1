package practicas.map

fun main () {
        val inventario = Inventario()

        // Agregar productos
        inventario.agregarProducto("P001", Producto("Teclado", 25.99))
        inventario.agregarProducto("P002", Producto("Ratón", 15.50))
        inventario.agregarProducto("P003", Producto("Monitor", 199.99))

        inventario.mostrarProductos()

        // Actualizar precio
        inventario.actualizarPrecio("P002", 17.00)
        println("\nTras actualizar precio del Ratón:")
        inventario.mostrarProductos()

        // Buscar producto
        val buscado = inventario.buscarProductoPorId("P003")
        println("\nBuscando P003: ${buscado ?: "No encontrado"}")

        // Eliminar producto
        inventario.eliminarProducto("P001")
        println("\nTras eliminar el producto P001:")
        inventario.mostrarProductos()
}

