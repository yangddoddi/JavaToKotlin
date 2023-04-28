package classes;

public class JavaPerson {
    private final String name;
    private int age;

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;

        if (this.age <= 0) throw new IllegalArgumentException("나이는 0세 미만일 수 없습니다");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
