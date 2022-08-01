package part2.recipe1

fun main() {
    var person = Person(first = "North", middle = "cook", last = "West")
    if (person.middle != null) {
        // val middleNameLength = person.middle.length // var 로 선언되어 있을 경우 Smart Cast 수행 불가능
        val middleNameLength = person.middle!!.length // 널이 아님을 단언
        println("middleNameLength=$middleNameLength")
    }
}

/**
 * 널 아님 단언 연산자 !! 가 하나라도 있다면 이는 코드 스멜 (Code smell) 이다.
 * '코드 스멜' 은 잠재적으로 문제가 있는 코드를 말한다.
 * 널 값에 !! 연산자를 사용하는 것은 코틀린에서 NullPointerException 을 만날 수 있는 몇가지 상황 중 하나이므로
 * 가능하면 사용하지 않도록 노력한다.
 */