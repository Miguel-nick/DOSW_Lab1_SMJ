
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// clase reto5 para la batalla de conjuntos
// uso de HashSet y se eliminan multiplos de 3
// @autor Miguel Angel Sandoval

public class Reto5 {

     // Método orden
     // Recibe un HashSet de números y elimina los múltiplos de 3
     // usando stream().filter()
     // @param numeros HashSet de números enteros
     // @return HashSet sin múltiplos de 3
     
    public static Set<Integer> orden(Set<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet());
    }

     // Método principal
     // Ejecuta el reto 
    public static void main(String[] args) {

        int[] x = { /* N valores */ };
        Set<Integer> hashSet = new HashSet<>();
        for (int num : x) {
            hashSet.add(num);
        }
        Set<Integer> resultado = orden(hashSet);

        // impresión usando lambda
        resultado.forEach(n ->
                System.out.println("Número en arena: " + n)
        );
    }
}

