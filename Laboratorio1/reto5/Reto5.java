import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Reto5 {

    /**
     * Estudiante A (HashSet): elimina múltiplos de 3.
     */
    public static Set<Integer> ordenA(Set<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    /**
     * Estudiante B (TreeSet): elimina múltiplos de 5 y mantiene orden ascendente.
     */
    public static Set<Integer> ordenB(Set<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    /**
     * Choque: une ambas colecciones en una estructura ordenada (TreeSet),
     * elimina duplicados e imprime con lambda.
     */
    public static Set<Integer> choque(Set<Integer> hashSetA, Set<Integer> treeSetB) {
        TreeSet<Integer> union = new TreeSet<>();
        union.addAll(hashSetA);
        union.addAll(treeSetB);

        union.forEach(n -> System.out.println("Número en arena: " + n));
        return union;
    }

    public static void main(String[] args) {

        Set<Integer> hashSetEjemplo = new HashSet<>(Set.of(4, 9, 15, 7, 18, 21, 10, 5));
        Set<Integer> treeSetEjemplo = new TreeSet<>(Set.of(12, 3, 25, 10, 7, 30, 18, 4));


        Set<Integer> a = ordenA(hashSetEjemplo);
        Set<Integer> b = ordenB(treeSetEjemplo);


        Set<Integer> resultadoFinal = choque(a, b);


        // System.out.println("Unión: " + resultadoFinal);
    }
}

