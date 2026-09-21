package practicas

fun main() {

    print("Introduzca el peso en Kg: ")
    val pesoKg : Float = (readLine()?: "0").toFloat()

    print("Introduzca la altura en metros: ")
    val alturaM : Float = (readLine()?: "0").toFloat()

    val imc = pesoKg / (alturaM * alturaM)
    println("El IMC es: $imc")
    when {
        imc < 18.5 -> println("Bajo peso")
        imc >= 18.5 && imc < 25 -> println("Normal")
        imc >= 25 && imc < 30 -> println("Sobrepeso")
        imc >= 30 -> println("Obesidad")
    }
}

/*  OTRA VERSIÓN

fun main() {
    print("Introduzca el peso en Kg: ")
    val pesoKg : Float = (readlnOrNull()?: "0").toFloat()

    print("Introduzca la altura en metros: ")
    val alturaM : Float = (readlnOrNull()?: "0").toFloat()

    val imc = pesoKg / (alturaM * alturaM)
    println("El IMC es: $imc")

    when (imc) {
        in 0.0f..<18.5f -> println("Bajo peso")
        in 18.5f..<25.0f -> println("Normal")
        in 25.0f..<30.0f -> println("Sobrepeso")
        else -> println("Obesidad")
    }
}
*/
