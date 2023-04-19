package conditional

// Unit == void 생략 가능
fun validateScoreIsNotNegative(score : Int) :Unit {
    if (score < 0) {
        throw java.lang.IllegalArgumentException("${score}이 0보다 작을 수 없음")
    }
}

// Statement : 프로그램의 문장, 하나의 값으로 도출되지 않음
// Expression : 하나의 값으로 도출되는 문장
// int score = 30 + 40 -> Expression + Statement

// 코틀린의 if else문은 Expression
// 코틀린은 삼항연산자가 없음
fun getPassOrFail(score : Int) :String {
    return if (score > 50) {
        "Pass"
    } else {
        "Fail"
    }
}

fun getGrade(score : Int) :String {
    return if (score > 90) {
        "A"
    } else if (score > 80) {
        "B"
    } else if (score > 70) {
        "C"
    } else {
        "F"
    }
}

fun validateScoreRange(score : Int) :Boolean {
    if (score !in 0..100) {
        throw java.lang.IllegalArgumentException()
    }

    return false
}

// 여러 분기를 사용 가능하다

fun getGradeWithSwitch(score : Int) :String {
    return when (score) {
        100 -> "A+"
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "F"
    }
}

// is도 사용 가능함
fun startsWithA(str : Any) :Boolean {
    return when (str) {
        is String -> str.startsWith("A")
        else -> false
    }
}

// 여러 조건 동시에 사용 가능
fun judgeNumber(num : Int) {
    return when (num) {
        1, 0, -1 -> println("히히")
        else -> println("호호")
    }
}

// () 없이 유연하게 사용 가능
fun judgeNumber2(num : Int) {
    when {
        num == 0 -> println("0")
        num % 2 == 0 -> println("짝수")
        else -> println("홀수")
    }
}