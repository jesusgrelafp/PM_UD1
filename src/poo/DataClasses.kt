package poo

data class Rock(
    val witdh: Int,
    val height: Int,
    val depth: Int,
    val variation: Int = 1) {
    var deformationFactor = 0.0   //Para esta propiedad no se generan los métodos de utilidad
}

fun main() {
    val rock1 = Rock(20,10,10)
    println("Roca 1: $rock1")

    val rock2 = rock1.copy()
    println("Roca 2: $rock2")

    val rock3 = rock1.copy(variation = 4)
    println("Roca 3: $rock3")

    println("rock1 == rock2: ${rock1 == rock2}")
    println("rock1 == rock3: ${rock1 == rock3}")

    println("rock1.hashCode():${rock1.hashCode()}")
    println("rock2.hashCode():${rock2.hashCode()}")

    println("Rock1.witdh = ${rock1.component1()}")
    println("Rock1.height = ${rock1.component2()}")
    println("Rock1.depth = ${rock1.component3()}")
    println("Rock1.variation = ${rock1.component4()}")

    val (witdh, height) = Rock(15, 30, 40)
    println("Desestructurando a width($witdh) y height($height)")

}