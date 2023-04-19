package nullable

import java.util.IllegalFormatException

fun main() {
    val person1 = Person(null);
    val person2 = Person("yang");

    startsWithA(person1.name);

    // ?가 없는 인자에 @Nullable이 있는 필드를 넣으려고하면 컴파일 에러
    // 만약 @NotNull, @Nullable 모두 없다면 컴파일 에러 발생 x 런타임 에러
    // 코틀린에서 자바 코드 사용할 때는 그냥 안전하게 ? 처리하자.
    startsWithA7(person2.name);
}

fun startsWithA(str : String?) : Boolean {
    if (str == null) throw IllegalArgumentException("null")

    return str.startsWith("A");
}

fun startsWithA1(str : String?) : Boolean? {
    if (str == null) return null;

    return str.startsWith("A");
}

fun startsWithA2(str : String?) : Boolean {
    if (str == null) return false;

    return str.startsWith("A");
}

// safe call
fun startsWithA3(str : String?) : Boolean? {
    // null이 아니면 startsWith를 실행, 아니라면 null 반환
    return str?.startsWith("A");
}

// elvis 연산자
fun startsWithA4(str : String?) : Boolean {
    // str이 null이면 false 반환
    return str?.startsWith("A") ?: false;
}

// elvis 연산자
fun startsWithA5(str : String?) : Boolean {
    // str이 null이면 throw
    return str?.startsWith("A") ?: throw IllegalArgumentException("null");
}

fun calculate(num: Long?) : Long {
    // if 어쩌고 저쩌고 안 써도 됨
    num ?: return 0L;

    return num + 10L;
}

// null 아님을 단언
// null이 들어오면 NPE
fun startsWithA6(str : String?) : Boolean {
        return str!!.startsWith("A");
}

fun startsWithA7(str : String) : Boolean {
        return str.startsWith("A");
}