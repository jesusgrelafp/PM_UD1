package control_flujo

fun main() {

    // Se quiere imprimir pares de números de una matriz
    // y saltarte cualquier par cuya suma sea mayor que 10.

    val matriz1 = arrayOf(1, 2, 3, 4)
    val matriz2 = arrayOf(5, 6, 7, 8)

    // Etiquetamos el bucle externo para poder referenciarlo si es necesario
    bucleExterno@ for (num1 in matriz1) {
        // Imprimimos el número de la primera matriz en cada iteración del bucle externo
        println("Iteración de bucle externo: num1 = $num1")

        for (num2 in matriz2) {
            val suma = num1 + num2

            // Si la suma es menor o igual a 10, continuamos con la siguiente iteración del bucle externo
            if (suma > 10) {
                // continue@bucleExterno salta el resto del código dentro del bucle más interno
                // y pasa directamente a la siguiente iteración del bucle externo 'bucleExterno'
                println("Suma ($suma) > 10, saltando al siguiente num1...")
                continue@bucleExterno
            }

            // Si no saltamos, imprimimos el par
            println("  Pares válidos: ($num1, $num2), Suma = $suma")
        }
    }
}