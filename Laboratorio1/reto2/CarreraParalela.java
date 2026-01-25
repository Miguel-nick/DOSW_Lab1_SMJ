import java.util.List;

public class CarreraParalela {

    public static class Resultado {
        int maximo;
        int minimo;
        long cantidad;
        boolean maximoEsMultiploDe2;
        boolean cantidadEsPar;

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

            // ternario (cumplir enunciado)
            res.maximoEsMultiploDe2 = (res.maximo % 2 == 0) ? true : false;
            res.cantidadEsPar = (res.cantidad % 2 == 0) ? true : false;

            return res;
        }

        res.maximo = lista.stream().max(Integer::compareTo).orElse(0);
        res.minimo = lista.stream().min(Integer::compareTo).orElse(0);
        res.cantidad = lista.size();

        //  Segunda vuelta
        res.maximoEsMultiploDe2 = (res.maximo % 2 == 0) ? true : false;

        //  Tercer choque
        res.cantidadEsPar = (res.cantidad % 2 == 0) ? true : false;

        return res;


    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(45, 33, 345, 78, 7);
        System.out.println(combinarResultados(arr));
    }
}