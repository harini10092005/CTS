public class PatternMatchingSwitch {
    public static void main(String[] args) {

        Object obj = "Hello";

        switch(obj) {

            case String s ->
                    System.out.println("String: " + s);

            default ->
                    System.out.println("Unknown");
        }
    }
}