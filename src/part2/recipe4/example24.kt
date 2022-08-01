package part2.recipe4

import part2.recipe1.Person

fun main() {
    val intVar: Int = 3
    // val langVar: Long = intVar // 컴파일되지 않음
    val longVar: Long = intVar.toLong()
    println("longVar=$longVar")

    val longSum: Long = 3L + intVar // 더하기 연산자는 자동으로 intVar 의 값을 long 으로 변환하고 long 리터럴에 그 값을 더한다.
    println("longSum=$longSum")
}

/**
 * 사용 가능한 타입 변환 메소드
 * toByte() : Byte
 * toChar() : Char
 * toShort() : Short
 * toInt() : Int
 * toLong() : Long
 * toFloat() : Float
 * toDouble() : Double
 */