package practicas

fun main() {
    print("Introduce un número positivo: ")
    val n = (readLine()?:"0").toInt()

    for (i in 1..n) {
        if (i % 3 == 0) {
            continue // saltar múltiplos de 3
        }
        if (i == 20) {
            println("Se alcanzó el 20, fin del bucle.")
            break // salir del bucle
        }
        println(i)
    }
}

