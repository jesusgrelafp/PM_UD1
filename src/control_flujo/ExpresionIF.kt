package control_flujo

fun main() {
 /*
    if ( expresion ) {
        // Acciones si se cumple expresion
    } else if (expresion2) {
        // Acciones si se cumple expresion2
    } else {
        // Acciones si nada se cumple
    }
*/
    val level = 12
    if ( level >= 45 ) {
        println("Aprendiste Acrobacia")
    } else {
        println("Se requiere el nivel 45. Nivel actual $level")
    }

    val enemyHeroHealth = 16

    var cardAttack: Int
    if ( enemyHeroHealth <= 15) {
        cardAttack = 9
    } else {
        cardAttack = 6
    }

    println("Ataque: $cardAttack")

    // Es aquivalente a ...

    var cardAttack2 = if (enemyHeroHealth <= 15) 9 else 6
    println("Ataque2: $cardAttack2")

    var cardAttack3 = if (enemyHeroHealth <= 15) {
        println("Grrrrr!!")
        9
    } else {
        println("...")
        6
    }
    println("Ataque3: $cardAttack3")

/*
   // Si no se indica valor de devuelto en un bloque el tipo pasaría
   // a ser Unit en un bloque e Int en el otro --> Se infiere tipo Any
    var cardAttack4:Int = if (enemyHeroHealth <= 15) {
        println("Grrrrr!!")
        9
    } else {
        println("...")
    }
*/
}