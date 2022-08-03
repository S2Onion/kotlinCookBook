package part2.recipe5

fun main() {
    val number = 42
    val binaryStr = number.toString(2) // 2진수 String 값으로 출력
    println("binaryStr==${binaryStr}")

    if ("101010" == binaryStr) { // Java 와는 다르게 String 비교도 '==' 로 한다.
        println("Correct")
    } else {
        println("Wrong")
    }
}
