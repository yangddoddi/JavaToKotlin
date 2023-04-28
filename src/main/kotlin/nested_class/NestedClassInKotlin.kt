package nested_class

// 그냥 내부 class를 생성하면 그게 static이다.
class NestedClassInKotlin(
    val address: String,
    val livingRoom: LivingRoom
) {
    class LivingRoom(
        val area: Double
    )

    // 외부 클래스를 참조하는 내부 클래스를 생성하려면 inner 키워드를 사용해야함.
    inner class LivingRoom2() {
        fun print() {
            println(this@NestedClassInKotlin.address)
        }
    }
}