package operator;

public class OperatorInKotlin {
    public static void main(String[] args) {
        JavaMoney javaMoney1 = new JavaMoney(10000);
        JavaMoney javaMoney2 = new JavaMoney(20000);

        int result = javaMoney1.compareTo(javaMoney2);
    }
}
