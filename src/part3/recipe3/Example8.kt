package part3.recipe3

import kotlin.test.assertFalse
import kotlin.test.assertTrue

fun main() {
    val p1 = Product("baseball", 10.0)
    val item1 = OrderItem(p1, 5)
    val item2 = item1.copy()

    assertTrue { item1 == item2 }
    assertFalse { item1 === item2 } // copy 함수로 생성한 OrderItem 은 서로 다른 객체
    assertTrue { item1.product == item2.product }
    assertTrue { item1.product === item2.product } // 두 OrderItem 인스턴스에 있는 Product 는 서로 같은 객체
}