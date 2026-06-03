class Student {

    int id;
}

public class ReflectionExample {

    public static void main(String[] args) {

        Student s = new Student();

        Class c = s.getClass();

        System.out.println(
                "Class Name: " + c.getName());
    }
}