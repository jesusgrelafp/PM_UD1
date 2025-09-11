package elementos_basicos

fun main ( ) {
/*
    // conversion explicita
    val level: Short = 75
    // val first: Int = level  // error: Kotlin: Initializer type mismatch: expected 'Int', actual 'Short'.

    val first: Int = level.toInt()
    println(first)
*/

    // redondeo y truncado en conversiones explícitas
    val measure = 4005215
    println("valor measure: $measure")
    println("clase variable measure: ${measure::class}")
    println("toShort():${measure.toShort()}")

    // Al no pertenecer al rango Short.MIN_VALUE y Short.MAX_VALUE, se usa el truncado con los 16 bits menos significativos del entero.

}