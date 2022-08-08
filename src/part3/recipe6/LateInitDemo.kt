package part3.recipe6

class LateInitDemo {
    private lateinit var name: String

    fun initializeName() {
        println("Before assignment: ${::name.isInitialized}") // 초기화 여부 확인
        name = "World"
        println("Before assignment: ${::name.isInitialized}")
    }
}