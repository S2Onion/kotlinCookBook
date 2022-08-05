package part3.recipe4

import kotlin.test.assertEquals

fun main() {
    val customer = Customer2("Fred").apply { messages }
    println("Check result")
    assertEquals(3, customer.messages.size)
}