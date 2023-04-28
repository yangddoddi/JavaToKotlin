package classes

fun main() {
    val kotlinPerson = KotlinPerson("양은찬", 7)

    println(kotlinPerson.name)
    println(kotlinPerson.age)

    kotlinPerson.age = 100

    println(kotlinPerson.age)

    val javaPerson = JavaPerson("김만두", 10)

    println(javaPerson.name)
    println(javaPerson.age)

    javaPerson.age = 0

    println(javaPerson.age)

    val baby = KotlinPerson("응애")
    println(baby.age)

    val unkown = KotlinPerson()

    println(baby.isAdult())
}