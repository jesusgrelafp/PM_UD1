package control_flujo

fun main() {
    for (i in 1..20) {
        if (i % 4 != 0) {
            continue
        }
        println(i)
    }

/*
    Loop@ for(i in 1..5){
        for (j in 1..7) {
            if (ifCondition) {
                continue@Loop
            }
            /*Sentencias saltadas*/
        }
        /*Sentencias saltadas*/
    }

*/

    Loop@ for (d in "Develou") {
        for (k in "Kotlin") {
            if (d.code.toByte() + k.code.toByte() > 180) {
                continue@Loop
            }
            print("($k,$d)")
        }
        println()
    }
}