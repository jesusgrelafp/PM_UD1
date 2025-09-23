package practicas

// 1. Definición de la clase Task
data class Task(val title: String, val completed: Boolean = false)

// 2. Función de orden superior para filtrar tareas
fun filterTasks(tasks: List<Task>, criterio: (Task) -> Boolean): List<Task> {
    return tasks.filter(criterio)
}

// 3. Función de extensión para mostrar tareas
fun List<Task>.printTasks() {
    if (this.isEmpty()) {
        println("No hay tareas para mostrar")
    } else {
        for (task in this) {
            val status = if (task.completed) "[x]" else "[ ]"
            println("$status ${task.title}")
        }
    }
}

// 4. Función infix para comparar títulos de tareas
infix fun Task.sameTitleAs(other: Task): Boolean {
    return this.title == other.title
}

// 5. Programa principal
fun main() {
    // Creamos una lista de tareas
    val tasks = listOf(
        Task("Comprar pan"),
        Task("Estudiar lambdas"),
        Task("Practicar infix"),
        Task("Estudiar funciones de extensión", completed = true),
        Task("Ver Kotlin en YouTube", completed = true)
    )

    println("Todas las tareas:")
    tasks.printTasks()

    println()

    println("Tareas pendientes:")
    val pending = filterTasks(tasks) { !it.completed }
    pending.printTasks()

    println()

    println("Tareas completadas:")
    val finished = filterTasks(tasks) { it.completed }
    finished.printTasks()

    println()

    println("Comparación de títulos:")
    val t1 = tasks[0]
    val t2 = tasks[3]
    println("¿'${t1.title}' y '${t2.title}' tienen el mismo título? -> ${t1 sameTitleAs t2}")
}
