package elementos_basicos

fun main() {

/*
    var noAceptaNull: String
    noAceptaNull = null  //Kotlin: Null cannot be a value of a non-null type 'String'.

    var aceptaNull: String?
    aceptaNull = null
 */
/*
    var cardName = "Animal compañero" // :String
    cardName = null
*/
/*
    var password: String? = null
    password = "mipass"
    val passwordSize = password?.length

    if( passwordSize == null ) {
        println("password is null")
    } else {
        println("El tamaño de la password es $passwordSize")
    }

    val passwordSize2 = if (password!=null) password.length else 0
    // Esto equivale a:
    val passwordSize3 = password?.length ?: 0

*/

    val counter: Int? = null
    counter!!.dec()

    // retorna NullPointerException
    print(counter)

}

fun showBeastsList(beasts: List<String>?) {
    if ( beasts != null && beasts.isNotEmpty()) {
        beasts.forEach { println(it) }
    }
}
