package part3.recipe4

class Customer2(val name: String) {

    val messages: List<String> by lazy { loadMessages() }

    /**
     * lazy 를 사용하는 경우 var 사용이 불가
     * 호출시점에서 최초 1회 초기화
     * 호출시점에서 초기화가 이루어짐으로 late loading (지연로딩)
     */

    private fun loadMessages(): MutableList<String> =
        mutableListOf(
            "Initial contact",
            "Convinced them to use Kotlin",
            "Sold training class. Sweet."
        ).also { println("Loaded messages") }
}