package part3.recipe6

fun main() {
    LateInitDemo().initializeName()
}

/**
 * 속성에 할당할 값의 정보가 충분하지 않는 경우가 있다.
 * 이것은 모든 객체가 생성될 때까지 의존성 주입이 일어나지 않는 의존성 주입 프레임워크에서 발생하거나
 * 유닛 테스트의 설정 메소드 안에서 발생한다.
 * 이러한 경우를 대비해 속성에 lateinit 변경자를 사용한다.
 *
 * 예를들어 스프링 프레임워크에서 의존성에 값을 할당하기 위해 @Autowired 어노테이션을 사용한다.
 * 값은 인스턴스가 이미 생성된 후에 설정되므로 이때 lateinit 으로 표기해야한다.
 */

/**
 * 예)
 * @Autowired
 * lateinit var repository: OfficerRepository
 */

/**
 * lateinit 은 var 키워드를 사용하여 선언헌 경우에만 사용할 수 있다.
 * lateinit 을 사용할 수 있는 속성 타입은 널 할당이 불가능한 타입이어야 하며 기본 타입 (Int, Boolean, Double 등)에는 적용할 수 없다.
 * getter, setter 를 정의할 수 없다.
 *
 * 클래스 내부에서 속성 레퍼런스의 isInitialized 를 사용하면 해당 속성의 초기화 여부를 확인할 수 있다.
 */