import java.util.stream.IntStream;
import java.util.function.Function;
//Clase que muestra la estructura del reto3 pero con el uso de StringBuffer
//@autor Miguel Angel Sandoval

public class Reto3 {

    //Trasforma un mensaje repitiendolo tres veces separado por espacios
    //@param mensaje
    //@return una cadena del mensaje 3 veces
    public static String transformar(String mensaje) {
        StringBuffer menB = new StringBuffer();
        IntStream.range(0, 3)
                .forEach(inti -> {
                    if (i > 0) menB.append(" ");
                    menB.append(mensaje);
                });
        return menB.toString();
    }

    //Metodo principal que imprime la palabra
    public static void main(String[] args) {
        //Define una funcion que aplica la trasformacio 
        Function<String, String> f = (String msg -> Reto3.transformar(msg);
        System.out.println(f.apply("Hola"));
    }
}
