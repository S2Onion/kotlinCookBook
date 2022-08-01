package part2.recipe1

fun main() {
    var person = Person(first = "North", middle = "cook", last = "West")
    if (person.middle != null) {
        // val middleNameLength = person.middle.length // var 로 선언되어 있을 경우 Smart Cast 수행 불가능
        val middleNameLength = person.middle!!.length // 널이 아님을 단언
        println("middleNameLength=$middleNameLength")
    }
}