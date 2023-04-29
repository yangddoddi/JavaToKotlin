package collection_function

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long
)

fun main() {
    val fruits: List<Fruit> = mutableListOf(
        Fruit(1, "사과", 500, 2000),
        Fruit(2, "사과", 1000, 3000),
        Fruit(3, "사과", 2000, 4000),
        Fruit(4, "사과", 3000, 5000),
        Fruit(5, "바나나", 1000, 6000),
        Fruit(6, "바나나", 2000, 7000),
        Fruit(7, "바나나", 3000, 8000),
        Fruit(8, "바나나", 4000, 9000),
    )

    val apples = fruits.filter { fruit -> fruit.name == "사과" }
        .filter { fruit -> fruit.currentPrice <= 3000 }
        .toList()

    fruits.filter { fruit -> fruit.name == "바나나" }
        .mapIndexed { idx, fruit -> println("$idx, $fruit") }

    // filter/ filterIndexed/ map/ mapIndexed/ mapNotNull

    val appleFilter: (Fruit) -> Boolean = { fruit -> fruit.name == "사과" }
    val appleFactoryPrice = fruits.filter(appleFilter)
        .sumOf { fruit -> fruit.factoryPrice }

    // 모두 apple이면 true, 아니면 false
    val isAllApple = fruits.all(appleFilter)

    // 하나라도 사과가 있다면 false
    val isAllBanana = fruits.none(appleFilter)

    // 하나라도 사과라면 true
    fruits.any(appleFilter)

    // 과일 개수
    val fruitCount = fruits.count()

    // sort
    // 오름차순
    fruits.sortedBy { fruit -> fruit.currentPrice }
    // 내림차순
    fruits.sortedByDescending { fruit -> fruit.currentPrice }

    // 변형된 값을 기준으로 중복 제거
    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }

    // first 첫번째 값을 가져옴 -> null인 경우 exception
    // firstOrNull -> 첫번째 값 혹은 널
    fruits.first()
    fruits.firstOrNull()
    fruits.last()
    fruits.lastOrNull()

    // List To Map
    // value에 리스트 형태로
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    // value를 단일 객체로 (일반저긍로 중복되지 않는 키로 매핑할 때)
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }
    // 과일 이름 -> List<출고가> 맵이 필요하면?
    val map3: Map<String, List<Long>> = fruits.groupBy({ fruit -> fruit.name }, { fruit -> fruit.factoryPrice })
    // 과일 id -> 출고가 맵이 필요하면?
    val map4: Map<Long, Long> = fruits.associateBy({ fruit -> fruit.id }, { fruit -> fruit.factoryPrice })
    // Map도 이어서 필터링하거나 알아서

    val fruits2: List<List<Fruit>> = mutableListOf(
        mutableListOf(Fruit(1, "사과", 500, 2000),
            Fruit(2, "사과", 1000, 3000),
            Fruit(3, "사과", 2000, 4000)),
        mutableListOf( Fruit(4, "사과", 3000, 5000),
            Fruit(5, "바나나", 1000, 6000),
            Fruit(6, "바나나", 2000, 7000),
            Fruit(7, "바나나", 3000, 8000),
            Fruit(8, "바나나", 4000, 9000))
    )
    // 출고가와 현재가가 동일한 과일 찾기
    val samePriceFruits: List<Fruit> = fruits2.flatMap { list -> list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice } }
}