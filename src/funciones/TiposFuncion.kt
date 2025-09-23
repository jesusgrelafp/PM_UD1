package funciones

fun main() {
    val nombreConFormato: (String, String) -> String = { nombre: String, apellido: String -> "$nombre $apellido" }
    val personas = listOf(
        Pair("Pedro", "Sanchez"),
        Pair("Santiago", "Abascal"),
        Pair("Alberto", "Nuñez")
    )
    personas.forEach { (nombre,apellido) -> println(nombreConFormato(nombre,apellido)) }
    println("--------")
    personas.forEach { (nombre,apellido) -> println(nombreConFormato.invoke(nombre,apellido)) }


    // Otro ejemplo
    fun operar(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
        return operacion(a, b)
    }

    val resultado = operar(5, 3, { x, y -> x * y } ) // pasa lambda multiplicación
    println(resultado)  // 15

}
