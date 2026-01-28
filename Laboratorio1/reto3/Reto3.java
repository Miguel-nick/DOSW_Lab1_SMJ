import java.util.function.Function;

public class Reto3 {
    /**
     * Método transformar (Estudiante B)
     * Usa StringBuffer para invertir el mensaje recibido.
     *
     * @param mensaje Texto de entrada
     * @return Texto invertido
     */
    public static String transformar(String mensaje) {
        StringBuffer buffer = new StringBuffer(mensaje);
        return buffer.reverse().toString();
    }
    public static void main(String[] args) {
        Function<String, String> f = msg -> Reto3.transformar(msg);
        System.out.println(f.apply("Hola"));
    }
}
