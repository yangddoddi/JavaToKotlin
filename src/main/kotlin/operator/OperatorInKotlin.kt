package operator

fun main() {
    val javaMoney1 = JavaMoney(10000)
    val javaMoney2 = JavaMoney(20000)
    val javaMoney3 = javaMoney1;
    val javaMoney4 = JavaMoney(10000);

    // 객체를 비교할 때 자동으로 비교연산자를 사용할 수 있음
    if (javaMoney2 > javaMoney1) println("compareTo를 자동으로 호출해줌")

    if (javaMoney1 === javaMoney3) println("동일성")

    if (javaMoney1 == javaMoney4) println("동등성")

    val numList : List<Long> = arrayListOf(1, 2)
    println("1이 numList에 포함되어 있다 - ${1 in numList}")
    println("2가 numList에 포함되어 있다 - ${2 in numList}")
    println("3이 numList에 포함되어 있다 - ${3 in numList}")
    println("3이 numList에 포함되어 있지 않다 - ${3 !in numList}")
    println("numList의 0번 인덱스의 값은? ${numList[0]}")

    // 연산자 오버로딩
    val kotlinMoney1 = KotlinMoeny(1000);
    val kotlinMoney2 = KotlinMoeny(2000)
    println(kotlinMoney1 + kotlinMoney2)
}