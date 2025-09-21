package practicas
import kotlin.math.PI

interface Figura {
    fun calcularSuperficie(): Double
    fun calcularPerimetro(): Double
    fun tituloResultado() {
        println("Datos de la figura")
    }
}

class Cuadrado (val lado: Double) : Figura {
    override fun calcularSuperficie() = lado * lado
    override fun calcularPerimetro() = 4 * lado
    override fun tituloResultado() = println("Datos de la figura Cuadrado")
}

class Rectangulo (val lado1: Double, val lado2: Double) : Figura {
    override fun calcularSuperficie() = lado1 * lado2
    override fun calcularPerimetro() = 2 * lado1 + 2 * lado2
    override fun tituloResultado() = println("Datos de la figura Rectangulo")
}

class Circulo (val radio: Double) : Figura {
    override fun calcularSuperficie() = PI * radio * radio
    override fun calcularPerimetro() = 2 * PI * radio
    override fun tituloResultado() = println("Datos de la figura Circulo")
}

fun main() {
    val cuadrado1 = Cuadrado(10.0)
    cuadrado1.tituloResultado()
    println("Perímetro del cuadrado : ${cuadrado1.calcularPerimetro()}")
    println("Superficie del cuadrado : ${cuadrado1.calcularSuperficie()}")

    val rectangulo1 = Rectangulo(10.0, 5.0)
    rectangulo1.tituloResultado()
    println("Perímetro del rectángulo : ${rectangulo1.calcularPerimetro()}")
    println("Superficie del rectángulo : ${rectangulo1.calcularSuperficie()}")

    val circulo1 = Circulo(5.0)
    circulo1.tituloResultado()
    println("Perímetro del círculo: ${circulo1.calcularPerimetro()}")
    println("Superficie del círculo : ${circulo1.calcularSuperficie()}")


    // Polimorfismo
    // Aqui aplicamos polimorfismo. Tenemos un objeto de tipo interfaz llamado figuraIndeterminada.
    // Este objeto se puede comportar de diversas formas, dependiendo de la instancia que tenga metida en su interior

    // Comenta y descomenta las siguientes líneas para comprobarlo
    var figuraIndeterminada : Figura
    //figuraIndeterminada = cuadrado1;
    //figuraIndeterminada = rectangulo1;
    figuraIndeterminada = circulo1;

    figuraIndeterminada.tituloResultado()
    println("Perimetro de la figuraIndeterminada : ${figuraIndeterminada.calcularPerimetro()}")
    println("Superficie de la figuraIndeterminada : ${figuraIndeterminada.calcularSuperficie()}")

}
