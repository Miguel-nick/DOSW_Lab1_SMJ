import java.util.*;

public class Reto4 {
    
    public static HashMap<String, Integer> poblarHashMap(List<Map.Entry<String, Integer>> pares) {
        HashMap<String, Integer> map = new HashMap<>();
        pares.stream()
                .forEach(p -> map.putIfAbsent(p.getKey(), p.getValue()));
        return map;
    }
    
    
    public static Hashtable<String, Integer> poblarHashtable(List<Map.Entry<String, Integer>> pares) {
        Hashtable<String, Integer> mapa = new Hashtable<>();
        for (Map.Entry<String, Integer> par : pares) {
            if (!mapa.containsKey(par.getKey())) {
                mapa.put(par.getKey(), par.getValue());
            }
        }
        return mapa;
    }
    
    public static void main(String[] args) {
        // Prueba HashMap
        List<Map.Entry<String, Integer>> entradaHashMap = Arrays.asList(
                Map.entry("oro", 5),
                Map.entry("plata", 3),
                Map.entry("oro", 7),
                Map.entry("diamante", 10)
        );
        HashMap<String, Integer> hm = poblarHashMap(entradaHashMap);
        System.out.println("HashMap: " + hm);
        
        // Prueba Hashtable
        List<Map.Entry<String, Integer>> entradaHashtable = Arrays.asList(
            Map.entry("plata", 8),
            Map.entry("rubí", 4),
            Map.entry("oro", 12),
            Map.entry("esmeralda", 6)
        );
        Hashtable<String, Integer> ht = poblarHashtable(entradaHashtable);
        System.out.println("Hashtable: " + ht);
    }
}
