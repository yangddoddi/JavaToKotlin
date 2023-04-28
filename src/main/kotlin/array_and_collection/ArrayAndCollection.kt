package array_and_collection

fun main() {
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println(array[i])
    }

    for ((idx, value) in array.withIndex()) {
        println("$idx 하하, $value")
    }

    // 불변 리스트
    val numbers = listOf(100, 200)

    // 비어있는 리스트
    // 타입 추론이 불가능하므로 직접 타입을 적어야함
    val empty = emptyList<String>()

    // 추론이 가능한 경우에는 역시나 타입 필요 x
    printAllNumbers(emptyList())

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx, $value")
    }

    // 가변 리스트
    val mutableList = mutableListOf(100, 200)
    mutableList.add(100)
    mutableList.add(200)

    // 불변 set
    val numberSet = setOf(1, 2, 3)

    for (number in numberSet) println(number)

    // 가변 set
    val mutableNumberSet = mutableSetOf(1, 2, 3)

    val numberMap = mutableMapOf<Int, String>()
    numberMap.put(1, "일")
    numberMap[2] = "이"

    val stringMap = mutableMapOf<String, Int>()
    stringMap["하하"] = 1

    // 불변 맵
    val immutableMap = mapOf(1 to "히히", 2 to "편하다")

    // 컬렉션의 null 가능성
    // List<Int?> 리스트에 널이 들어갈 수 있으나, 리스트는 널이 아님
    // List<Int> 리스트에 null이 들어갈 수 없으나, 리스트가 널일 수 있음
    // List<Int?>? 리스트도 내부 자료도 널일 수 있음

    // 자바는 nullable, non-nullable을 구변하지 않음 -> 자바에서는 그냥 넣을 수 있음
    // 자바는 가변 불변 컬렉션 구별하지 않음
    // 해결책 -> 그냥 미리 감안해야함
    // 아니면 코틀린에서 unmodifiable 메서드 사용

    // 자바에서 List<Integer>를 보내면 코틀린은 그게 List<Int?>?인지 여부를 알 수 없음
}
fun printAllNumbers(list: List<Int>) {

}