package part3.recipe1

class Task(val name: String, _priority: Int = DEFAULT_PRIORITY) {
    companion object {
        const val MIN_PRIORITY = 1
        const val MAX_PRIORITY = 5
        const val DEFAULT_PRIORITY = 3
    }

    var priority = validPriority(_priority)
        set(value) {
            field = validPriority(value)
        }

    private fun validPriority(p: Int) =
        p.coerceIn(MIN_PRIORITY, MAX_PRIORITY) // 주어진 범위로 값 제한, 값이 범위 안에 있으면 해당 값을, 값이 범위 안에 없으면 경계값을 리턴
}

/**
 * val : 런타임 시점에 할당 (기본, 참조 타입 할당 가능)
 * const val : 컴파일 시점에 할당 (문자열과 기본 타입 할당 가능)
 */
