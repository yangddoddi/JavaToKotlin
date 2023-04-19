package types;

import nullable.Person;

public class TypeInJava {
    public static void printNameIfPerson(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getName());
        }
    }
}
