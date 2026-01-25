import java.util.List;

public class CarreraParalela {

    public static class Resultado {
        int maximo;
        int minimo;
        long cantidad;
        boolean maximoEsMultiploDe2;
        boolean maximoEsDivisorDe2;  
        boolean cantidadEsPar;
        boolean cantidadEsImpar;     

        @Override
        public String toString() {
            return "Resultado{" +
                    "maximo=" + maximo +
                    ", minimo=" + minimo +
                    ", cantidad=" + cantidad +
                    ", maximoEsMultiploDe2=" + maximoEsMultiploDe2 +
                    ", maximoEsDivisorDe2=" + maximoEsDivisorDe2 +
                    ", cantidadEsPar=" + cantidadEsPar +
                    ", cantidadEsImpar=" + cantidadEsImpar +
                    '}';
        }
    }

    public static Resultado combinarResultados(List<Integer> lista) {
        Resultado res = new Resultado();

        if (lista == null || lista.isEmpty()) {
            res.maximo = 0;
            res.minimo = 0;
            res.cantidad = 0;
            res.maximoEsMultiploDe2 = false;
            res.maximoEsDivisorDe2 = false;
            res.cantidadEsPar = true;  // 0 es par
            res.cantidadEsImpar = false;
            return res;
        }

        res.maximo = lista.stream().max(Integer::compareTo).orElse(0);
        res.minimo = lista.stream().min(Integer::compareTo).orElse(0);
        res.cantidad = lista.size();


        res.maximoEsMultiploDe2 = (res.maximo % 2 == 0) ? true : false;

        res.maximoEsDivisorDe2 = (res.maximo != 0) ? (2 % res.maximo == 0) : false;

        res.cantidadEsPar = (res.cantidad % 2 == 0) ? true : false;

        res.cantidadEsImpar = (res.cantidad % 2 != 0) ? true : false;

        return res;
    }

    public static void main(String[] args) {
        // Probar con DOS listas
        List<Integer> lista1 = List.of(45, 33, 345, 78, 7);
        List<Integer> lista2 = List.of(10, 20, 30, 40);

        System.out.println("Lista 1: " + combinarResultados(lista1));
        System.out.println("Lista 2: " + combinarResultados(lista2));
    }
}
