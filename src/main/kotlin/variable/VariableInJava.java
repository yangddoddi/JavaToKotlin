package variable;

public class VariableInJava {
    long number1 = 10L;
    final long number2 = 10L;
    Long number3 = 1_000L;
    Person person = new Person("yang");

    class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }
    }
}
