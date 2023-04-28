package fp_function

fun main() {
    3.add3(4)
}

// 함수를 파라미터로 전달할 때 오버헤드를 줄일 수 있다(function callchain)
// 성능 측정과 함께 신중하게 사용되어야 한다
inline fun Int.add3(other: Int): Int {
    return this + other
}