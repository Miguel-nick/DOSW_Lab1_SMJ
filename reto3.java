import java.util.stream.IntStream;

public class reto3 {

    public static String reverseMessage(String message) {
        return new StringBuffer(message).reverse().toString();
    }

    public static String transformMessage(String message) {
        String repeated = IntStream.range(0, 3)
                .mapToObj(i -> message)
                .reduce("", String::concat);

        return reverseMessage(repeated);
    }

    public static void main(String[] args) {
        System.out.println(transformMessage("Hola"));
    }
}
