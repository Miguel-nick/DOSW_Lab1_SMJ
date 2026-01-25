import java.util.Arrays;
import java.util.List;

public class CarreraParalela {

    public static void main(String[] args) {

        System.out.println("Carrera en Paralelo ");

        List<Integer> numeros = Arrays.asList(5, 12, 3, 89, 45, 23);

        Integer max = numeros.stream()

                .max((a, b) -> a.compareTo(b))

                .orElse(0);

        System.out.println("Numero mas grande (Carril 1): " + max);

        Integer min = numeros.stream()
            .min((a, b) -> a.compareTo(b))
            .orElse(0);
        
        long cantidad = numeros.stream().count();
        
        System.out.println("Número más pequeño (Carril 2): " + min);
        System.out.println("Cantidad de datos ingresados: " + cantidad);
    }

    public static Resultado combinarResultados(List<Integer> lista) {
    Resultado res = new Resultado();
    res.minimo = lista.stream().min((a, b) -> a.compareTo(b)).orElse(0);
    res.cantidad = lista.stream().count();

    return res;
    }

    static class Resultado {
        int maximo;
        int minimo;
        long cantidad;
    }

}
 