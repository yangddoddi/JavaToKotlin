package object_keyword

import classes.KotlinPerson

// 코틀린에는 static 키워드가 없음 -> companion object (클래스와 동행하는 유일한 오브젝트)
// const -> 컴파일 시점에 할당됨(진짜 상수)
class KotlinPerson private constructor (
    var name: String,
    var age: Int
) {
    // 객체로 간주된다 -> 이름을 붙일 수도 있고 상속도 받을 수 있음
    // 자바에서 사용 시 -> (이름이 없을 때) KotlinPerson.Companion.newBaby("DD");
    //                 (이름이 있을 때) KotlinPerson.이름.newBaby("DD");
    companion object {
        private const val MIN_AGE = 1
        fun newBaby(name: String): classes.KotlinPerson {
            return KotlinPerson(name, MIN_AGE)
        }
    }
}