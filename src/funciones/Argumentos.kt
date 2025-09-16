package funciones

val customers = arrayOf("Carlos", "Miguel", "Ximena")
// Argumentos Por Defecto
fun loadCustomer(limit: Int = 0): String {
    return customers[limit]
}

fun loadCustomer2(limit: Int = 0, length: Int): String {
    return customers[limit].take(length)
}

fun main() {
    println("Cliente: ${loadCustomer()}")

    //Argumentos Nombrados
    println("Cliente: ${loadCustomer2(length = 3)}")
}

