package funciones

fun main() {
    val eCount = "develou.com".count({ char:Char -> char == 'e' })
    println("Total 'e': $eCount")

    // Si la expresión lambda es el el último argumento en la función,
    // puedes escribir las llaves por fuera del paréntesis
    println("------")
    val eCount2 = "develou.com".count() { char:Char -> char == 'e' }
    println("Total 'e': $eCount2")

    // Omitir paréntesis de función
    println("------")
    val eCount3 = "develou.com".count { char:Char -> char == 'e' }
    println("Total 'e': $eCount3")

    // Omitir el tipo de argumento si el compilador lo puede inferir del contexto
    println("------")
    val eCount4 = "develou.com".count { char -> char == 'e' }
    println("Total 'e': $eCount4")

    // Cuando tu lambda usa un único argumento y no piensas cambiar su nombre
    // por cuestiones de legibilidad, puedes usar el identificador it
    println("------")
    val eCount5 = "develou.com".count { it == 'e' }
    println("Total 'e': $eCount5")

    // Lambdas con un cuerpo con varias líneas
    val eCount6 = "develou.com".count {
        println("Carácter $it")
        it == 'e'
    }
    println("Total 'e': $eCount6")


    // añadir un mismo carácter al inicio y al final de un string
    val mapMessage: String.(Char) -> String = { it + this + it }

    println("Mensaje".mapMessage('*'))
    println(mapMessage("Mensaje", '*'))

}