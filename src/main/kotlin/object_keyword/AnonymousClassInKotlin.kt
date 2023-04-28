package object_keyword

interface AnonymousClassInKotlin {
    fun move()
    fun fly()
}

fun main() {
    moveSomeThing(object : AnonymousClassInKotlin {
        override fun move() {
            println("무브무브")
        }

        override fun fly() {
            println("난다요")
        }
    })
}

private fun moveSomeThing(move: AnonymousClassInKotlin) {
    move.move()
    move.fly()
}