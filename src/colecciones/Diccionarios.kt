package colecciones

fun main() {
    // Mapas INMUTABLES
    var userSettings: Map<String,String> = mapOf(
        "name" to "Catrina",
        "language" to "Español",
        "logo" to "logo.png",
        Pair("website","www.site.com"),
    )
    println(userSettings)

    println(userSettings.size) // 4
    println(userSettings.entries) // [name=Catrina, language=Español, logo=logo.png, website=www.site.com]
    println(userSettings.keys) // [name, language, logo, website]
    println(userSettings.values) // [Catrina, Español, logo.png, www.site.com]


    println(userSettings["logo"]) // logo.png
    println(userSettings.get("web")) // null. No existe la clave es website
    println(userSettings.getOrDefault("email", "Sin email")) // Sin email
    println(userSettings.isEmpty()) // false
    println("name" in userSettings) // true
    println("name" in userSettings.keys) // true
    println("Español" in userSettings.values ) // true


    // Mapas MUTABLES
    val booksMap = mutableMapOf(
        "Sinsajo" to 2010,
        "Yo, Robot" to 1950,
        "Crimen y castigo" to 1935,
        "Cien años de soledad" to 1991
    )

    println(booksMap)

    booksMap.put("La maquina del tiempo", 1890)
    booksMap["La maquina del tiempo"] = 1890
    println(booksMap)

    booksMap.remove("Sinsajo")
    println(booksMap)

    // Borrar entradas en la q coincidan clave y valor
    println(booksMap.remove("Cien años de soledad", 2015)) // false

    // Recorrer un mapa
    val operationsMap = mapOf(
        "Suma" to "+",
        "Resta" to "-",
        "Multiplicación" to "*",
        "División" to "/"
    )

    // Recorrer con función lambda
    operationsMap.forEach { (k,v) -> println("clave = $k y valor $v") }

    // Con bucle for desestructurando
    for ((k,v) in operationsMap) {
        println("clave = $k y valor $v")
    }


    //Funcion any
    // Necesitamos determinar si hay elementos que están agotándose (unidades menores a 10)
    // y si el nombre contiene el String "ch"
    val items = mapOf(
        "Pastel" to 1,
        "Pan tajado" to 100,
        "Leche" to 9,
        "Salchicas" to 15
    )
    println(items.any { it.value < 10 && "ch" in it.key}) // true

}