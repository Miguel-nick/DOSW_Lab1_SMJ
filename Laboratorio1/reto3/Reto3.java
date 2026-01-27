 import java.util.function.Function;
import java.util.stream.IntStream;
 
public class Reto3 {
 
    public static String transformar(String mensaje) {
        StringBuilder menB = new StringBuilder();
        IntStream.range(0, 3)
                .forEach(i -> {
                    if (i > 0) menB.append(" ");
                    menB.append(mensaje);
 
                });
        return menB.toString();
    }
 
    public static void main(String[] args) {
 
        Function<String, String> f = msg -> Reto3.transformar(msg);
        System.out.println(f.apply("Hola"));
 
 
    }
}
