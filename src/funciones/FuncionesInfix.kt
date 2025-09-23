package funciones
import kotlin.math.*

// Definida como función miembro de la clase
class Circle(val radius: Float, var x: Float, var y: Float) {

    infix fun collideWith(other: Circle): Boolean {
        val dx = this.x - other.x
        val dy = this.y - other.y
        val distance = sqrt(dx.pow(2) + dy.pow(2))
        return distance < this.radius + other.radius
    }
}

// Función infix definida como función de Extensión
class Circle2(val radius: Float, var x: Float, var y: Float)

private infix fun Circle2.collideWith(other: Circle2): Boolean {
    val dx = this.x - other.x
    val dy = this.y - other.y
    val distance = sqrt(dx.pow(2) + dy.pow(2))
    return distance < this.radius + other.radius
}


fun main() {
    val circle1 = Circle(5f, 10f, 10f)
    val circle2 = Circle(3f, 8f, 7f)

    println("¿Colisión?: ${circle1 collideWith circle2}")

    val circle21 = Circle2(5f, 10f, 10f)
    val circle22 = Circle2(3f, 8f, 7f)

    println("¿Colisión?: ${circle21 collideWith circle22}")
}