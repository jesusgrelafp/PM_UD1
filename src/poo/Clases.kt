package poo

fun main () {
    val plane = Plane()
    plane.moveRight()
    plane.moveRight()
    plane.moveDown()
    plane.moveUp()
    plane.moveLeft()

    println("Posición actual del avión: (${plane.x},${plane.y})")
}

class Plane{
    var x: Int = 0
        private set
    var y: Int = 0
        private set
    fun moveLeft() {
        x -= if(x == 0) 0 else 1
    }
    fun moveRight() {
        x += if(x == 300) 0 else 1
    }
    fun moveUp() {
        y -= if(y == 0) 0 else 1
    }
    fun moveDown() {
        y += if(y == 300) 0 else 1
    }
}
