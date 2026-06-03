interface Message {

    void sayHello();
}

public class LambdaExpressions {
    public static void main(String[] args) {

        Message msg = () ->
                System.out.println("Hello Lambda");

        msg.sayHello();
    }
}