package poo

class Animal(
    val name: String,
    var age: Int)
{
    val isOlderThanOne
        get() = this.age > 1  // Getter modificado

    var overWeight = false    // Propiedad normal (con field automático)
        private set           // Setter privado, getter público. Se puede leer desde
                              // fuera de la clase pero solo se puede modificar desde
                              // dentro de la clase (ENCAPSULACIÓN)
    var weight = 0.0
        set(value) {
            field = value             // Asigna al backing field
            overWeight = value > 100  // Lógica adicional
            println("$name ahora pesa $value kg")
        }
        get() {
            println("Consultando peso de $name: $field kg")
            return field              // Devuelve el backing field
        }
}

fun main() {
    val animal = Animal("Rex", 3)

    animal.weight = 80.0  // Llama al setter
    // SET: Rex ahora pesa 80.0 kg

    println(animal.weight) // Llama al getter
    // GET: Consultando peso de Rex: 80.0 kg
    println("¿Está sobrepeso? ${if (animal.overWeight) "SI" else "NO"}") // false

    animal.weight = 120.0  // Actualiza y activa flag overweight
    println("¿Está sobrepeso? ${if (animal.overWeight) "SI" else "NO"}") // true
}