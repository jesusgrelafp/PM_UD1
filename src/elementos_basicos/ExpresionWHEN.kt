package elementos_basicos

fun main() {

    // when Como Sentencia
    val input = 'y'
    when (input) {
        'y' -> println("Continuando...")
        'n' -> println("Cerrando...")
        else -> println("Entrada inválida")
    }

    // Múltiples Valores En Una Entrada
    val input2 = 2
    when (input2) {
        1, 2, 3 -> println("Te toca turno nocturno")
        4, 5, 6 -> println("Te toca turno diurno")
    }

    // Usar Expresiones Como Condición

    val input3 = 100
    when (input3) {
        Char.MAX_VALUE.toInt() -> println("Límite superior")
        Char.MIN_VALUE.toInt() -> println("Límite inferior")
        else -> println("No es ninguno de los límites")
    }

    // Rangos En When

    print("Introduce el número: ")
    val input4 = (readLine()?:"0").toIntOrNull()
    println("input4 = $input4")
    when (input4) {
        in 1..49 -> println("$input pertenece a [1..49]")
        in 50..99 -> println("$input pertenece a [50..99]")
        else -> println("Fuera de los rangos contemplados")
    }

    // Comparar Tipos Con when
    val formResponse: Any = "12"
    //val formResponse: Any = 12

    when (formResponse) {
        is Int -> {
            val times = formResponse * 100
            println("Respuesta Entera: $times")
        }
        is String -> {
            val times = formResponse.toInt() * 100
            println("Respuesta String: $times")
        }
    }

    // Usar When Como If
    val a = -5
    when {
        a > 5 -> println("Es positivo")
        a == 5 -> println("Es cero")
        else -> println("Es negativo")
    }

    // Declaración De Variable En El Sujeto
    val playerLucky = 0.2
    val bonus = 0.3

    when (val damage: Double = playerLucky + bonus) {
        in 0.0..0.3 -> println("Damage: $damage - Daño recibido: ${damage * 10}")
        in 0.3..0.6 -> println("Damage: $damage - Daño recibido: ${damage * 20}")
        in 0.6..1.0 -> println("Damage: $damage - Daño recibido: ${damage * 30}")
    }

    // When como expresion
    val markNumber = 4
    val markText = when (markNumber) {
        1 -> "Insuficiente"
        2 -> "Deficiente"
        3 -> "Aceptable"
        4 -> "Sobresaliente"
        5 -> "Excelente"
        else -> "No permitido"
    }
    print("La calificación es: $markText")
}