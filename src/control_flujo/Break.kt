package control_flujo

fun main() {

    // Un break se sale del bucle en su alcance.

    for (i in 1..5) {
        println("i = $i")
        for (j in 1..5) {
            println("j = $j")
            break
        }
    }

    while (true) {
        print("Escribe una palabra:")
        val word = readLine()!!

        if (word == "salir") break

        println("Caracteres:${word.length}")
    }

    // En este caso el break se sale el bucle interior y sigue ejecutando el bucle externo
    // se para en cada 0 de cada fila
    //        Matriz inválida (sin etiquetar) en [1,0]
    //        Matriz inválida (sin etiquetar) en [2,2]
    val matrix = arrayOf(
        intArrayOf(1, 1, 1),
        intArrayOf(0, 1, 0),
        intArrayOf(1, 1, 0),
    )

    for (row in matrix.indices) {
        for (col in matrix[row].indices) {
            if (matrix[row][col] == 0) {
                println("Matriz inválida (sin etiquetar) en [$row,$col]")
                break
            }
        }
    }

    // Break etiquetado
    // En este caso el break etiquetado se sale completamente al encontrar el primer 0

    val matrix2 = arrayOf(
        intArrayOf(1, 1, 1),
        intArrayOf(0, 1, 0),
        intArrayOf(1, 1, 0),
    )

    Loop@ for (row in matrix2.indices) {
        for (col in matrix2[row].indices) {
            if (matrix2[row][col] == 0) {
                println("Matriz inválida (etiquetada) en [$row,$col]")
                break@Loop
            }
        }
    }
}