package elementos_basicos

fun main() {
    val customerName : String = "Claudia Martinez"
    val customerName2 = "Claudia Martinez"

    println(customerName[5])
    println(customerName.get(6))

    for (char in customerName) {
        print(char)
    }
    println()
    for (index in customerName.indices) {
        print(customerName[index])
    }

    println()
    println(customerName.length)

    // Concatenación

    val a = "José" + " Monteria"
    println(a)
    val b = "Cantidad de ahorros: " + 536.4
    println(b)
    val c = "Resultado: " + (2+4)
    println(c)

    var d = "Nueva concatenación"
    d += '!'
    println(d)

    val welcomeText = """
       |¡Bienvenido a la guia... 
       |En esta serie de ... 
       |los conceptos básicos...!
    """
    println(welcomeText)
    println(welcomeText.trimMargin())


    val playerName ="NKiller"
    println("Tu nuevo nombre es $playerName")
    println("Tamaño del nick: ${playerName.length}")
}