record Person(String name, int age) {}

public class PersonRecord {
    public static void main(String[] args) {

        Person p = new Person("John", 25);

        System.out.println(p.name());
        System.out.println(p.age());
    }
}