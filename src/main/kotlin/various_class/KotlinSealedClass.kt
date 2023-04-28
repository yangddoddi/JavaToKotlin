package various_class

// 컴파일 타임 때 하위 클래스 타입을 모두 기억함
// 런타임 시점에 클래스 타입이 추가될 수 없음
// 하위 클래스는 같은 패키지에 있어야함

// Enum과 다른 점
// 클래스를 상속 받을 수 있다
// 하위 클래스는 멀티 인스턴스가 가능하다
sealed class KotlinSealedClass
