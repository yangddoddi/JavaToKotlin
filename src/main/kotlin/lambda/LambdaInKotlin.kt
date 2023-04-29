package lambda

import java.util.stream.Collectors

// 자바에서 함수는 변수에 할당되거나 파라미터로 전달할 수 없다. (2급 함수)
// 코틀린에서는 함수가 그 자체로 값이 될 수 있다. (1급 함수)
fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("사과", 2000),
        Fruit("사과", 2500),
        Fruit("바나나", 1000),
        Fruit("바나나", 2000),
        Fruit("바나나", 3000),
        Fruit("바나나", 4000),
        Fruit("바나나", 5000),
    )

    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "apple"
    }

    // 아무래도 많이 쓰게되는 형태
    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }

    // 기능은 같음
    isApple(fruits[0])
    isApple.invoke(fruits[0])

    // 함수도 타입 설정 가능
    val isApple3: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    filterFruits(fruits, isApple)

    // 선언하지 않고 익명함수로도 사용 가능
    filterFruits(fruits) { fruit -> fruit.name == "사과" }

    // 익명함수 파라미터가 하나인 경우 it으로 대체 가능
    filterFruits(fruits) {it.name == "사과"}

    // Closure
    // 코틀린은 람다가 시작하는 지점에 변수의 상태를 포획해서 가지고 있음
    var targetFruitName: String = "바나나"
    targetFruitName = "사과"
    filterFruits(fruits) { it.name == targetFruitName }
}

class Fruit(
    val name: String,
    val price: Int
)

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    return fruits
        .stream()
        .filter(filter)
        .collect(Collectors.toList())
}