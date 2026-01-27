import java.util.*;

public class Reto4 {

    // Método HashMap usando Map.Entry (igual que Sebastian)
    public static HashMap<String, Integer> poblarMapa(List<Map.Entry<String, Integer>> pares) {
        HashMap<String, Integer> map = new HashMap<>();
        pares.stream()
                .forEach(p -> map.putIfAbsent(p.getKey(), p.getValue()));
        return map;
    }
    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> entrada = Arrays.asList(
                Map.entry("oro", 5),
                Map.entry("plata", 3),
                Map.entry("oro", 7),
                Map.entry("diamante", 10)
        );

        HashMap<String, Integer> hm = poblarMapa(entrada);
        System.out.println("HashMap: " + hm);
    }
}