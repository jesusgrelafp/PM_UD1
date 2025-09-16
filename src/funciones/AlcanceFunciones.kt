package funciones

// Funciones miembro
class Print{
    fun memberPrint() = println("Función miembro")
}

fun main(){
    Print().memberPrint()

    // Funciones Locales
    fun localPrint() = println("Función local")
    localPrint()
}



