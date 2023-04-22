package loop

fun printNum() {
    val list: List<Int> = arrayListOf(1, 2, 3)

    // in을 사용
    for (num in list)
        println(num)
}

fun printNum2() {
    for (i in 1..3)
        print(i)
}

// 역으로 내려갈 경우 downTo
fun printNum3() {
    for (i in 3 downTo 1)
        print(i)
}

// 2씩 증가할 경우?
fun printNum4() {
    for (i in 1..3 step 2)
        print(i)
}

// .. 연산자 -> 범위 (IntRange 클래스)
// in 1..3 -> 1부터 3까지의 등차수열
// 3 downTo 1 : 시작값 3, 끝값 1, 공차가 -1인 등차수열
// 1..5 step 2 : 시작값 1, 끝값 5, 공차가 2인 등차수열

fun printNum5() {
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}