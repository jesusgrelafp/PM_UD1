package elementos_basicos




fun main() {
    val account = "Paypal" to 50.4  // crea un objeto Pair<String, Double> usando un infix function
    val (name, balance) = account   // extrae los dos valores del par
    println("Cuenta: $name")
    println("Saldo: $balance")

    // Es equivalente a lo siguiente:
    val account1 = Pair("Paypal", 50.4)
    val name1 = account1.first
    val balance1 = account1.second
    println("Cuenta: $name1")
    println("Saldo: $balance1")

    val name2 = account1.component1()
    val balance2 = account1.component2()
    println("Cuenta: $name2")
    println("Saldo: $balance2")

    val center = Triple(2, 0, 4)
    val(_,y,_) = center
    println(y) // 0

    val numbers = intArrayOf(1, 5, 4, 3, 0, 7)
    for ((index, number) in numbers.withIndex()) {
        if ((index + 1) % 2 == 0)
            println(number)
    }

    // definida con el modificador "data"
    data class Troll(val health: Int, val speed: Double)
    val (health, speed) = Troll(150, 0.5)
    println("El troll tiene $health puntos de vida y se mueve a $speed")

    // definida con una clase normal pero sobrecargando con operator
    // las funciones especiales componentN
    class Troll2(val health: Int, val speed: Double){
        operator fun component1() = health
        operator fun component2() = speed
    }
    val (health2, speed2) = Troll(150, 0.5)
    println("El troll tiene $health2 puntos de vida y se mueve a $speed2")

    var shampoosAndTreatmentTypes = mapOf(
        "Buticaba" to "Liso", "Pinorelo" to "Crespo",
        "Curucuru" to "Ondulado", "Mertabé" to "Caspa"
    )
    for ((shampoo, treatment) in shampoosAndTreatmentTypes) {
        println("El shampoo $shampoo es para el tratamiento $treatment")
    }

    shampoosAndTreatmentTypes.forEach { (shampoo2,treatment2) ->
        println("El shampoo $shampoo2 es para el tratamiento $treatment2")
    }

}
