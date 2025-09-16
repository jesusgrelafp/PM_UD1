package funciones

fun main() {
    val num = 9
    println("el cuadrado de $num es: ${square(num)}")
    println("el valor de model es: ${model(3,2,5)}")
    isVowel('v')
}

// Sintaxis De Declaración
fun square(x: Int): Int {
    return x * x
}

// Sintaxis De Declaración
fun square2(x: Int): Int = x * x

// Funciones Con Cuerpo De Expresión
fun model(x: Int, y: Int, z:Int) = 3 * x - 2 * y + z * z

// Retorno Tipo Unit. Declarado explícitamente
fun isVowel(c: Char): Unit {
    when (c) {
        'a','e','i','o','u' -> println("$c es una vocal")
        else -> println("$c no es una vocal")
    }
}

// Retorno Tipo Unit. Se permite la NO declaración explícita para el tipo Unit
fun isVowel2(c: Char) {
    when (c) {
        'a','e','i','o','u' -> println("$c es una vocal")
        else -> println("$c no es una vocal")
    }
}