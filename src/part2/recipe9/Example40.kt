package part2.recipe9

fun main() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    if(map.containsKey("a")){
        println("map has key a")
    } else {
        println("wrong")
    }

    if(map.containsValue(3)){
        println("map has value 3")
    } else {
        println("wrong")
    }
}
