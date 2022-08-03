package part2.recipe9

fun main() {
    val pair = "a" to 100
    val (x, y) = pair

    if(x != "a"){
        println("wrong x")
    } else if (y != 100) {
        println("wrong y")
    } else {
        println("Correct")
    }
}
