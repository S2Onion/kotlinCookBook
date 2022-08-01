package part2.recipe1

fun main() {
    var person = Person(first = "North", middle = null, last = "West")
    val middleNameLength = person.middle?.length ?: 0 // 안전 호출 연산자와 엘비스 연산자(?:) 를 변행해서 사용, 결과 타입은 Int
    println("middleNameLength=$middleNameLength")
}
