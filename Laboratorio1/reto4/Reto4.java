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
    
    public static Map<String, Integer> combinarMapas(HashMap<String, Integer> hashMap, 
                                                       Hashtable<String, Integer> hashtable) {
        Map<String, Integer> combinado = new HashMap<>(hashMap);
        
        hashtable.forEach((key, value) -> combinado.put(key, value));
        
        return combinado;
    }

    public static void imprimirMayusculas(Map<String, Integer> mapa) {
        System.out.println("=== Mapa con claves en MAYÚSCULAS ===");
        mapa.forEach((key, value) ->
                System.out.println("Clave: " + key.toUpperCase() + " | Valor: " + value)
        );
    }
    
    public static void imprimirOrdenado(Map<String, Integer> mapa) {
        System.out.println("=== Mapa ordenado por clave (ascendente) ===");
        mapa.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println("Clave: " + entry.getKey() + 
                                                     " | Valor: " + entry.getValue()));
    }

    public static void procesarYMostrarTesoro(HashMap<String, Integer> hashMap, 
                                               Hashtable<String, Integer> hashtable) {
        System.out.println("\n=== TESORO FINAL (combinado, mayúsculas, ordenado) ===");
        

        Map<String, Integer> tesoroFinal = Stream.concat(
                hashMap.entrySet().stream(),
                hashtable.entrySet().stream()
        )
        .collect(Collectors.toMap(
                entry -> entry.getKey().toUpperCase(),  
                Map.Entry::getValue,                     
                (v1, v2) -> v2,                         
                TreeMap::new                             
        ));
        
    
        tesoroFinal.forEach((key, value) -> 
            System.out.println("Clave: " + key + " | Valor: " + value)
        );
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
        
        Map<String, Integer> resultado = combinarMapas(hm, ht);
        System.out.println("Combinado (prioridad Hashtable): " + resultado);
        
        imprimirMayusculas(resultado);
        imprimirOrdenado(resultado);

        procesarYMostrarTesoro(hm, ht);
    }

}
