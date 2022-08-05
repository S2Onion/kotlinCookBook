package part3.recipe4

import kotlin.test.assertEquals

fun main() {
    val customer = Customer("Fred").apply { messages } // apply 블록에서 messages 호출은 messages 를 불러오고 로딩 완료 정보를 출력하는 getter 메소드를 호출
    println("Check result")
    assertEquals(3, customer.messages.size)

//    val customer = Customer("Fred")
//    println("Check result")
//    assertEquals(3, customer.messages.size)
}