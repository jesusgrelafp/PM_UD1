package practicas

fun main() {
    print("Introduzca la primera nota: ")
    val primeraNota : Float = (readLine()?: "0").toFloat()

    print("Introduzca la segunda nota: ")
    val segundaNota : Float = (readLine()?: "0").toFloat()

    print("Introduzca la tercera nota: ")
    val terceraNota : Float = (readLine()?: "0").toFloat()

    print("Introduzca la cuarta nota: ")
    val cuartaNota : Float = (readLine()?: "0").toFloat()

    val notaMedia = (primeraNota + segundaNota + terceraNota + cuartaNota) / 4
    val mensaje : Any = when {
        notaMedia >= 7 -> "Notable"
        notaMedia >= 5 && notaMedia < 7 -> "Aprobado"
        notaMedia < 5 -> {
             print("¿El alumno se ha presentado a recuperación? (S/N)")
             val respuesta : String? = readLine()?.uppercase()

             when (respuesta) {
                 "S" -> "En recuperación"
                 "N" -> "Suspenso"
                 else -> "Respuesta no esperada"
             }
         }
        else -> "Nota no esperada"
    }

    println("Situación del alumno: $mensaje")

}