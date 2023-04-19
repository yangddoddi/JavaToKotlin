package variable

class VariableInKotlin {
    var number1 = 10L;
    val number2 = 10L;
    // 실행 시에는 Primitive Type으로 동작하나 코드 작성 시에는 클래스로 취급됨
    val number3 : Long = 10L;

    fun temp() {
        number1 = 20L;

        // 초기값을 지정하지 않으려면 타입 명시 필수
        var number4 : Long;
        val number5 : Long;

        number4 = 20L;

        // 최초 1회는 val도 값을 부여할 수 있음
        number5 = 20L;

        // nullable
        var number6 : Long? = 10L;
        number6 = null;

        // new가 필요 없음
        var person = Person("yang");
    }

    class Person(name : String) {
        val name:String = name;
    }
}