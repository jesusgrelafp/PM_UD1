package colecciones

fun main() {

    val positiveNumbers = setOf(1, 2, 3, 4)
    println(positiveNumbers)

    val cities = setOf("Cali", "Armenia", "Cartagena", null)
    println(cities)

    val diamondCardsHand = setOf('A', 1, 2, 3, 'J', 'Q', 'K')
    println(diamondCardsHand)

    // Comparando sets
    val a = setOf(1, 2, 3, 4, 4, 4)
    println("a = $a")
    println("son iguales ${a == setOf(1, 2, 3, 4)}") // true

    println("son iguales ${setOf(1, 2, 3) == setOf(2, 3, 1)}") // true

    // Ver si un elemento está contenido en el set
    val numbersSet = setOf(1, 3, 5, 7, 9, 11)
    println(numbersSet.contains(2)) // false
    println(3 in numbersSet) // true

    // Ver si un subconjunto está contenido
    println(numbersSet.containsAll(setOf(1,3))) // true

    // Sets Mutables
    val setA = mutableSetOf(1,6,7,10)
    val setB = mutableSetOf<Int>()
    println("A=$setA y B=$setB") // A=[1,6,7,10] y B=[]

    // añadir elementos
    setB.add(1) //[1]
    println(setB)
    setB += 2   // [1,2]
    println(setB)
    setB += 2   // [1,2]
    println(setB)

    // eliminar elementos
    setB.remove(1)  // [2]
    println(setB)
    setB -= 2  // []
    println(setB)
    setB -= 3  // []
    println(setB)

    // operaciones entre conjuntos
    // union
    val group1 = setOf(1, 3, 6, 7)
    val group2 = setOf(2, 4, 6, 8)
    println("Union = ${group1 union group2}")

    //intersect
    println("Intersect = ${group1 intersect group2}")

    // subtract
    println("Subtract = ${group1 subtract group2}")
}