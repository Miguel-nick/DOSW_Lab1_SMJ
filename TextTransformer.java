import java.util.stream.IntStream;

@FunctionalInterface
interface MessageFunction {
    String apply(String msg);
}

public class reto3 {

    // Método 1: invierte el mensaje usando StringBuffer

    public static String mensajeReves(String message) {
        return new StringBuffer(message).reverse().toString();
    }

    //combina transformaciones

    public static String transformado(String message) {
        String repeated = IntStream.range(0, 3)
                .mapToObj(i -> message)
                .reduce("", String::concat);

        return reverseMessage(repeated);
    }

    public static void main(String[] args) {
        MessageFunction fn = msg -> transformado(msg);
        System.out.println(fn.apply("Hola"));
    }
}
