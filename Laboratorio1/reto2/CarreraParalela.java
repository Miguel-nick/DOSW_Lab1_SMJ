import java.util.List;

public class CarreraParalela {

    public static class Resultado {
        int maximo;
        int minimo;
        long cantidad;
        boolean esDivisorDe2; 

        @Override
        public String toString() {
            return "Resultado{" +
                    "maximo=" + maximo +
                    ", minimo=" + minimo +
                    ", cantidad=" + cantidad +
                    '}';
        }
    }

    public static Resultado combinarResultados(List<Integer> lista) {
        Resultado res = new Resultado();

        if (lista == null || lista.isEmpty()) {
            res.maximo = 0;
            res.minimo = 0;
            res.cantidad = 0;
            return res;
        }

        res.maximo = lista.stream().max(Integer::compareTo).orElse(0);
        res.minimo = lista.stream().min(Integer::compareTo).orElse(0);
        res.cantidad = lista.size();

        res.esDivisorDe2 = (res.maximo != 0) ? (2 % res.maximo == 0) : false;

        return res;
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(45, 33, 345, 78, 7);
        System.out.println(combinarResultados(arr));
    }
}