package poo

abstract class ClaseAbstracta {
    abstract val propiedadAbstracta: Int
    abstract fun metodoAbstracto()
    fun metodoNoAbstracto() {
        //Cuerpo
    }
}

class Subclase: ClaseAbstracta() {
    override val propiedadAbstracta: Int = 10
    override fun metodoAbstracto() {
        println(propiedadAbstracta)
    }
}

abstract class Attack {
    val baseDamage: Int = 10

    abstract fun execute(): String
}

class Headbutt : Attack() {
    override fun execute(): String{
        return "¡Cabezazo! ${baseDamage + 1}"
    }
}

class DoubleKick : Attack() {
    override fun execute(): String {
        return "¡Golpe Doble! ${baseDamage + 2}"
    }
}

class Fireball : Attack() {
    override fun execute() : String {
        return "¡Bola de fuego! ${baseDamage + 3}"
    }
}

fun main() {
    val attacks = mutableListOf(Headbutt(), DoubleKick(), Fireball())
    attacks.forEach{ println(it.execute())}
}