package nullable;

public class NullableInJava {

    // NPE 발생 가능성이 있는 상태
    public boolean startsWithA(String str) {
        return str.startsWith("A");
    }

    public boolean startsWithA1(String str) {
        if (str == null) throw new IllegalArgumentException("null");

        return str.startsWith("A");
    }

    public boolean startsWithA2(String str) {
        if (str == null) return false;

        return str.startsWith("A");
    }

    public Boolean startsWithA3(String str) {
        if (str == null) return null;

        return str.startsWith("A");
    }
}
