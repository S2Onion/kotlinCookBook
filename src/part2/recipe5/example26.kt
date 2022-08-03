package part2.recipe5

fun main() {
    val number = 42
    (Character.MIN_RADIX..Character.MAX_RADIX).forEach { radix ->
        run {
            println("${radix}: ${number.toString(radix)}")
        }
    }
}

/**
 * radix 의 범위는 2~36
 */
