package types

import nullable.Person

fun main() {
    val number1 = 3 // int
    val number2 = 3L // long
    val number3 = 3.0f // float
    val number4 = 3.0 // double

    // 코틀린에서 타입 변환은 명시적으로 이루어진다.
    val number5:Long = number1.toLong()
    val number6:Float = number2.toFloat()
    val number7:Double = number2.toDouble()

    // nullable 처리
    val number8:Int? = 3;
    val number9 = number8?.toLong() ?: 0L

    val person = Person("yang");
    val log = "제 이름은 ${person.name}입니다." +
            "제 키는 ${number1}입니다."

    val log2 = """
        제 이름은 ${person.name}입니다.
        제 키는 ${number1}입니다.
    """.trimIndent()

    var firstStr = person.name[0]
    var secondStr = person.name[1]
    var thirdStr :Char? =
        person
        .name
        .takeIf {it.length > 19}
        ?.get(19)
        ?: throw java.lang.IllegalArgumentException("넘었삼");

}

// as -> null일 경우 NPE
// as? -> null일 경우 Null

// Any -> Java의 Object 역할
//        equals, hashCode, toString 존재

// Unit -> Java의 void
//         void 자체를 타입 인자로 사용 가능함
// 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입이라는 의미

// Noting -> 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
//           무조건 예외를 반환하는 함수 / 무한 루프하는 함수
fun printNameIfPerson(obj : Any?) {
    // is == instanceOf
    if (obj is Person) {
        // as : 간주함 -> 근데 안 쓰고 obj.person 가능
        val person = obj as? Person;
        println(person?.name ?: "이름이 null임");
    }

    if (obj !is Person) {
        println("not person");
    }
}