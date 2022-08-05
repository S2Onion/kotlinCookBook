package part3.recipe3

import kotlin.test.assertEquals
import kotlin.test.assertFalse

fun main() {
    val p = Product("baseball", 10.0)

    val (name, price, sale) = p // Product 구조 분해

    assertEquals(p.name, name)
    assertEquals(p.price, price)
    assertFalse { sale }
}