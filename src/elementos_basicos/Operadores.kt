package elementos_basicos

fun main () {
/*
    val a = -3
    println("a = ${-a}")
*/
/*
        val a = 10
        val b = 20

            println("($a + $b) = ${a + b} <-> ${a.plus(b)}")
            println("($a - $b) = ${a - b} <-> ${a.minus(b)}")
            println("($a x $b) = ${a * b} <-> ${a.times(b)}")
            println("($a / $b) = ${a / b} <-> ${a.div(b)}")  // al dividir dos enteros, se conserva solo la parte entera
            println("($a % $b) = ${a % b} <-> ${a.rem(b)}")

         */

    // Asignación compuesta
/*
    var a = 100
    var b = 5

    a+=b
    println("+= $a")
    a-=b
    println("-= $a")
    a*=b
    println("*= $a")
    a/=b
    println("/= $a")
    a%=b
    println("%= $a")

*/

    // Operadores de incremento y decremento
/*
    var monsterKiller : Int = 10
    monsterKiller++
    monsterKiller--

    var a = 2

    println("De $a a ${++a}")
    println("De $a a ${a--}")
    println("Valor final > $a")

*/
/*
    var a = 5
    var b = 10

    //if ( a == b ) {
    if ( a?.equals(b) ?: (b === null)) {
        println("son iguales")
    } else {
        println("son distintos")
    }

*/

/*
    //Operadores relacionales
    val a = 17
    val b = 20

    println("$a es igual a $b: ${a == b}")
    println("$a es diferente de $b: ${a != b}")
    println("$a es menor que $b: ${a < b}")
    println("$a es mayor que $b: ${a > b}")
    println("$a es menor o igual que $b: ${a <= b}")
    println("$a es mayor o igual que $b: ${a >= b}")

*/
/*
    val input = 5
    var res: Boolean

    val greaterThanZero = input > 0
    val isEven = input%2 == 0

    res = greaterThanZero && isEven
    println("Es mayor que cero y par: $res")

    res = greaterThanZero || isEven
    println("Es mayor que cero o par: $res")

    res = greaterThanZero && !isEven
    println("Es mayor que cero e impar: $res")
*/

    //Operadores a nivel de bits
    val a = -5
    val b = 7

    println("a and b: ${a and b}")
    println("a or b: ${a or b}")
    println("a xor b: ${a xor b}")
    println("a.inv(): ${a.inv()}")
    println("a shl b: ${a shl b}")
    println("a shr b: ${a shr b}")
    println("a ushr b: ${a ushr b}")






}