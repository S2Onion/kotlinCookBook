package part3.recipe7

class Customer(val name: String) {

    /**
     * IntelliJ 자동 완성 기능을 이용한 equals 생성
     */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true // 주소 값을 비교 (레퍼런스 동등성 확인)
        if (javaClass != other?.javaClass) return false // 같은 타입인지 확인

        other as Customer

        if (name != other.name) return false

        return true
    }
}