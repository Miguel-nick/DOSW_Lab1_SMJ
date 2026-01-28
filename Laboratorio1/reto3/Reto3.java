import java.util.function.Function;
import java.util.stream.IntStream;

public class Reto3 {

    /**
     * Repite el mensaje 3 veces separado por espacios.
     * Implementación usando StringBuilder.
     *
     * @param mensaje Texto de entrada
     * @return Mensaje repetido 3 veces
     */
    public static String transformar(String mensaje) {
        StringBuilder builder = new StringBuilder();

        IntStream.range(0, 3).forEach(i -> {
            if (i > 0) {
                builder.append(" ");
            }
            builder.append(mensaje);
        });

        return builder.toString();
    }

    /**
     * Invierte el mensaje recibido.
     * Implementación usando StringBuffer.
     *
     * @param mensaje Texto de entrada
     * @return Mensaje invertido
     */
    public static String invertir(String mensaje) {
        StringBuffer buffer = new StringBuffer(mensaje);
        return buffer.reverse().toString();
    }

    public static void main(String[] args) {
        Function<String, String> repetir = Reto3::transformar;
        Function<String, String> invertir = Reto3::invertir;

        System.out.println(repetir.apply("Hola"));
        System.out.println(invertir.apply("Hola"));
    }
}
