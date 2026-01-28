 import java.util.function.Function;
import java.util.stream.IntStream;

//Clase del reto3 usando StringBuilder que implementa un mensaje usando streams y una exprecion lambda
//@autor Juan angel salas
 
public class Reto3 {
 // Replica un mensaje tres veces, separándolo con espacios.
 //Utiliza StringBuilder para optimizar la concatenación de cadenas
 //y un IntStream para realizar la iteración de forma funcional.
 //@param mensaje 
 //@return una cadena 3 veces 
 
    public static String transformar(String mensaje) {
        StringBuilder menB = new StringBuilder();
        IntStream.range(0, 3)
                .forEach(i -> {
                    if (i > 0) menB.append(" ");
                    menB.append(mensaje);
 
                });
        return menB.toString();
    }
 //Metodo main para la representacion del mensaje trasformado mediante una exprecion lambda
    public static void main(String[] args) {
 
        Function<String, String> f = msg -> Reto3.transformar(msg);
        System.out.println(f.apply("Hola"));
 
 
    }
}
