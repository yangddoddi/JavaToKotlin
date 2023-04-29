package fp_function


fun main() {

}

fun createPerson(firstNAme: String, lastName: String): String {
    if (firstNAme.isEmpty()) throw java.lang.IllegalArgumentException()

    if (lastName.isEmpty()) throw java.lang.IllegalArgumentException()

    return "$lastName $firstNAme"
}

// 함수 내부에서만 함수를 사용하고 싶을 때
// 근데 depth가 깊어짐 ㅅㄱ
fun crㄱatePerson2(firstNAme: String, lastName: String): String {
    fun validateName(name: String) {
        if (name.isEmpty()) throw java.lang.IllegalArgumentException()
    }

    validateName(firstNAme)
    validateName(lastName)

    return "$lastName $firstNAme"
}