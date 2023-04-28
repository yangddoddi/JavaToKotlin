package classes

// getter setter가 필요 없다
// body에 들어갈 내용이 없다면 생략 가능
// constructure에서 필드명을 지정할 수 있다
class KotlinPerson(
    name: String,
    var age: Int
    )
{
    init {
        if (age < 0) throw java.lang.IllegalArgumentException("나이는 0세 미만일 수 없습니다.")
    }

    // 추가적인 생성자를 정의할 수 있다.
    // 주 생성자는 반드시 존재해야 한다.
    constructor(name: String) : this(name, 1)

    // 부 생성자는 바디를 가질 수 있다.
    constructor() : this("히잉", 0) {
        println("헤헤")
    }

    // 초기화 블록 -> 첫번째 생성자 -> 두번째 생성자
    // 근데 코틀린은 default parameter를 권장한다
    // 차라리 팩토리 메서드를 쓰십시오

    fun isAdult() : Boolean = this.age >= 20

    // 직접 getter를 만들어서 함수처럼 사용할 수 있음 (CustomGetter)
    val isAdult2: Boolean
     get() = this.age >= 20
    // => get() { return this.age }

    // person.name을 호출 시 name -> getter -> field로 호출
    // get() = name.uppercase()는 무한루프 ( person.name -> getter -> name -> getter -> name.. )
    // backing field
    // 근데 이렇게 쓸 일 거의 없음
    var name = name
     get() = field.uppercase()
     set(value) {
         field = value.uppercase()
     }

    fun getUppercaseName(): String {
        return this.name.uppercase();
    }
}