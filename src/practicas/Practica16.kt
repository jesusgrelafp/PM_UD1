package practicas

fun obtenerCoordenadas(): Pair<Double, Double> {
    // Simulamos coordenadas de ejemplo
    return Pair(12.5, 8.3)
}

fun obtenerColorRGB(): Triple<Int, Int, Int> {
    // Simulamos valores de un color RGB
    return Triple(120, 200, 150)
}

fun main() {
    // a) y b) Desestructuración de Pair
    val (x, y) = obtenerCoordenadas()
    println("La coordenada tiene x = $x, y = $y")

    // c) Desestructuración de Triple
    val (r, g, b) = obtenerColorRGB()
    println("Color RGB: r=$r, g=$g, b=$b")
}
