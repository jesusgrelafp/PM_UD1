package colecciones

fun main() {
    // Listas inmutables
    val oneToFiveList: List<Int> = listOf(1,2,3,4,5)
    val oneToFiveList2 = listOf(1,2,3,4,5)
    println(oneToFiveList) // [1, 2, 3, 4, 5]
    println(oneToFiveList2) // [1, 2, 3, 4, 5]


    println(oneToFiveList.size) // 5
    println(oneToFiveList.get(1)) // 2
    println(oneToFiveList[2]) // 3
    println(oneToFiveList.indexOf(5)) // 4
    println(oneToFiveList.lastIndexOf(6)) // -1
    println(oneToFiveList.subList(0, 2)) // [1, 2]

    // Listas mutables
    val colorsList = mutableListOf("Amarillo", "Azul", "Rojo")

    colorsList.add("Verde") // [Amarillo, Azul, Rojo, Verde]
    colorsList.add(0, "Blanco") // [Blanco, Amarillo, Azul, Rojo, Verde]
    colorsList.removeAt(2) // [Blanco, Amarillo, Rojo, Verde]
    colorsList[1] = "Negro" // [Blanco, Negro, Rojo, Verde]
    colorsList.set(0, "Rosa") // [Rosa, Negro, Rojo, Verde]

    colorsList.sort()
    println(colorsList) // [Negro, Rojo, Rosa, Verde]

    colorsList.sortDescending()
    println(colorsList) // [Verde, Rosa, Rojo, Negro]

    val list = listOf(1,2,3,4,5,6)
    println(list.sum())
    println(list.reduce {acc,i -> acc + i })
    println(list.groupBy { it % 2 })
    println(listOf(listOf(1), listOf(2, 3)).flatten()) // [1, 2, 3]

    // Funcion filter()
    val numbers1 = listOf(1, 3, 5, 8, 10, 11, 15, 31, 40)
    val multiplesOfFive1 = numbers1.filter { x -> x % 5 == 0 }
    val multiplesOfFive2 = numbers1.filter { it % 5 == 0 }

    println(multiplesOfFive1) // [5, 10, 15, 40]
    println(multiplesOfFive2) // [5, 10, 15, 40]

    // Función partition
    val numbers2 = listOf(-2, -1, 0, 1, 2)
    val isPositive = { number: Int -> number > 0 }
    println(numbers2.partition(isPositive))
    println(numbers2.partition { it > 0 })


}