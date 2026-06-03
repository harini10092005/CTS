interface Printable {

    void print();
}

public class InterfaceImplementation implements Printable {

    public void print() {
        System.out.println("Printing...");
    }

    public static void main(String[] args) {

        InterfaceImplementation obj =
                new InterfaceImplementation();

        obj.print();
    }
}