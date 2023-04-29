package other

import collection_function.Fruit
import nullable.Person


// type alias
// 타입이 너무 길 때 줄이고 싶다.
typealias FruitFilter = (Fruit) -> Boolean
fun filterFruits(fruit: Fruit, filter: FruitFilter) {}

data class UltraSuperGuardianTrive(
    val name: String
)

typealias USGTMap = Map<String, UltraSuperGuardianTrive>
val usgtMap: USGTMap = mutableMapOf();


// as import
// 다른 패키지의 같은 이름 함수를 동시에 가져오고 싶다
// import com.kotlin.kiki.printHelloWorld as PrintHelloWorld1
// import com.kotlin.hihi.printHelloWorld as PrintHelloWorld2

data class Distructure(val name: String,
                       val age: Int)

class Distructure2(val name: String,
                   val age: Int) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

// 구조분해
fun main() {
    val distructure: Distructure = Distructure("하하", 20)
    // 이름을 인식하는 게 아니라 프로퍼티 순서대로 가져오는 것
    val (name, age) = distructure
    println("$name, $age")

// Jump
// in kotlin
// return : 기본적으로 가장 가까운 enclosing function 또는 익명함수로 반환
// break : 가장 가까운 루프가 제거
// continue : 가장 가까운 루프를 다음 step으로 보낸다
    // 단, forEach에서는 사용할 수 없음
    // 사용하고 싶을 경우 return@run
    // 그냥 안 쓰는 거 추천
    val numbers = listOf(1, 2, 3)
    numbers.map { number -> number + 1 }
        .forEach { number ->
            if (number == 3) {
                return@forEach
            }
            println(number) }

    // Label
    // 특정 expression에 라벨 이름 @를 붙여 하나의 라벨로 간주하고 break, continue, return 등을 사용
    // 역시나 유지보수가 어려워지므로 사용하지 않는 걸 추천
    loop@ for (i in 1..100) {
        for (j in 1 .. 100) {
            if ( j == 10 ) {
                // j 반복문이 아닌 i 반복문을 멈춘다.
                break@loop
            }
        }
    }

    // takeIf : 주어진 조건을 만족하면 그 값이, 아니면 null 반환
    fun getNumberOrNull(number: Int): Int? {
        return if (number <= 0) {
            null
        } else {
            number
        }
    }

    fun getNumberOrNullV2(number: Int): Int? {
        return number.takeIf { num -> num > 0 }
    }

    fun getNumberOrNullV3(number: Int): Int? {
        return number.takeUnless { num -> num > 0 }
    }
}
