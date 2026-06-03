public class StudentDAO {

    int id;
    String name;

    // Constructor
    StudentDAO(int id, String name) {

        this.id = id;
        this.name = name;
    }

    // Display Method
    void display() {

        System.out.println(
                "ID: " + id);

        System.out.println(
                "Name: " + name);
    }

    // Main Method
    public static void main(String[] args) {

        StudentDAO s =
                new StudentDAO(1, "Alice");

        s.display();
    }
}