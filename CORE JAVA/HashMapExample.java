import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map =
                new HashMap<>();

        map.put(1, "Alice");
        map.put(2, "Bob");

        System.out.println(map);
    }
}