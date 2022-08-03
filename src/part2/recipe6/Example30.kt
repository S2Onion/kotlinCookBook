package part2.recipe6

import part2.recipe6.infix.pow
import kotlin.math.pow

fun main() {
    val number = 2

    if (number.pow(8) == (number.toDouble().pow(8).toInt())) {
        println("Correct")
    } else {
        println("Wrong")
    }
}
