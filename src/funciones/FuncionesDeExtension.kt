package funciones

fun Boolean.adverb() = if (this) "SI" else "NO"

class Student(val name: String, val age: Int)
class Course(val students: List<Student>) {
    // Definición típica para el metodo de una clase
    fun olderStudentAge() = students.maxOf { it.age }
    fun studentsWithInitial(initial: Char) =
        students.filter {
            it.name[0] == initial
        }.size
}

// Como función de extensión expresada con cuerpo de código
fun Course.olderStudentAge2(): Int {
    return students.maxOf { it.age }
}
// Como función de extensión con sintaxis de única expresión
fun Course.olderStudentAge3() = students.maxOf { it.age }


// Como función de extensión expresada con cuerpo de código
fun Course.studentsWithInitial2(initial: Char): Int {
    return students.filter { it.name[0] == initial }.size
}
// Como función de extensión con sintaxis de única expresión
fun Course.studentsWithInitial3(initial: Char) =
    students.filter {
        it.name[0] == initial
    }.size


fun main() {

    val a = 4; val b = 3
    println("¿$a es mayor que $b?: ${(a > b).adverb()}")

    // Probando las dos nuevas funciones de Course
    val course = Course(listOf(
        Student("María", 17),
        Student("Rupertina", 25),
        Student("Ricardina", 18)
    ))

    println("------")
    println("La mayor tiene ${course.olderStudentAge()}")
    println("Estudiantes cuyo nombre empieza con R: " +
            "${course.studentsWithInitial('R')}")

    println("------")
    println("La mayor tiene ${course.olderStudentAge2()}")
    println("Estudiantes cuyo nombre empieza con R: " +
            "${course.studentsWithInitial2('R')}")

    println("------")
    println("La mayor tiene ${course.olderStudentAge3()}")
    println("Estudiantes cuyo nombre empieza con R: " +
            "${course.studentsWithInitial3('R')}")

}