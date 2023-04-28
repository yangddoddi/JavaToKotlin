package fp_function

fun main() {
    val str = "ABC"
    println(str.lastChar())
}

// String을 확장한 함수
// 마치 멤버 함수인 것처럼 사용 가능
// 수신 객체 타입(String) + 수신 객체(this_
fun String.lastChar(): Char {
    return this[this.length - 1]
}

// 확장 함수가 public이고 확장 함수에서 수신 객체 클래스의 private 함수를 가져오면 캡슐화가 깨지는 것이낙?
// -> 확장 함수는 클래스에 있는 private, protected 함수를 호출할 수 없다

// 멤버 함수와 확장 함수의 시그니처가 같다면?
// -> 멤버 함수를 호출한다
// -> 확장 함수를 만들었는데 똑같은 시그니처의 함수가 생기면 오류 발생 가능
// -> 해당 인스턴스의 현재 타입(정적인 타입)을 기준으로 적용됨