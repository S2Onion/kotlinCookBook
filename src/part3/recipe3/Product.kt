package part3.recipe3

data class Product(
    val name : String,
    var price: Double,
    var onSale: Boolean = false
)

/**
 * equals, hashCode, toString 등이 갖춰진 엔티티 클래스를 만들때 data 를 사용한다.
 *
 */