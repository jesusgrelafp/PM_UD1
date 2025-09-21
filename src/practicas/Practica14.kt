package practicas
fun main() {
    println("Prueba de la clase CalculadoraBase")
    val calculadora1 = CalculadoraBase(10.0, 2.0)
    println("Resultado suma: " + calculadora1.sumar())

    println("Prueba de la clase CalculadoraCientifica (suma de dos números y el cuadrado y la raíz del primero)")
    val calculadoraCientifica1 = CalculadoraCientifica(10.0, 2.0)
    println("Resultado suma científica: " + calculadoraCientifica1.sumar())
    println("Resultado cuadrado: " + calculadoraCientifica1.cuadrado())
    println("Resultado raíz: " + calculadoraCientifica1.raizCuadrada())
}
