import java.util.*;

public class Reto4 {
    
    public static Hashtable<String, Integer> poblarMapa(List<Map.Entry<String, Integer>> pares) {
        Hashtable<String, Integer> mapa = new Hashtable<>();
        for (Map.Entry<String, Integer> par : pares) {
            if (!mapa.containsKey(par.getKey())) {
                mapa.put(par.getKey(), par.getValue());
            }
        }
        return mapa;
    }
    
    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> paresTabla = Arrays.asList(
            Map.entry("plata", 8),
            Map.entry("rubí", 4),
            Map.entry("oro", 12),
            Map.entry("esmeralda", 6)
        );
        
        Hashtable<String, Integer> resultado = poblarMapa(paresTabla);
        System.out.println("Hashtable: " + resultado);
    }
}
