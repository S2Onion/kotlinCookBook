package part2.recipe1

fun main() {
    var person = Person(first = "North", middle = null, last = "West")
    val middleNameLength = person.middle?.length // 안전 호출 연산자 사용, 결과 타입은 Int? 이다
    println("middleNameLength=$middleNameLength")
}
