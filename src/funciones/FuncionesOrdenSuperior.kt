package funciones

// Función de orden superior
// Pasar función como parámetro
fun playEffectCard(cardCost1: Int, cardCost2: Int, onSuccess: () -> Unit) {
    if (cardCost1 > cardCost2) {
        onSuccess()
    } else {
        println("Sin efectos")
    }
}

enum class Dimension {
    CM, INCH, FOOT, YARD
}

// Función de orden superior
// Retornar función desde función
fun getConversion(dimension: Dimension): (Double) -> Double {
    return when (dimension) {
        Dimension.CM -> { mts -> mts * 100 }
        Dimension.INCH -> { mts -> mts * 39.37 }
        Dimension.FOOT -> { mts -> mts * 3.281 }
        Dimension.YARD -> { mts -> mts * 1.094 }
    }
}

fun main() {


    val warriorCardCost = 1
    val randomDeckCardCost = 4
    playEffectCard(warriorCardCost, randomDeckCardCost, { print("Aumentar armadura por 10") })


    // Pasando referencia de función
    fun increaseArmor() {
        print("Aumentar armadura por 10")
    }
    playEffectCard(warriorCardCost, randomDeckCardCost, ::increaseArmor)


    val meters = 20.0
    print(getConversion(Dimension.FOOT)(meters))

}