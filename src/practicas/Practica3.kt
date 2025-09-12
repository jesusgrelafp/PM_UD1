package practicas

fun main() {
    // 1. Crear un DoubleArray para 5 notas
    val notas = DoubleArray(5)

    // 2. Pedir al usuario que ingrese las 5 notas
    println("Introduce 5 notas:")
    for (i in 0 until notas.size) {
        print("Nota ${i + 1}: ")
        notas[i] = readLine()!!.toDouble()
    }

    // 3. Calcular la suma de todas las notas
    var suma = 0.0
    for (i in 0 until notas.size) {
        suma += notas[i]
    }

    // 4. Calcular el promedio
    val promedio = suma / notas.size

    // 5. Encontrar la nota más alta
    var notaMaxima = notas[0]
    for (i in 1 until notas.size) {
        if (notas[i] > notaMaxima) {
            notaMaxima = notas[i]
        }
    }

    // 6. Mostrar resultados
    println("Notas ingresadas: ")
    for (i in 0 until notas.size) {
        println("Nota ${i + 1}: ${notas[i]}")
    }
    println("Suma total: $suma")
    println("Promedio: $promedio")
    println("Nota más alta: $notaMaxima")
}