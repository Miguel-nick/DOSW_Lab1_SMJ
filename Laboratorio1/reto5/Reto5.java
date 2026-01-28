import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Reto5 {

    /**
     * Genera un conjunto de números aleatorios y devuelve el resultado en orden ascendente.
     * <p>
     * Implementación del Estudiante B: usa {@link TreeSet} (orden natural) y elimina múltiplos de 5
     * usando {@code stream().filter()}.
     * <p>
     * Además imprime cada número con una lambda.
     *
     * @param cantidad cantidad de números únicos a generar
     * @param minIncl  límite inferior inclusivo
     * @param maxIncl  límite superior inclusivo
     * @return conjunto ordenado ascendente sin múltiplos de 5
     * @throws IllegalArgumentException si cantidad es negativa o el rango es inválido
     */
    public static Set<Integer> orden(int cantidad, int minIncl, int maxIncl) {
        if (cantidad < 0) throw new IllegalArgumentException("cantidad no puede ser negativa");
        if (minIncl > maxIncl) throw new IllegalArgumentException("minIncl no puede ser mayor que maxIncl");

        Random rnd = new Random();
        TreeSet<Integer> tree = new TreeSet<>();

        while (tree.size() < cantidad) {
            int n = rnd.nextInt(maxIncl - minIncl + 1) + minIncl;
            tree.add(n);
        }

        Set<Integer> filtrado = tree.stream()
                .filter(x -> x % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));

        filtrado.forEach(n -> System.out.println("Número en arena: " + n));
        return filtrado;
    }
    public static void main(String[] args) {
        Set<Integer> resultado = orden(15, 1, 50);
        System.out.println("Conjunto final: " + resultado);
    }

}

