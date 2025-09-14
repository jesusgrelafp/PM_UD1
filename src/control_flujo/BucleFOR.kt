package control_flujo

fun main () {

    for (i in 1..5) {
        println("Contando $i")
    }

    // Recorrer Un Rango

    // iteración regular
    for (char in 'a'..'f') print(char)
    println()

    // iteración con avance de 2
    for (char in 'a'..'f' step 2) print(char)
    println()

    // iteración en reversa
    for (char in 'f' downTo 'a') print(char)
    println()

    // iteracion excluyendo el límite superior
    for (char in 'a' until 'f') print(char)
    println()

    // Recorrer Un Array
    val champions = arrayOf("Teemo", "ahri", "vayne", "Brand", "Kindred")
    for (i in champions.indices) {
        println("[$i, ${champions[i]}]")
    }

    println()

    for ((i,v) in champions.withIndex()) {
        println("[$i,$v]")
    }

    // Recorrer un String
    for (c in "Develou") {
        println(c)
    }


}