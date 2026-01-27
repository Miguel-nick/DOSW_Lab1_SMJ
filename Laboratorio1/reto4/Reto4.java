import java.util.HashMap;
import java.util.List;

public class Reto4 {


    public static class Par {
        private final String key;
        private final Integer value;

        public Par(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() { return key; }
        public Integer getValue() { return value; }
    }

    /**
     *
     * Recibe una lista de pares (String, Integer) y los almacena en un HashMap
     * ignorando claves duplicadas (se conserva el primer valor encontrado).
     */
    public static HashMap<String, Integer> poblarMapa(List<Par> pares) {
        HashMap<String, Integer> map = new HashMap<>();


        pares.stream()
                .forEach(p -> map.putIfAbsent(p.getKey(), p.getValue()));

        return map;
    }
    public static void main(String[] args) {
        List<Par> entrada = List.of(
                new Par("oro", 5),
                new Par("plata", 3),
                new Par("oro", 7),
                new Par("diamante", 10)
        );

        HashMap<String, Integer> hm = poblarMapa(entrada);
        System.out.println("HashMap (sin duplicados, se queda con el primero): " + hm);


    }
}
