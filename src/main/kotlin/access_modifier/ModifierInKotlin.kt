package access_modifier

/*
* 1. 코틀린의 protected는 선언된 클래스 및 하위 클래스에서만 사용 가능
* 2. 코틀린은 default가 없고, 아무런 접근 제어자가 없다면 public
* 3. internal은 같은 모듈에서만 접근 가능하다 (같이 컴파일되는 단위)
* 4. 코틀린은 하나의 코틀린 파일에 여러 함수 및 클래스를 한 번에 정의할 수 있다.
* 5. 생성자도 가시 범위와 동일하다, but 기본 생성자에 private을 붙이고 싶다면 class ClassName private constructor()
* 6. setter에만 접근제어자 적용 가능
* 7. 자바에는 internal이 없으므로 코틀린 internal이 무의미해진다
* 8. 자바에서는 같은 패키지의 protected를 사용할 수 있다
* */

val a = 3

fun add(a: Int, b: Int): Int {
    return a + b
}

class Cat private constructor(
    val name: String,
    _age: Int
) {
    var age = _age
     private set
}

class UtilityClass private constructor() {
    fun isDirectoryPath(path: String): Boolean {
        return path.endsWith("/")
    }
}

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}
