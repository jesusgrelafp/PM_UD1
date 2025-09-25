package practicas

data class Empleado(val nombre: String, val salario: Double, val departamento: String)

fun procesarEmpleados(empleados: List<Empleado>,operacion: (List<Empleado>) -> Any): Any {
    return operacion(empleados)
}


fun main() {

    val empleados = listOf(
        Empleado("Ana", 3000.0, "Ventas"),
        Empleado("Luis", 2400.0, "IT"),
        Empleado("Carla", 2800.0, "Ventas"),
        Empleado("Pedro", 1800.0, "IT"),
        Empleado("Lucía", 3200.0, "Marketing")
    )

    val mayorSalario = procesarEmpleados(empleados) {
        it.maxByOrNull { e -> e.salario }?.nombre ?: "Nadie"
    }
    println("Empleado con mayor salario: $mayorSalario")

    val promedioVentas = procesarEmpleados(empleados) {
        val ventas = it.filter { e -> e.departamento == "Ventas" }
        ventas.map { e -> e.salario }.average()
    }
    println("Promedio salario en Ventas: $promedioVentas")

    val altosSueldos = procesarEmpleados(empleados) {
        it.filter { e -> e.salario > 2500.0 }.map { e -> e.nombre }
    }
    println("Empleados con sueldo > 2500€: $altosSueldos")

    val agrupados = procesarEmpleados(empleados) {
        it.groupBy { e -> e.departamento }
    }
    println("Empleados agrupados por departamento: $agrupados")

}