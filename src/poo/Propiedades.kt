package poo
class Animal2 (val name: String, val age: Int) {

    // getter personalizado
    val isOlderThanOne1: Boolean
        get() {
            return this.age > 1
        }

    // Funcion con cuerpo de expresión al devolver un solo valor
    val isOlderThanOne2: Boolean
        get() = this.age > 1

    // Omitiendo tipos
    val isOlderThanOne3
        get() = this.age > 1

    var overWeight = false

    var weight = 0.0
        set(value) {
            // Se utiliza field para acceder al valor actual
            // No se puede usar this.weight porque entrariamos
            // en una recursividad infinita
            field = value        // Asigna al backing field
            overWeight = value > 100
        }
        get() {
            return field         // Devuelve el backing field
        }

}

fun main() {
    //Getter personalizado
    val animal = Animal2("Chimpi",2)
    println(animal.isOlderThanOne1)
}