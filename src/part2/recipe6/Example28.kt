package part2.recipe6

import kotlin.math.pow

fun main() {
    val number = 2
    val powResult = number.toDouble().pow(8).toInt() // Float 또는 Double 로 변환하고 pow 호출

    if (powResult == 256) {
        println("Correct")
    } else {
        println("Wrong")
    }
}

/**
 * 코틀린 표준 라이브러리의 Float 와 Double 에는 확장 함수 pow 가 정의돼있지만
 * Int 나 Long 에는 상응하는 pow 함수가 없다
 * 그러므로 Float 또는 Double 로 변환하고 pow 호출한 후 다시 원래의 타입으로 되돌려줘야한다
 */
