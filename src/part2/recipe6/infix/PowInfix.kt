package part2.recipe6.infix

import kotlin.math.pow


/**
 * 거듭제곱 계산을 위한 중위 연산자 infix 정의
 */

infix fun Int.pow(x: Int): Int {
    return this.toDouble().pow(x).toInt()
}

infix fun Long.pow(x: Int): Long {
    return this.toDouble().pow(x).toLong()
}
