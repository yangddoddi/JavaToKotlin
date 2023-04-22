package function

fun main() {
    println(getMax(1, 2))

    println(repeat("바보"))

    // named argument
    // 특정 default parameter만 값 지정 가능
    println(repeat("바보", useNewLine = false))

    // named arguement
    // default parameter 아니여도 가능 ㅎㅎ
    // 단, 자바에서는 named argument를 사용할 수 없다.
    println(printGenderAndName(gender = "남성", name = "양은찬"))

    // 가변인자
    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    // 스프레드 연산자
    printAll(*array)
}

// 코틀린에서 함수는 중괄호 없이 =으로 표현 가능하다
fun getMax(a : Int, b : Int) : Int =
    if (a > b) {
        a
    } else {
        b
    }

fun getMax2(a : Int, b : Int) = if ( a > b ) a else b

// default parameter
fun repeat(str : String,
           num : Int = 3,
           useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            println(str)
        }
    }
}

fun printGenderAndName(gender: String, name: String) {
    println(gender);
    print(name);
}

// 가변 인자
fun printAll(vararg strings : String) {
    for (str in strings)
        print(str)
}