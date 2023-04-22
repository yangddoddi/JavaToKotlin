package function;

public class FunctionInJava {
    public static void main(String[] args) {

    }

    public int max(int a, int b) {
        if (a > b) return a;

        return b;
    }

    public void repeat(String str, int num, Boolean useNewLine) {
        for (int i = 1; i <= num; i++) {
            if (useNewLine) {
                System.out.println(str);
            } else {
                System.out.println(str);
            }
        }
    }

    public void repeat(String str, int num) {
        repeat(str, num, true);
    }

    public void repeat(String str) {
        repeat(str, 3, true);
    }
}
