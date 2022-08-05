package part3.recipe3

fun main() {
    val p1 = Product("baseball", 10.0)
    val p2 = Product("baseball", 10.0, false)

    if (p1 == p2) {
        println("p1 == p2 true")
    }
    if (p1.hashCode() == p2.hashCode()) {
        println("p1.hashCode == p2.hashCode() true")
    }

    val p3 = Product(price = 10.0, onSale = false, name = "baseball")
    val products = setOf(p1, p3) // p1 과 p3는 동일하기 때문에 하나만 추가된다

    println("products size is ${products.size}")
}