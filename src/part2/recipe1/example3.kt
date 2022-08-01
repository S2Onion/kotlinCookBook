package part2.recipe1

fun main() {
    val person = Person(first = "North", middle = null, last = "West")
    if (person.middle != null) {
        val middleNameLength = person.middle.length // Null 할당이 불가능한 문자열 타입으로 Smart Cast 수행
        println("middleNameLength=$middleNameLength")
    }
}