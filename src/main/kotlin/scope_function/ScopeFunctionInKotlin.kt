package scope_function

import classes.KotlinPerson
import nullable.Person

// scope function : 일시적인 영역을 생성하는 함수

fun printPerson(person: KotlinPerson?) {
    println(person?.name ?: "null")
}

fun printPerson2(person: KotlinPerson?) {
    // 함수를 받아서 함수를 반환한다
    person?.let {
        println(it.name)
        println(it.age)
    }
}
    // (확장함수) let, run : 람다의 결과 반환 ---- also, apply : 객체 반환
    //         let, also : it  ---- run, apply: this
    // this : 생략이 가능, 다른 이름 붙일 수 없음
    // it : 생략 불가능, 다른 이름 붙일 수 있음
    // 무슨 차이? let은 일반 함수를 인자로 받음
    //          run은 확장 함수를 인자로 받음

   // with : this를 사용해서 접근 + 확장함수도 아님

fun main() {
    // 언제 어떤 걸 사용하는가?
    // let -> 1. 하나 이상의 함수를 callChain 결과로 호출할 때
    //        2. non-null 값에 대해서만 코드 블럭을 실행할 때
    //        3. 일회성으로 제한된 영역에 지역 변수 만들 때
    val strings = listOf("apple", "car")
    strings.map { it.length }
        .filter { it > 3 }
        .let{ println(it) }

    var string: String = "dd"
    val length = string?.let {
        println(it.uppercase())
        it.length
    }

    val numbers = listOf(1, 2, 3)
    numbers.first()
        .let { firstItem ->
            if (firstItem >= 5) println(firstItem)
        }.toString().uppercase()


    // run -> 1. 객체 초기화와 반환 값 계산을 동시에 할 때
    //          -> 근데 굳이 이렇게 쓸 필요가 있을까요
//    val person1 = Person("양은찬",20).run { personRepository::save }
//    val person2 = Person("양은찬, 30).run {
//            isNormalUser = true
//            personRepository.save(this) }

    // apply -> 객체 설정 시 객체 수정 로직이 call chain 중간에 필요할 때
//    fun createPErson(
//        name: String,
//        age: Int,
//        hobby: String
//    ): Person {
//        return Person(name = name, age = age)
//            .apply {
//                this.hobby = hobby
//            }
//    }

    // also -> 객체를 수정하는 로직이 callChain 중간에 필요할 때
    mutableListOf(1, 2, 3)
        .also { println("1, 2, 3") }
        .add(4)

    // with -> 특ㄷ정 객체를 다른 객체로 변환해야 하는데, 모듈간 의존성에 의해 정적 팩토리 혹은 toClass 함수를 만들기 어려울 때
}