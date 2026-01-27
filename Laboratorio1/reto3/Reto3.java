import java.util.stream.IntStream;
import java.util.function.Function;

public class Reto3 {
    public static String transformar(String mensaje) {
        StringBuffer menB = new StringBuffer();
        IntStream.range(0, 3)
                .forEach(inti -> {
                    if (i > 0) menB.append(" ");
                    menB.append(mensaje);
                });
        return menB.toString();
    }
    public static void main(String[] args) {
        Function<String, String> f = (String msg -> Reto3.transformar(msg);
        System.out.println(f.apply("Hola"));
    }
}
